package com.example.demo.repositorios;

import com.example.demo.entidades.Credito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioCredito extends JpaRepository<Credito, Integer> {

}
