package ar.edu.utn.frba.redlink.sistemaGestionCompras.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Producto;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.service.ProductoService;


@RestController
@RequestMapping("/productos")
public class ProductoController {
	@Autowired
	private ProductoService productoService;

	@PostMapping("/crear")
	public Producto crearUsuario(@RequestBody Producto prod) {
		return productoService.crear(prod);
	}

	@RequestMapping("/listar")
	public List<Producto> listarUsuarios() {
		return productoService.listar();
	}

	@GetMapping("/encontrar/{idUsuario}")
	public Producto obtenerUsuario(Producto prod) {
		return productoService.buscarProducto(prod);
	}
	
	@PostMapping("/eliminar/{idUsuario}")
	public String eliminarUsuario(Producto usuario) {
		productoService.eliminar(usuario);
		return "Usuario eliminado con exito";
	}

}
