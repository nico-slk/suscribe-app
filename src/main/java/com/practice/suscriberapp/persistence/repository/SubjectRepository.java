package com.practice.suscriberapp.persistence.repository;

import com.practice.suscriberapp.persistence.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, UUID> {
    Subject findByName(String subjectName);
}
