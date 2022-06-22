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
	@Transactional
	public List<Vendedor> listar() {
		return (List<Vendedor>) repo.findAll();
	}

	@Override
	public Vendedor eliminar(int id) {
		 Vendedor vend = repo.findById(id);
			
		 if(vend != null) {
			repo.delete(vend);
		 }
		return vend;
	}

	@Override
	@Transactional(readOnly = true)
	public Vendedor encontrarUsuario(int id) {
		return repo.findById(id);
	}
	
	@Override
	@Transactional
	public Vendedor editar(Vendedor vend) {
		return repo.save(vend);
	}

	@Override
	public Vendedor findByUsername(String username) {
		return repo.findByUsername(username);
	}


}
