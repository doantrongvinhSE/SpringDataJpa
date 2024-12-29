package com.doantrongvinhse.DataJpa.repository;

import com.doantrongvinhse.DataJpa.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
