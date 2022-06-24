package ar.edu.utn.frba.redlink.sistemaGestionCompras.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Cliente;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Vendedor;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.service.VendedorService;

@CrossOrigin(origins= "http://localhost:4200/")
@RestController
@RequestMapping("/api/vendedores")
public class VendedorController {
	
	@Autowired
	private VendedorService vendedorService;

	@GetMapping("/listar")
	public List<Vendedor> listarUsuarios() {
		return vendedorService.listar();
	}
	
	@PostMapping("/crear")
	public Vendedor crearVendedor(@RequestBody Vendedor vend) {
		return vendedorService.crear(vend);
	}

	@GetMapping(path = {"/{id}"})
	public Vendedor obtenerUsuario(@PathVariable("id")int id) {
		return vendedorService.encontrarUsuario(id);
	}
	
	@DeleteMapping(path = {"/{id}"})
	public Vendedor eliminarUsuario(@PathVariable("id") int id) {
		return vendedorService.eliminar(id);
			
	}
	@PutMapping(path = {"/{username}"})
	public Vendedor editar(@RequestBody Vendedor c, @PathVariable("username") String username){
		c.setUsername(username);
		return vendedorService.editar(c);
	}
	@GetMapping(path = {"/encontrar/{username}"})
	public Vendedor obtenerUsuarioPorUsername(@PathVariable("username")String user) {
		return vendedorService.findByUsername(user);
	}


}
