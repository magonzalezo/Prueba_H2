package com.ejercicio.rest;

import java.util.List;

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

import com.ejercicio.model.entity.Persona;
import com.ejercicio.model.service.IPersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {

	@Autowired
	private IPersonaService iPersonaService;
	
	@GetMapping("/")
	public ResponseEntity<List<Persona>> obtenerPersonas(){
		return new ResponseEntity<>(iPersonaService.obtenerPersonas(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Persona> obtenerPersonaPorId(@PathVariable("id") long id){
		return new ResponseEntity<>(iPersonaService.consultarPersonaPorID(id), HttpStatus.OK);
	}
	
	@PutMapping("/")
	public ResponseEntity<Void> actualizarPersona(@RequestBody Persona persona){
		iPersonaService.actualizarPersona(persona);
		return new ResponseEntity<>(null, HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<Void> guardarPersona(@RequestBody Persona persona){
		iPersonaService.guardarPersona(persona);
		return new ResponseEntity<>(null, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> borrarPersona(@PathVariable long id){
		iPersonaService.borrarPersona(id);
		return new ResponseEntity<>(null, HttpStatus.OK);
	}
	
}
