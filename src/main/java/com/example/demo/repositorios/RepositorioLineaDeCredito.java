package com.example.demo.repositorios;

import com.example.demo.entidades.LineaDeCredito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioLineaDeCredito extends JpaRepository<LineaDeCredito, Integer> {

}
