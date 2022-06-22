package ar.edu.utn.frba.redlink.sistemaGestionCompras.service;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.*;
import java.util.List;

public interface ClienteService {
	
	public Cliente crear(Cliente usuario);
	
	public List<Cliente> listar();
	
	public Cliente eliminar(int id);
	
	public Cliente encontrarUsuario(int id);
	
	public Cliente editar(Cliente cliente);
	
	public Cliente findByUsername(String username);

}
