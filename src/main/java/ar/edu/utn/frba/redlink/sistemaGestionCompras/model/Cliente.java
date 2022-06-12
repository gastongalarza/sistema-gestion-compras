package ar.edu.utn.frba.redlink.sistemaGestionCompras.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cliente")
public class Cliente extends Usuario {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "nombre")
	private Long idUsuario;
	
	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@OneToMany
	@JoinColumn(name = "id_cliente_FK")
    private List<OrdenCompra> ordenes;

	public Cliente() {
		ordenes = new ArrayList<>();
	}

}
