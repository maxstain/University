package org.example.university.services.university;

import org.example.university.entities.University;
import org.example.university.repositories.UniversityRepository;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service
@Component
public class UniversityServiceImpl implements IUniversityService {

    UniversityRepository universityRepository;

    @Autowired
    public UniversityServiceImpl(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    @Override
    public University addUniversity(University university) {
        return universityRepository.save(university);
    }

    @Override
    public University updateUniversity(University university) {
        return universityRepository.save(university);
    }

    @Override
    public void deleteUniversity(long idUniversity) {
        universityRepository.deleteById(idUniversity);
    }

    @Override
    public University getUniversityById(long idUniversity) {
        return universityRepository.findById(idUniversity).orElse(null);
    }

    @Override
    public List<University> getAllUniversities() {
        return (List<University>) universityRepository.findAll();
    }
}
