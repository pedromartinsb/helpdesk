package com.pedrocampos.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrocampos.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
