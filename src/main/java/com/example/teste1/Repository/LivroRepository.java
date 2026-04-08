package com.example.teste1.Repository;

import com.example.teste1.Models.LivroModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<LivroModels, Long> {
}
