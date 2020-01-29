package com.ejercicio.model.service;

import java.util.List;

import com.ejercicio.model.entity.Persona;

public interface IPersonaService {
	
	public void guardarPersona(Persona persona);
	public Persona consultarPersonaPorID(long id);
	public void actualizarPersona(Persona persona);
	public void borrarPersona(long id);
	public List<Persona> obtenerPersonas();
	

}
