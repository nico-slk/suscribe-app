package com.practice.suscriberapp.service;

import com.practice.suscriberapp.persistence.entity.Subject;
import com.practice.suscriberapp.persistence.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    public List<Subject> getAll() {
        return subjectRepository.findAll();
    }

    public Subject getByName(String subjectName) {
        return subjectRepository.findByName(subjectName);
    }

    public Subject getById(UUID idSubject) {
        return subjectRepository.findById(idSubject).orElseThrow(
                () -> new RuntimeException("Subject with ID: " + idSubject + " was not found.")
        );
    }

    public Subject createSubject(Subject subject) {
        return subjectRepository.save(subject);
    }


}
