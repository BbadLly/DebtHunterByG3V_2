/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author KaiNiYam
 */
@Entity
@Table(name = "PAIDDEBTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paiddebts.findAll", query = "SELECT p FROM Paiddebts p"),
    @NamedQuery(name = "Paiddebts.findByPaidId", query = "SELECT p FROM Paiddebts p WHERE p.paidId = :paidId"),
    @NamedQuery(name = "Paiddebts.findByDate", query = "SELECT p FROM Paiddebts p WHERE p.date = :date"),
    @NamedQuery(name = "Paiddebts.findByPaidCost", query = "SELECT p FROM Paiddebts p WHERE p.paidCost = :paidCost"),
    @NamedQuery(name = "Paiddebts.findByPaidDescription", query = "SELECT p FROM Paiddebts p WHERE p.paidDescription = :paidDescription"),
    @NamedQuery(name = "Paiddebts.findByPaidMail", query = "SELECT p FROM Paiddebts p WHERE p.paidMail = :paidMail"),
    @NamedQuery(name = "Paiddebts.findByPaidName", query = "SELECT p FROM Paiddebts p WHERE p.paidName = :paidName")})
public class Paiddebts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PAID_ID")
    private Integer paidId;
    @Column(name = "DATE")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(name = "PAID_COST")
    private Integer paidCost;
    @Size(max = 255)
    @Column(name = "PAID_DESCRIPTION")
    private String paidDescription;
    @Size(max = 255)
    @Column(name = "PAID_MAIL")
    private String paidMail;
    @Size(max = 255)
    @Column(name = "PAID_NAME")
    private String paidName;
    @JoinColumn(name = "USERS_ID", referencedColumnName = "ID")
    @ManyToOne
    private Users usersId;

    public Paiddebts() {
    }

    public Paiddebts(Integer paidId) {
        this.paidId = paidId;
    }

    public Integer getPaidId() {
        return paidId;
    }

    public void setPaidId(Integer paidId) {
        this.paidId = paidId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getPaidCost() {
        return paidCost;
    }

    public void setPaidCost(Integer paidCost) {
        this.paidCost = paidCost;
    }

    public String getPaidDescription() {
        return paidDescription;
    }

    public void setPaidDescription(String paidDescription) {
        this.paidDescription = paidDescription;
    }

    public String getPaidMail() {
        return paidMail;
    }

    public void setPaidMail(String paidMail) {
        this.paidMail = paidMail;
    }

    public String getPaidName() {
        return paidName;
    }

    public void setPaidName(String paidName) {
        this.paidName = paidName;
    }

    public Users getUsersId() {
        return usersId;
    }

    public void setUsersId(Users usersId) {
        this.usersId = usersId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paidId != null ? paidId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paiddebts)) {
            return false;
        }
        Paiddebts other = (Paiddebts) object;
        if ((this.paidId == null && other.paidId != null) || (this.paidId != null && !this.paidId.equals(other.paidId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Paiddebts[ paidId=" + paidId + " ]";
    }
    
}
