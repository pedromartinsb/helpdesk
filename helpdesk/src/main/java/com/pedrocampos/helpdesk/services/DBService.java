package com.pedrocampos.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedrocampos.helpdesk.domain.Chamado;
import com.pedrocampos.helpdesk.domain.Cliente;
import com.pedrocampos.helpdesk.domain.Tecnico;
import com.pedrocampos.helpdesk.domain.enums.Perfil;
import com.pedrocampos.helpdesk.domain.enums.Prioridade;
import com.pedrocampos.helpdesk.domain.enums.Status;
import com.pedrocampos.helpdesk.repositories.ChamadoRepository;
import com.pedrocampos.helpdesk.repositories.ClienteRepository;
import com.pedrocampos.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public void instanciaDB() {
		
		Tecnico tec1 = new Tecnico(null, "Valdir", "98812131923", "valdir@email.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cl1 = new Cliente(null, "Linus", "98191829182", "linus@email.com", "123");
		
		Chamado ch1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cl1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cl1));
		chamadoRepository.saveAll(Arrays.asList(ch1));
	}
}
