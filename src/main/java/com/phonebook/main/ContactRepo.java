package com.phonebook.main;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ContactRepo extends JpaRepository<Contact, Serializable>{

}
