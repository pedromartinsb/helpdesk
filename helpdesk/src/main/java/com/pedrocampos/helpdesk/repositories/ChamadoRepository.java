package com.pedrocampos.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrocampos.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
