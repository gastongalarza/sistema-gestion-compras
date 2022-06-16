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
	public List<Cliente> listar(){
		return (List<Cliente>) repo.findAll();
	}

	@Override
	public void eliminar(Cliente client) {
		repo.delete(client);
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente encontrarUsuario(Cliente client) {
		return repo.findById(client.getIdUsuario());
	}

}
