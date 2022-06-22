package ar.edu.utn.frba.redlink.sistemaGestionCompras.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente extends Usuario {
	
	@OneToMany(mappedBy = "cliente")
    private List<OrdenCompra> ordenes;

	public Cliente() {
		super();
		ordenes = new ArrayList<>();
	}

	public List<OrdenCompra> getOrdenes() {
		return ordenes;
	}

	public void setOrdenes(List<OrdenCompra> ordenes) {
		this.ordenes = ordenes;
	}
	
	
}
