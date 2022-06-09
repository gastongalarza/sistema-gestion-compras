package ar.edu.utn.frba.redlink.sistemaGestionCompras.app;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.*;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.service.UsuarioService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/usuarios/")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@PostMapping("/crear")
	public Usuario crearUsuario(@RequestBody Usuario usuario) {
		return usuarioService.crear(usuario);
	}

	@GetMapping("/listar")
	public List<Usuario> listarUsuarios() {
		return usuarioService.listar();
	}

	@GetMapping("/encontrar/{idUsuario}")
	public Usuario obtenerUsuario(Usuario usuario) {
		return usuarioService.encontrarUsuario(usuario);
	}
	
	@PostMapping("/eliminar/{idUsuario}")
	public String eliminarUsuario(Usuario usuario) {
		usuarioService.eliminar(usuario);
		return "Usuario eliminado con exito";
	}
}


