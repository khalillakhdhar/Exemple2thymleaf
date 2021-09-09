package com.thym.heroku.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
}
