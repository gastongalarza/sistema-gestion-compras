package ar.edu.utn.frba.redlink.sistemaGestionCompras.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Usuario;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Vendedor;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.service.VendedorService;

public class VendedorController {
	
	@Autowired
	private VendedorService vendedorService;

	@PostMapping("/crear")
	public Usuario crearUsuario(@RequestBody Vendedor usuario) {
		return vendedorService.crear(usuario);
	}

	@RequestMapping("/listar")
	public List<Vendedor> listarUsuarios() {
		return vendedorService.listar();
	}

	@GetMapping("/encontrar/{idUsuario}")
	public Usuario obtenerUsuario(Vendedor usuario) {
		return vendedorService.encontrarUsuario(usuario);
	}
	
	@PostMapping("/eliminar/{idUsuario}")
	public String eliminarUsuario(Vendedor usuario) {
		vendedorService.eliminar(usuario);
		return "Usuario eliminado con exito";
	}


}
