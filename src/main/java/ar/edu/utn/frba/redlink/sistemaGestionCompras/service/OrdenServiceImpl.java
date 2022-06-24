package ar.edu.utn.frba.redlink.sistemaGestionCompras.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Cliente;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.OrdenCompra;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.repositories.RepoOrden;


@Service
public class OrdenServiceImpl implements OrdenService {
	
	@Autowired
	private RepoOrden repo;
	
	@Override
	@Transactional
	public OrdenCompra crear(OrdenCompra orden) {
		return repo.save(orden);
	}
	
	@Override
	public Collection<OrdenCompra> listar(){
		return repo.findAll();
	}
	
	@Override
	@Transactional
	public OrdenCompra eliminar(int id) {
		
    OrdenCompra orden = repo.findById(id);	
	 if(orden != null) {
			repo.delete(orden);
     }
	 return orden;
	}
	
	@Override
	@Transactional(readOnly = true)
	public OrdenCompra buscarOrden(OrdenCompra orden) {
		return repo.findById(orden.getId());
	}
}
