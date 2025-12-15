package org.example.university.controllers;

import org.example.university.entities.Etudiant;
import org.example.university.services.etudiant.IEtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
public class EtudiantController {

    @Autowired
    IEtudiantService iEtudiantService;

    @PostMapping("/add")
    void addEtudiant(@RequestBody Etudiant etudiant) {
        iEtudiantService.addEtudiant(etudiant);
    }

    @PutMapping("/update")
    void updateEtudiant(@RequestBody Etudiant etudiant) {
        iEtudiantService.updateEtudiant(etudiant);
    }

    @DeleteMapping("/delete/{id}")
    void deleteEtudiant(@PathVariable long id) {
        iEtudiantService.deleteEtudiant(id);
    }

    @GetMapping("/etudiants")
    List<Etudiant> getAllEtudiants() {
        return iEtudiantService.getAllEtudiants();
    }

    @GetMapping("/{id}")
    Etudiant getEtudiantById(@PathVariable long id) {
        return iEtudiantService.getEtudiantById(id);
    }

}
