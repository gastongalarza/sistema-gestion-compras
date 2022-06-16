package ar.edu.utn.frba.redlink.sistemaGestionCompras.service;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.*;
import java.util.List;

public interface ClienteService {
	
	public Cliente crear(Cliente usuario);
	
	public List<Cliente> listar();
	
	public void eliminar(Cliente usuario);
	
	public Cliente encontrarUsuario(Cliente usuario);

}
