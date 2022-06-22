package ar.edu.utn.frba.redlink.sistemaGestionCompras.service;

import java.util.List;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Vendedor;

public interface VendedorService {
	
	public Vendedor crear(Vendedor usuario);
	
	public List<Vendedor> listar();
	
	public Vendedor eliminar(int id);
	
	public Vendedor encontrarUsuario(int id);
	
	public Vendedor editar(Vendedor vend);
	
	public Vendedor findByUsername(String username);

}
