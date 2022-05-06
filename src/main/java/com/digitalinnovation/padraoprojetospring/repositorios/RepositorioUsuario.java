package com.digitalinnovation.padraoprojetospring.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digitalinnovation.padraoprojetospring.entidades.Usuario;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long>{

}
