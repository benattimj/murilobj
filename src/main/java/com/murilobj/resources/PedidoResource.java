package com.murilobj.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.murilobj.domain.Pedido;
import com.murilobj.services.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoResource {

	@Autowired	
	private PedidoService service;
	/*
	@RequestMapping(value="(/id)",method=RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?>find(@PathVariable Integer id) {
		
		
		Pedido obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	

	}
*/	@GetMapping("/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id ) {
	
	Pedido obj = service.find(id);
	return ResponseEntity.ok().body(obj);
}

	


}
