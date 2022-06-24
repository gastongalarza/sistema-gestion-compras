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

import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Item;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.service.ItemService;


@CrossOrigin(origins= "http://localhost:4200/")
@RestController
@RequestMapping("/api/item")
public class ItemController {

	@Autowired
	private ItemService itemService;

	@PostMapping("/crear")
	public Item crearItem(@RequestBody Item item) {
		return itemService.crear(item);
	}

	@GetMapping("/listar")
	public Collection<Item> listarItem() {
		return itemService.listar();
	}

	@GetMapping("/buscar")
	public Item obtenerItem(@RequestBody Item item) {
		return itemService.buscarItem(item);
	}
	
	@DeleteMapping(path = {"/{id}"})
	public Item eliminarItem(@PathVariable("id") int id) {
		return itemService.eliminar(id);
			
	}

}
