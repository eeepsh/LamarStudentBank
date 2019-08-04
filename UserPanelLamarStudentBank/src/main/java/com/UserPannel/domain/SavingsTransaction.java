/**
 * 
 */
package com.UserPannel.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author deepasapkota
 *
 */
@Entity
public class SavingsTransaction {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Date date;
	private String description;
	private String type;
	private String status;
	private double amount;
	private BigDecimal availableBalance;     //BigDecimal represents floating number that is immutable
	
	@ManyToOne
	@JoinColumn(name = "saving_account_id")
	private SavingsAccount savingsAccount;
	
	
	public SavingsTransaction() {
		
	}


	/**
	 * @param date
	 * @param description
	 * @param type
	 * @param status
	 * @param amount
	 * @param availabeBalance
	 * @param savingAccount
	 */
	public SavingsTransaction(Date date, String description, String type, String status, double amount,
			BigDecimal availableBalance, SavingsAccount savingsAccount) {
		super();
		this.date = date;
		this.description = description;
		this.type = type;
		this.status = status;
		this.amount = amount;
		this.availableBalance = availableBalance;
		this.savingsAccount = savingsAccount;
	}


	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}


	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}


	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}


	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}


	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}


	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}


	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}


	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}


	/**
	 * @return the availabeBalance
	 */
	public BigDecimal getAvailableBalance() {
		return availableBalance;
	}


	/**
	 * @param availabeBalance the availabeBalance to set
	 */
	public void setAvailableBalance(BigDecimal availabeBalance) {
		this.availableBalance = availabeBalance;
	}


	/**
	 * @return the savingAccount
	 */
	public SavingsAccount getSavingAccount() {
		return savingsAccount;
	}


	/**
	 * @param savingAccount the savingAccount to set
	 */
	public void setSavingAccount(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}
	
	
	
	
	

}
