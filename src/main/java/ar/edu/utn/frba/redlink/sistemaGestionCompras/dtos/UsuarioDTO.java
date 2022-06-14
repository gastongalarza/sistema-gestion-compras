package ar.edu.utn.frba.redlink.sistemaGestionCompras.dtos;

import java.util.List;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.*;

public interface UsuarioDTO{
		
	public Usuario save(Usuario usuario);
	
	public List<Usuario> findAll();
	
	public Usuario delete(Usuario usuario);
	
	public Usuario findById(Integer id);
}
