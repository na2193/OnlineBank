package com.gmail.nasimahmed28.model;

public class Account 
{
	private int accountID, accountTypeID;
	private String openDate, closeDate, Status;
        private String emailID;
	
	public Account()
	{
		
	}
	
	public Account(int accountID, String emailID, int accountTypeID,
			String openDate, String closeDate, String status) {
		super();
		this.accountID = accountID;
		this.emailID = emailID;
		this.accountTypeID = accountTypeID;
		this.openDate = openDate;
		this.closeDate = closeDate;
		Status = status;
	}



	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public int getAccountTypeID() {
		return accountTypeID;
	}

	public void setAccountTypeID(int accountTypeID) {
		this.accountTypeID = accountTypeID;
	}

	public String getOpenDate() {
		return openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}

	public String getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
}
