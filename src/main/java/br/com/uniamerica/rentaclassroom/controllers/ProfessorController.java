package br.com.uniamerica.rentaclassroom.controllers;

import br.com.uniamerica.rentaclassroom.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/api/professor")
public class ProfessorController {
    @Autowired
    private ProfessorRepository professorRepository;

    //@GetMapping("/{id}")
    //@GetMapping
    //@GetMapping
    //@PutMapping
    //@PostMapping
    //@DeleteMapping
}