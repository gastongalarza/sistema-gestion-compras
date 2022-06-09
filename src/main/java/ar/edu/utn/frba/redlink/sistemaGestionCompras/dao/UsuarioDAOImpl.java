package ar.edu.utn.frba.redlink.sistemaGestionCompras.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Usuario;

@Repository
@Transactional
public class UsuarioDAOImpl implements UsuarioDAO {
	
//	private RolUsuario rol1 = new RolUsuario(1L,"Administrador");
//	private Usuario myuser1 = new Usuario(1L,"gaston","galarza","gastonhernangalarza@gmail.com","02224472266","gasgala","1234",rol1);
//	private List<Usuario> usuarios;

	@PersistenceContext
	EntityManager entityManager;

	public UsuarioDAOImpl() {
		super();
	}

	@Override
	public Usuario save(Usuario usuario) {
		return null;
	}

	@Override
	public List<Usuario> findAll() {
		String query = "FROM Usuario";
		return entityManager.createQuery(query, Usuario.class).getResultList();
	}

	@Override
	public Usuario delete(Usuario usuario) {
		return null;
	}

	@Override
	public Usuario findById(Long id) {
		return null;
	}

}
