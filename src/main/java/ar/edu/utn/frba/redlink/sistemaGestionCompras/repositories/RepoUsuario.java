package ar.edu.utn.frba.redlink.sistemaGestionCompras.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.dtos.UsuarioDTO;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Cliente;

@RepositoryRestResource(path="usuarios", excerptProjection = UsuarioDTO.class)
public interface RepoUsuario extends PagingAndSortingRepository<Cliente, Integer>{
	
		Cliente findByNombre(String nombre);
		
		@Override	
		@RestResource(exported = false)
		void deleteById(Integer id) ;
		
		@Override
		@RestResource(exported = false)
		void delete(Cliente entity) ;

}
