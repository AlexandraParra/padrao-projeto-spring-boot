package com.digitalinnovation.padraoprojetospring.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalinnovation.padraoprojetospring.entidades.Usuario;
import com.digitalinnovation.padraoprojetospring.repositorios.RepositorioUsuario;

@RestController
@RequestMapping(value = "/usuarios")
public class ControladorUsuario {
	
	@Autowired
	private RepositorioUsuario repositorio;

	@GetMapping
	public List<Usuario> findAll() {
		List<Usuario> resultado = repositorio.findAll();
		return resultado;
	}
	
	@GetMapping(value = "/{id}")
	public Usuario findById(@PathVariable Long id) {
		Usuario resultado = repositorio.findById(id).get();
		return resultado;
	}
	
	@PostMapping
	public Usuario insert(@RequestBody Usuario usuario) {
		Usuario resultado = repositorio.save(usuario);
		return resultado;
	}
}
