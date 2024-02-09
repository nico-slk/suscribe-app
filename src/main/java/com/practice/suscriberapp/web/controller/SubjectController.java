package com.practice.suscriberapp.web.controller;

import com.practice.suscriberapp.persistence.entity.Subject;
import com.practice.suscriberapp.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/subject")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;

    @GetMapping("/")
    public ResponseEntity<List<Subject>> getAllSubject() {
        return ResponseEntity.ok(subjectService.getAll());
    }

    @GetMapping("/name/{subject_name}")
    public ResponseEntity<Subject> getSubjectByName(@PathVariable String subject_name) {
        return ResponseEntity.ok(subjectService.getByName(subject_name));
    }

    @GetMapping("/id/{id_subject}")
    public ResponseEntity<Subject> getSubjectById(@PathVariable UUID id_subject) {
        return ResponseEntity.ok(subjectService.getById(id_subject));
    }

    @PostMapping("/")
    public ResponseEntity<Subject> createSubject(@RequestBody Subject subject) {
        return ResponseEntity.ok(subjectService.createSubject(subject));
    }

}
