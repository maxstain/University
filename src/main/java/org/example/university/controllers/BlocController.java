package org.example.university.controllers;

import org.example.university.entities.Bloc;
import org.example.university.services.bloc.IBlocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bloc")
public class BlocController {

    @Autowired
    IBlocService iBlocService;

    @PostMapping("/add")
    void addBloc(@RequestBody Bloc bloc) {
        iBlocService.addBloc(bloc);
    }

    @PutMapping("/update")
    void updateBloc(@RequestBody Bloc bloc) {
        iBlocService.updateBloc(bloc);
    }

    @DeleteMapping("/delete/{id}")
    void deleteBloc(@PathVariable long id) {
        iBlocService.deleteBloc(id);
    }

    @GetMapping("/blocs")
    List<Bloc> getAllBlocs() {
        return iBlocService.getAllBlocs();
    }

    @GetMapping("/{id}")
    Bloc getBlocById(@PathVariable long id) {
        return iBlocService.getBlocById(id);
    }

}
