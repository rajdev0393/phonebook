package com.phonebook.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phonebook.app.model.UserContact;

@Repository
public interface UserContactRepository extends JpaRepository<UserContact, Integer> {

}
