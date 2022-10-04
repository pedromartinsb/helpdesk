package com.pedrocampos.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrocampos.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
