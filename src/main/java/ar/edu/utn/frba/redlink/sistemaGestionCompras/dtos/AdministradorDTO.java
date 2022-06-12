package ar.edu.utn.frba.redlink.sistemaGestionCompras.dtos;

import java.util.List;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Administrador;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Usuario;

public interface AdministradorDTO {
	
	public Administrador save(Usuario usuario);
	
	public List<Usuario> findAll();
	
	public Usuario delete(Usuario usuario);
	
	public Usuario findById(Long id);

}
