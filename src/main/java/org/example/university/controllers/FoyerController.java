package org.example.university.controllers;

import org.example.university.entities.Foyer;
import org.example.university.services.foyer.IFoyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foyer")
public class FoyerController {

    @Autowired
    IFoyerService iFoyerService;

    @PostMapping("/add")
    void addFoyer(@RequestBody Foyer foyer) {
        iFoyerService.addFoyer(foyer);
    }

    @PutMapping("/update")
    void updateFoyer(@RequestBody Foyer foyer) {
        iFoyerService.updateFoyer(foyer);
    }

    @DeleteMapping("/delete/{id}")
    void deleteFoyer(@PathVariable long id) {
        iFoyerService.deleteFoyer(id);
    }

    @GetMapping("/foyers")
    List<Foyer> getAllFoyers() {
        return iFoyerService.getAllFoyers();
    }

    @GetMapping("/{id}")
    Foyer getFoyerById(@PathVariable long id) {
        return iFoyerService.getFoyerById(id);
    }

}
