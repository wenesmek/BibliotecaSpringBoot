package com.dad.biblioteca.service;

import java.util.List;

import com.dad.biblioteca.domain.Prestamos;

public interface PrestamosService {

	public List<Prestamos> getList();
	
	public List<Prestamos> getListFechasNulas();

	public void insert(Prestamos prestamo);

	public Prestamos get(int id);

	public void delete(int id);

}
