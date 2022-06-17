package ar.edu.utn.frba.redlink.sistemaGestionCompras.service;

import java.util.List;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Vendedor;

public interface VendedorService {
	
	public Vendedor crear(Vendedor usuario);
	
	public List<Vendedor> listar();
	
	public void eliminar(Vendedor usuario);
	
	public Vendedor encontrarUsuario(Vendedor usuario);

}
