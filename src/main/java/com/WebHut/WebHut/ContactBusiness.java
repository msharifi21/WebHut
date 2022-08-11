package com.WebHut.WebHut;

import java.util.ArrayList;

import java.util.*;

public class ContactBusiness {

	public List<Contact> getContactList() {
        List<Contact> listContact = new ArrayList<>();
         
        listContact.add(new Contact("Mustafa", "Sharifi", "msharifi21@hotmail.com", "(720) 401-6227"));
        
         
        return listContact;
    }
}
