package com.thym.heroku.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.thym.heroku.classes.Livre;

@Controller
public class MainController {
@GetMapping("")
public String accueil(Model m)
{
m.addAttribute("message","bienvenu");
return "index";
}
@PostMapping("")
public String liste(Model mod, @RequestParam String nom)
{
mod.addAttribute("name",nom);
return "affichage";
}
@GetMapping("/livre")
public String livres()
{
return "livres";	
}
@PostMapping("/livre")
public String create(Model m, @RequestParam String titre,String auteur,int prix)
{
Livre l=new Livre("teste","je teste",20);
m.addAttribute("livre",l.toString());
return "livres";

}
}
