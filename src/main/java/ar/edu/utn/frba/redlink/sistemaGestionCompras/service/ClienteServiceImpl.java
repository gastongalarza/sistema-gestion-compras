package ar.edu.utn.frba.redlink.sistemaGestionCompras.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Cliente;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.repositories.RepoCliente;


@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private RepoCliente repo;

	
	@Override
	@Transactional
	public Cliente crear(Cliente client) {
		return repo.save(client);
	}
	
	@Override
	@Transactional
	public List<Cliente> listar(){
		return (List<Cliente>) repo.findAll();
	}

	@Override
	@Transactional
	public Cliente eliminar(int id) {
		
		 Cliente clie = repo.findById(id);
		
		 if(clie != null) {
			repo.delete(clie);
		 }
		return clie;
	}

	@Override
	@Transactional
	public Cliente encontrarUsuario(int id) {
		return repo.findById(id);
	}

	@Override
	@Transactional
	public Cliente editar(Cliente cliente) {
		return repo.save(cliente);
	}	
	
	@Override
	@Transactional
	public Cliente findByUsername(String user) {
		return repo.findByUsername(user);
	}

	
	

}
