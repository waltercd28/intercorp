package com.intercorp.reto.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intercorp.reto.model.Cliente;
import com.intercorp.reto.repository.IClienteRepo;
import com.intercorp.reto.util.Constantes;
import com.intercorp.reto.util.RetoUtil;

@Service
public class RetoServiceImpl implements RetoService{
	
	@Autowired
	IClienteRepo repo;
		
	@Override
	public HashMap<String, Object> kpideclientes() {
		HashMap<String, Object> map = new HashMap<>();
		List<Cliente> clientes = repo.findAll();
		int promedio = RetoUtil.getPromedio(clientes);
	    map.put("promedio", promedio);
	    map.put("desviacion", (clientes.size() > 1) ? RetoUtil.getDesviacion(clientes, promedio) : Constantes.ERROR_DESVIACION);
		return map;
	}

	@Override
	public List<Cliente> listclientes() {
		return repo.findAll();
	}

	@Override
	public void creacliente(Cliente cliente) {
		repo.save(cliente);		
	}


}
