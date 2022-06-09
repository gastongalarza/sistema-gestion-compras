package ar.edu.utn.frba.redlink.sistemaGestionCompras.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(name = "rolusuario")
@ToString @EqualsAndHashCode
public class RolUsuario {

	@Id @Column(name = "id")
	private Long idRol;

	@Column(name = "nombre")
	private String rol;

	public RolUsuario(String rol) {
		super();
		this.rol=rol;
	}
	public RolUsuario() {

	}
	public Long getIdRol() {
		return idRol;
	}
	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	
}