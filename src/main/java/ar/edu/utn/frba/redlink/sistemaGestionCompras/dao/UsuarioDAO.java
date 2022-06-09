package ar.edu.utn.frba.redlink.sistemaGestionCompras.dao;

import java.util.List;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.*;

public interface UsuarioDAO{
		
	public Usuario save(Usuario usuario);
	
	public List<Usuario> findAll();
	
	public Usuario delete(Usuario usuario);
	
	public Usuario findById(Long id);
}
