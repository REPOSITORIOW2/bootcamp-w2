package com.example.demo.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Usuario;

@Repository
public class UsuarioRepository {

	private static List <Usuario> usuarios = Arrays.asList(
		new Usuario(1L,"Ulysses", "ulysses@aasd.com", true),
		new Usuario(2L,"Rhames", "rhames@aasd.com", false),
		new Usuario(3L,"vitor", "ulysses@aasd.com", false)
	);
	
	
	public Usuario getUsuario(long id) {
		for(Usuario u : usuarios) {
			if(u.getId()==id) {
				return u;
			}
		}
		return null;
	}
	
}
