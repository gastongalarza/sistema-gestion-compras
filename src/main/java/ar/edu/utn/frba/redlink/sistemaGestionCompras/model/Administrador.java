package ar.edu.utn.frba.redlink.sistemaGestionCompras.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "administrador")
public class Administrador extends Usuario {

	public Administrador() {

	}

}
