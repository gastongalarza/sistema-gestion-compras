package ar.edu.utn.frba.redlink.sistemaGestionCompras.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "vendedor")
public class Vendedor extends Usuario {
	
	@ManyToMany
	@JoinColumn(name="orden_id")
    private List<OrdenCompra> ordenes;
	
	@ManyToMany
	@JoinColumn(name="producto_id")
    private List<Producto> productos;

	@OneToMany
	@JoinColumn(name = "proveedor_id")
	private List<Proveedor> proveedores;
	
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
