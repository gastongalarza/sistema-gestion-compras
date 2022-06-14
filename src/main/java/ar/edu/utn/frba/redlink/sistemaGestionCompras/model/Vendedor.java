package ar.edu.utn.frba.redlink.sistemaGestionCompras.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "vendedor")
public class Vendedor extends Usuario {
	
    @OneToMany
    @JoinColumn(name = "id_orden")
    private List<OrdenCompra> ordenes;

	public Vendedor() {
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
