package com.intercorp.reto.service;

import java.util.HashMap;
import java.util.List;

import com.intercorp.reto.model.Cliente;

public interface RetoService {
	
	public void creacliente(Cliente cliente);
	public List<Cliente> listclientes();
	public HashMap<String, Object> kpideclientes();
}
