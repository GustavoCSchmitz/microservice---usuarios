package br.com.microservice.usuarios.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.microservice.usuarios.dto.UsuariosDTO;

@Service
public class UsuariosService {

@Autowired private RestTemplate client;
	
	public ResponseEntity<String> cadastrar(UsuariosDTO usuario) {
		return client.exchange("http://carteira/cadastrarUsuario",HttpMethod.POST, new HttpEntity<String>(montaJson(usuario), null), String.class);		
	}
	
	private String montaJson(UsuariosDTO usuario) {
		Gson gson = new GsonBuilder().serializeNulls().create();
		return gson.toJson(usuario);
	}
}
