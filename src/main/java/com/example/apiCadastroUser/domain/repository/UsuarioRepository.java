package com.example.apiCadastroUser.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apiCadastroUser.domain.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
