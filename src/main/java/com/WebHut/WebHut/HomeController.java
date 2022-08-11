package com.WebHut.WebHut;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
	@RequestMapping("/")
    public String visitHome() {
 
        // do something before returning view name
 
        return "home";
    }
}
