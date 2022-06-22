package ar.edu.utn.frba.redlink.sistemaGestionCompras.app;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Producto;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.service.ProductoService;

@CrossOrigin(origins= "http://localhost:4200/")
@RestController
@RequestMapping("/api/productos")
public class ProductoController {
	@Autowired
	private ProductoService productoService;

	@PostMapping("/crear")
	public Producto crearProducto(@RequestBody Producto prod) {
		return productoService.crear(prod);
	}

	@RequestMapping("/listar")
	public Collection<Producto> listarProductos() {
		return productoService.listar();
	}

	@GetMapping("/encontrar/{idProd}")
	public Producto obtenerProducto(Producto prod) {
		return productoService.buscarProducto(prod);
	}
	
	@PostMapping("/eliminar/{idProd}")
	public String eliminarProducto(Producto usuario) {
		productoService.eliminar(usuario);
		return "Producto eliminado con exito";
	}

}
