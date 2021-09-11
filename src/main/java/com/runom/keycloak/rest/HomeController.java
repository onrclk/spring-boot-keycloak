package com.runom.keycloak.rest;

import java.security.Principal;

import javax.annotation.security.RolesAllowed;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = { "/","/home"})
    public String homepage(Principal principal, Model model){
        return "index.html";
    }

    @RolesAllowed("visitor")
    @RequestMapping("/books")
    public String books(Principal principal, Model model){
        return "books.html";
    }

}
