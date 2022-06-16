package ar.edu.utn.frba.redlink.sistemaGestionCompras.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "administrador")
public class Administrador extends Usuario {
	
	@ManyToMany
	@JoinColumn(name = "vendedor_id")
	private Set<Vendedor> vendedores;

	@ManyToMany
	@JoinColumn(name = "cliente_id")
	private Set<Cliente> clientes;
	
	public Administrador() {
		super();

	}
	
}
