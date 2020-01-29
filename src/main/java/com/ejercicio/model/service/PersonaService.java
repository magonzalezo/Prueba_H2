package com.ejercicio.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.model.dao.IPersonaDAO;
import com.ejercicio.model.entity.Persona;

@Service
public class PersonaService implements IPersonaService {

	@Autowired
	private IPersonaDAO personaDAO;

	@Override
	public void guardarPersona(Persona persona) {
		personaDAO.save(persona);
	}

	@Override
	public Persona consultarPersonaPorID(long id) {
		return personaDAO.findById(id).get();
	}

	@Override
	public void actualizarPersona(Persona persona) {
		personaDAO.save(persona);
	}

	@Override
	public void borrarPersona(long id) {
		personaDAO.deleteById(id);		
	}

	@Override
	public List<Persona> obtenerPersonas() {
		return (List<Persona>)personaDAO.findAll();
	}
	
	
	
}
