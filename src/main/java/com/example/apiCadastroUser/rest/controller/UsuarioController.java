package com.example.apiCadastroUser.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiCadastroUser.domain.entity.Usuario;
import com.example.apiCadastroUser.domain.repository.UsuarioRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/usuario")
@Api("API Usuarios")
public class UsuarioController {

	private UsuarioRepository usuarioRepository;

	public UsuarioController(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	@ApiOperation("Salvando um usuario")
	public Usuario save(@RequestBody Usuario usuario) {
		return usuarioRepository.save(usuario);

	}

}
