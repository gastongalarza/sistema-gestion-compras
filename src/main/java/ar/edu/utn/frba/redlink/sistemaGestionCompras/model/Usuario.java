package ar.edu.utn.frba.redlink.sistemaGestionCompras.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "usuario")
@ToString @EqualsAndHashCode
public class Usuario {
	
	@Id
	@Column(name = "idusuario")
	@Getter @Setter
	private Long idUsuario;
	
	@Column(name = "nombre")
	@Getter @Setter
	private String nombre;

	@Column(name = "apellido")
	@Getter @Setter
	private String apellido;
	
	@Column(name = "email")
	@Getter @Setter
	private String email;
	
	@Column(name = "telefono")
	@Getter @Setter
	private String telefono;
	
	@Column(name = "username")
	@Getter @Setter
	private String username;
	
	@Column(name = "password")
	@Getter @Setter
	private String password;
	
	@ManyToOne
	@JoinColumn(name = "rol_usuario")
	private RolUsuario rol;
	
	public Usuario(String nombre, String apellido, String email, String telefono, String username, String password, RolUsuario rol) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.username = username;
		this.password = password;
		this.rol = rol;
	}
	
	public Usuario() {

	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public RolUsuario getRol() {
		return rol;
	}

	public void setRol(RolUsuario rol) {
		this.rol = rol;
	}


	
}
