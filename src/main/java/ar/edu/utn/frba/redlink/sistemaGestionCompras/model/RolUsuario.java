package ar.edu.utn.frba.redlink.sistemaGestionCompras.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rolusuario")
public class RolUsuario {

	@Id @Column(name = "id")
	private Long idRol;

	private String rol;
// estaria bueno que el id rol se incremente de forma ascendente automaticamente. //identity 
	public RolUsuario(Long i, String rol) {
		super();
		this.idRol = i;
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