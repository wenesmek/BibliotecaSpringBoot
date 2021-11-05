package com.dad.biblioteca.service;

import java.util.List;

import com.dad.biblioteca.domain.Libros;

public interface LibrosService {
	
	public List<Libros> getList();
	
	public void insert(Libros libros);
	
	public Libros get(int id);
	
	public void delete(int id);

}
