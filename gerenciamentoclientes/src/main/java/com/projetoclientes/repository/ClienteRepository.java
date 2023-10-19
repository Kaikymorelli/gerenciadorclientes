package com.projetoclientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoclientes.entitis.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
