/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author KaiNiYam
 */
@Entity
@Table(name = "PAYMENTHISTORY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paymenthistory.findAll", query = "SELECT p FROM Paymenthistory p"),
    @NamedQuery(name = "Paymenthistory.findByPaymentId", query = "SELECT p FROM Paymenthistory p WHERE p.paymentId = :paymentId"),
    @NamedQuery(name = "Paymenthistory.findByCost", query = "SELECT p FROM Paymenthistory p WHERE p.cost = :cost"),
    @NamedQuery(name = "Paymenthistory.findByPreCost", query = "SELECT p FROM Paymenthistory p WHERE p.preCost = :preCost")})
public class Paymenthistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PAYMENT_ID")
    private Integer paymentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COST")
    private int cost;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRE_COST")
    private int preCost;
    @JoinColumn(name = "DEBTS_DEBT_ID", referencedColumnName = "DEBT_ID")
    @ManyToOne
    private Debts debtsDebtId;

    public Paymenthistory() {
    }

    public Paymenthistory(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Paymenthistory(Integer paymentId, int cost, int preCost) {
        this.paymentId = paymentId;
        this.cost = cost;
        this.preCost = preCost;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getPreCost() {
        return preCost;
    }

    public void setPreCost(int preCost) {
        this.preCost = preCost;
    }

    public Debts getDebtsDebtId() {
        return debtsDebtId;
    }

    public void setDebtsDebtId(Debts debtsDebtId) {
        this.debtsDebtId = debtsDebtId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentId != null ? paymentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paymenthistory)) {
            return false;
        }
        Paymenthistory other = (Paymenthistory) object;
        if ((this.paymentId == null && other.paymentId != null) || (this.paymentId != null && !this.paymentId.equals(other.paymentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Paymenthistory[ paymentId=" + paymentId + " ]";
    }
    
}
