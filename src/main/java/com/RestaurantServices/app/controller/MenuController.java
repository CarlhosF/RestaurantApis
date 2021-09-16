package com.RestaurantServices.app.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RestaurantServices.app.Services.MenuInterface;
import com.RestaurantServices.app.entity.Menu;



@RestController
@RequestMapping("/api/menu")
public class MenuController {

	@Autowired(required=true)
	private MenuInterface menuinterface;
	
	@PostMapping
	public ResponseEntity<?> create (@RequestBody Menu menu)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(menuinterface.Save(menu));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable(value="id")  Long id)
	{
		Optional<Menu> oMenu = menuinterface.findById(id);
		
		if(oMenu.isPresent()) 
		{
			return ResponseEntity.ok(oMenu);
		}
		else {
		
			
			return ResponseEntity.notFound().build();
		}
	}
	//update a mesa register
	
		@PutMapping("/{id}")
		public ResponseEntity<?> update(@RequestBody Menu mesaDetails,@PathVariable(value="id")  Long id)
		{
			Optional<Menu> oMesa = menuinterface.findById(id);
			
			if(oMesa.isPresent()) 
			{
				oMesa.get().setCodigo(mesaDetails.getCodigo());
				return ResponseEntity.status(HttpStatus.CREATED).body(menuinterface.Save(oMesa.get()));
			}
			else {
			
				
				return ResponseEntity.notFound().build();
			}
		}
		
		//delete  a register
		
		@DeleteMapping("/{id}")
		public ResponseEntity<?> delete (@PathVariable(value="id")  Long id)
		{
			if(menuinterface.findById(id).isPresent()){
				menuinterface.deleteById(id);
				return ResponseEntity.ok().build();
			}
			else 
			{
				return ResponseEntity.notFound().build();
			}
		}
		
		//Read all element
		@GetMapping
		public List<Menu> readAll()
		{
			List<Menu> menus= StreamSupport
					.stream(menuinterface.findAll().spliterator(), false)
					.collect(Collectors.toList());
					
			return menus;
		}
	
}
