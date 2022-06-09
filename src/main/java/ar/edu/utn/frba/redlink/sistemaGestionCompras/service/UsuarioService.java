package ar.edu.utn.frba.redlink.sistemaGestionCompras.service;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.*;
import java.util.List;

public interface UsuarioService {
	
	public Usuario crear(Usuario usuario);
	
	public List<Usuario> listar();
	
	public void eliminar(Usuario usuario);
	
	public Usuario encontrarUsuario(Usuario usuario);

}
