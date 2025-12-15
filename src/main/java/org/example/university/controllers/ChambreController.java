package org.example.university.controllers;

import org.example.university.entities.Chambre;
import org.example.university.services.chambre.IChambreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chambre")
public class ChambreController {

    @Autowired
    IChambreService iChambreService;

    @PostMapping("/add")
    void addChambre(@RequestBody Chambre chambre) {
        iChambreService.addChambre(chambre);
    }

    @PutMapping("/update")
    void updateChambre(@RequestBody Chambre chambre) {
        iChambreService.updateChambre(chambre);
    }

    @DeleteMapping("/delete/{id}")
    void deleteChambre(@PathVariable long id) {
        iChambreService.deleteChambre(id);
    }

    @GetMapping("/chambres")
    List<Chambre> getAllChambres() {
        return iChambreService.getAllChambres();
    }

    @GetMapping("/{id}")
    Chambre getChambreById(@PathVariable long id) {
        return iChambreService.getChambreById(id);
    }

}
