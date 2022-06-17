package ar.edu.utn.frba.redlink.sistemaGestionCompras.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Vendedor;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.repositories.RepoVendedor;

@Service
public class VendedorServiceImpl implements VendedorService {
	
	@Autowired
	private RepoVendedor repo;

	@Override
	@Transactional
	public Vendedor crear(Vendedor usuario) {
		return repo.save(usuario);
	}

	@Override
	public List<Vendedor> listar() {
		return (List<Vendedor>) repo.findAll();
	}

	@Override
	public void eliminar(Vendedor usuario) {
		repo.delete(usuario);	
	}

	@Override
	@Transactional(readOnly = true)
	public Vendedor encontrarUsuario(Vendedor usuario) {
		return repo.findById(usuario.getIdUsuario());
	}


}
