package org.example.university.controllers;

import org.example.university.entities.Bloc;
import org.example.university.services.bloc.BlocServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlocController {

    BlocServiceImpl blocService;

    public BlocController() {
    }

    @PostMapping("bloc/add")
    private void addBloc(@RequestBody Bloc bloc) {
        blocService.addBloc(bloc);
    }

    @PutMapping("bloc/update")
    private void updateBloc(@RequestBody Bloc bloc) {
        blocService.updateBloc(bloc);
    }

    @DeleteMapping("bloc/delete/{id}")
    private void deleteBloc(@PathVariable long id) {
        blocService.deleteBloc(id);
    }

    @GetMapping("blocs")
    private List<Bloc> getAllBlocs() {
        return blocService.getAllBlocs();
    }

    @GetMapping("blocs/{id}")
    private Bloc getBlocById(@PathVariable long id) {
        return blocService.getBlocById(id);
    }

}
