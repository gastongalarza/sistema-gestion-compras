package ar.edu.utn.frba.redlink.sistemaGestionCompras.app;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.OrdenCompra;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.service.OrdenService;

@CrossOrigin(origins= "http://localhost:4200/")
@RestController
@RequestMapping("/api/orden")
public class OrdenController {
	
	@Autowired
	private OrdenService ordenService;

	@PostMapping("/crear")
	public OrdenCompra crearOrden(@RequestBody OrdenCompra ord) {
		return ordenService.crear(ord);
	}

	@GetMapping("/listar")
	public Collection<OrdenCompra> listarOrden() {
		return ordenService.listar();
	}

	@GetMapping("/buscar")
	public OrdenCompra obtenerOrden(@RequestBody OrdenCompra ord) {
		return ordenService.buscarOrden(ord);
	}
	
	@DeleteMapping(path = {"/{id}"})
	public OrdenCompra eliminarOrden(@PathVariable("id") int id) {
		return ordenService.eliminar(id);
			
	}

}
