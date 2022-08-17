package com.WebHut.WebHut;

import java.util.ArrayList;

import java.util.*;

public class ContactBusiness {

	public List<Contact> getContactList() {
        List<Contact> listContact = new ArrayList<>();
         
        listContact.add(new Contact("Mustafa", "Sharifi", "contact@business.com", "(303) 333-4444"));
        
         
        return listContact;
    }
}
