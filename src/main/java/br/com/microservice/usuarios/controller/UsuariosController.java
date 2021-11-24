package br.com.microservice.usuarios.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservice.usuarios.dto.UsuariosDTO;
import br.com.microservice.usuarios.service.UsuariosService;

@RestController
public class UsuariosController {

@Autowired private UsuariosService usuariosService;
	
	@PostMapping("/cadastrar")
	public ResponseEntity<String> cadastrar(@RequestBody UsuariosDTO usuario) throws IOException{
		try {
			return usuariosService.cadastrar(usuario);
		}catch(Exception e) {
			return new ResponseEntity<>("Ocorreu um erro durante a execução do pagamento", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}

