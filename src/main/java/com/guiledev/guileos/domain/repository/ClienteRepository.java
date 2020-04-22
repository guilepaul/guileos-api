package com.guiledev.guileos.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guiledev.guileos.domain.model.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
