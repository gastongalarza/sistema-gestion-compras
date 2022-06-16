package ar.edu.utn.frba.redlink.sistemaGestionCompras.app;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.*;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.service.ClienteService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@PostMapping("/crear")
	public Usuario crearUsuario(@RequestBody Cliente usuario) {
		return clienteService.crear(usuario);
	}

	@RequestMapping("/listar")
	public List<Cliente> listarUsuarios() {
		return clienteService.listar();
	}

	@GetMapping("/encontrar/{idUsuario}")
	public Usuario obtenerUsuario(Cliente usuario) {
		return clienteService.encontrarUsuario(usuario);
	}
	
	@PostMapping("/eliminar/{idUsuario}")
	public String eliminarUsuario(Cliente usuario) {
		clienteService.eliminar(usuario);
		return "Usuario eliminado con exito";
	}
}


