package ar.edu.utn.frba.redlink.sistemaGestionCompras.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "vendedor")
public class Vendedor extends Usuario {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;
    
    @OneToMany
    @JoinColumn(name = "id_vendedor_FK")
    private List<OrdenCompra> ordenes;

	public Vendedor() {
		ordenes = new ArrayList<>();
	}

}
