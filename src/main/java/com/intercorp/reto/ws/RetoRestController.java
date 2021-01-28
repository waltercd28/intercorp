package com.intercorp.reto.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.intercorp.reto.model.Cliente;
import com.intercorp.reto.service.RetoService;

@RestController
public class RetoRestController {	
	
	@Autowired
	RetoService service;
	
	@PostMapping("/creacliente")
	public void creacliente(@RequestBody Cliente cliente){		
		service.creacliente(cliente);
		
	}
	
	@GetMapping("/kpideclientes")
	public ResponseEntity<Object> kpideclientes(){	
		return new ResponseEntity<Object>(service.kpideclientes(), HttpStatus.OK);
	}
	
	@GetMapping("/listclientes")
	public ResponseEntity<Object> listclientes(){
		return new ResponseEntity<Object>(service.listclientes(), HttpStatus.OK);
	}
	
}
