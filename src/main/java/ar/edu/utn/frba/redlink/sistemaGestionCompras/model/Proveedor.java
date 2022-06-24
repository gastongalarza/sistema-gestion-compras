package ar.edu.utn.frba.redlink.sistemaGestionCompras.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "proveedor")
public class Proveedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "razonsocial")
	private String razonsocial;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "telefono")
	private String telefono;

	@ManyToOne
	private Vendedor vendedor;
	
	public Proveedor() {

	}
	
	public Proveedor(int id, String razonsocial, String email, String direccion, String telefono) {
		super();
		this.id = id;
		this.razonsocial = razonsocial;
		this.email = email;
		this.direccion = direccion;
		this.telefono = telefono;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRazonsocial() {
		return razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}


}
