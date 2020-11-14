/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityController;

import Entity.Paiddebts;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Entity.Users;
import EntityController.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author GuideKai
 */
public class PaiddebtsJpaController implements Serializable {

    public PaiddebtsJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Paiddebts paiddebts) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Users usersId = paiddebts.getUsersId();
            if (usersId != null) {
                usersId = em.getReference(usersId.getClass(), usersId.getId());
                paiddebts.setUsersId(usersId);
            }
            em.persist(paiddebts);
            if (usersId != null) {
                usersId.getPaiddebtsList().add(paiddebts);
                usersId = em.merge(usersId);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Paiddebts paiddebts) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Paiddebts persistentPaiddebts = em.find(Paiddebts.class, paiddebts.getPaidId());
            Users usersIdOld = persistentPaiddebts.getUsersId();
            Users usersIdNew = paiddebts.getUsersId();
            if (usersIdNew != null) {
                usersIdNew = em.getReference(usersIdNew.getClass(), usersIdNew.getId());
                paiddebts.setUsersId(usersIdNew);
            }
            paiddebts = em.merge(paiddebts);
            if (usersIdOld != null && !usersIdOld.equals(usersIdNew)) {
                usersIdOld.getPaiddebtsList().remove(paiddebts);
                usersIdOld = em.merge(usersIdOld);
            }
            if (usersIdNew != null && !usersIdNew.equals(usersIdOld)) {
                usersIdNew.getPaiddebtsList().add(paiddebts);
                usersIdNew = em.merge(usersIdNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = paiddebts.getPaidId();
                if (findPaiddebts(id) == null) {
                    throw new NonexistentEntityException("The paiddebts with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Paiddebts paiddebts;
            try {
                paiddebts = em.getReference(Paiddebts.class, id);
                paiddebts.getPaidId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The paiddebts with id " + id + " no longer exists.", enfe);
            }
            Users usersId = paiddebts.getUsersId();
            if (usersId != null) {
                usersId.getPaiddebtsList().remove(paiddebts);
                usersId = em.merge(usersId);
            }
            em.remove(paiddebts);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Paiddebts> findPaiddebtsEntities() {
        return findPaiddebtsEntities(true, -1, -1);
    }

    public List<Paiddebts> findPaiddebtsEntities(int maxResults, int firstResult) {
        return findPaiddebtsEntities(false, maxResults, firstResult);
    }

    private List<Paiddebts> findPaiddebtsEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Paiddebts.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Paiddebts findPaiddebts(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Paiddebts.class, id);
        } finally {
            em.close();
        }
    }

    public int getPaiddebtsCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Paiddebts> rt = cq.from(Paiddebts.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
