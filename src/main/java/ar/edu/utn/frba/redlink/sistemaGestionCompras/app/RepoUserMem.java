package ar.edu.utn.frba.redlink.sistemaGestionCompras.app;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Usuario;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

@Repository
public class RepoUserMem {
//	private RolUsuario rol1 = new RolUsuario(1,"Administrador");
//	private Usuario myuser1 = new Usuario(1,"gaston","galarza","gastonhernangalarza@gmail.com","02224472266","gasgala","1234",rol1);
	
	private Collection<Usuario> users;
	
	public RepoUserMem() {
		super();
//		users = List.of(myuser1);
	}
	
	public Collection<Usuario> all(){
		return users;
	}
	
	public Usuario findByName(String nameuser) {
		return all().stream().filter(x -> x.getNombre().equals(nameuser)).findFirst().get();
	}

	public Collection<Usuario> findTelefono(String telef) {
		return all().stream().filter(x -> x.getTelefono().equals(telef)).collect(Collectors.toList());
	}

}
