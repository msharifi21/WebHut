package com.WebHut.WebHut;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class AppController {
     
    @RequestMapping("/list_contact")
    public String listContact(Model model) {
         
        ContactBusiness business = new ContactBusiness();
        List<Contact> contactList = business.getContactList();
         
        model.addAttribute("contacts", contactList);       
         
        return "contact";
    }
}
