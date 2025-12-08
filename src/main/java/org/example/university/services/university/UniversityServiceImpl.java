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
    public University getUniversityById(University university) {
        return universityRepository.findById(university.getIdUniversite()).orElse(null);
    }

    @Override
    public List<University> getAllUniversitys(List<University> universities) {
        return (List<University>) universityRepository.findAll();
    }
}
