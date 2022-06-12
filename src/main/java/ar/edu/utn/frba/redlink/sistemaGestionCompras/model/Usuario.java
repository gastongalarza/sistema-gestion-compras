package ar.edu.utn.frba.redlink.sistemaGestionCompras.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@MappedSuperclass
public abstract class Usuario {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
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

	public Usuario(String nombre, String apellido, String email, String telefono, String username, String password) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.username = username;
		this.password = password;
	}
	
	public Usuario() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	

}
