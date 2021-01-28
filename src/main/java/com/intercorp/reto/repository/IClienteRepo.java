package com.intercorp.reto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intercorp.reto.model.Cliente;

public interface IClienteRepo extends JpaRepository<Cliente, Long> {

}
