package com.phonebook.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phonebook.entity.Contact;

@Repository
public interface ContactRepo extends JpaRepository<Contact, Serializable>{

}
