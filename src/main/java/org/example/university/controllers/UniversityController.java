package org.example.university.controllers;

import org.example.university.entities.University;
import org.example.university.services.university.IUniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/university")
public class UniversityController {

    @Autowired
    IUniversityService iUniversityService;

    @PostMapping("/add")
    void addUniversity(@RequestBody University university) {
        iUniversityService.addUniversity(university);
    }

    @PutMapping("/update")
    void updateUniversity(@RequestBody University university) {
        iUniversityService.updateUniversity(university);
    }

    @DeleteMapping("/delete/{id}")
    void deleteUniversity(@PathVariable long id) {
        iUniversityService.deleteUniversity(id);
    }

    @GetMapping("/universitys")
    List<University> getAllUniversitys() {
        return iUniversityService.getAllUniversities();
    }

    @GetMapping("/{id}")
    University getUniversityById(@PathVariable long id) {
        return iUniversityService.getUniversityById(id);
    }

}
