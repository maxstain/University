package org.example.university.services.university;

import org.example.university.entities.University;

import java.util.List;

public interface IUniversityService {

    public University addUniversity(University university);

    public University updateUniversity(University university);

    public void deleteUniversity(long idUniversity);

    public University getUniversityById(long idUniversity);

    public List<University> getAllUniversities();
}
