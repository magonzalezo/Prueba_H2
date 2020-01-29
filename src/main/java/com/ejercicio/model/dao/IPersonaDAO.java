package com.ejercicio.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.ejercicio.model.entity.Persona;

public interface IPersonaDAO extends CrudRepository<Persona, Long>{

}
