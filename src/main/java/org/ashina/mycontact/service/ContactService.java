package org.ashina.mycontact.service;

import org.ashina.mycontact.entity.Contact;


public interface ContactService {

    Iterable<Contact> findAll();

}
