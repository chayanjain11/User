package com.User.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Identity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int identityId;

    private String panNumber;

    private String aadharNumber;

    private String phoneNumber;

    
    public int getIdentityId() {
        return identityId;
    }



	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
 
	
	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setIdentityId(int identityId) {
		this.identityId = identityId;
	}

}
