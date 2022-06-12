package ar.edu.utn.frba.redlink.sistemaGestionCompras.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.dtos.*;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioDTO usuarioDAO;

	
	@Override
	@Transactional
	public Usuario crear(Usuario usuario) {
		return usuarioDAO.save(usuario);
	}
	
	@Override
	public List<Usuario> listar(){
		return (List<Usuario>) usuarioDAO.findAll();
	}

	@Override
	public void eliminar(Usuario usuario) {
		usuarioDAO.delete(usuario);
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario encontrarUsuario(Usuario usuario) {
		return usuarioDAO.findById(usuario.getId());
	}

}
