package com.phonebook.app.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserInfo {

	@Id
	@GeneratedValue
	private int id;
	private String firstName;
	private String lastName;
	private String emailId;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = UserContact.class)
	@JoinColumn(name = "user_fk", referencedColumnName = "id")
	private UserContact contact;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public UserContact getContact() {
		return contact;
	}

	public void setContact(UserContact contact) {
		this.contact = contact;
	}

}
