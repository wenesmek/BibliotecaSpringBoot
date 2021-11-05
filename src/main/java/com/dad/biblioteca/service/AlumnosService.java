package com.dad.biblioteca.service;

import java.util.List;

import com.dad.biblioteca.domain.Alumnos;

public interface AlumnosService {
	
	public List<Alumnos> getList();
	
	public void insert(Alumnos alumno);
	
	public Alumnos get(int id);
	
	public void delete(int id); 

}
