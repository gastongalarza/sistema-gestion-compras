package ar.edu.utn.frba.redlink.sistemaGestionCompras.dtos;

import java.util.List;
import org.springframework.data.rest.core.config.Projection;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.*;

@Projection(name = "usuario",types = {Usuario.class})
public interface UsuarioDTO{
		
	public Usuario save(Usuario usuario);
	
	public List<Usuario> findAll();
	
	public Usuario delete(Usuario usuario);
	
	public Usuario findById(Integer id);
}
