package com.dad.biblioteca.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dad.biblioteca.domain.Prestamos;
import com.dad.biblioteca.repository.PrestamosRepository;

@Service
public class PrestamosServiceImpl implements PrestamosService {
	
	private PrestamosRepository prestamosRepository;
	
	

	public PrestamosServiceImpl(PrestamosRepository prestamosRepository) {
		this.prestamosRepository = prestamosRepository;
	}

	@Override
	public List<Prestamos> getList() {
		
		List<Prestamos> prestamos = (List<Prestamos>) prestamosRepository.findAll();
		
		return prestamos;
	}

	@Override
	public List<Prestamos> getListFechasNulas() {
		
		List<Prestamos> prestamos = prestamosRepository.findFechasNull();
		
		return prestamos;
	}

	@Override
	public void insert(Prestamos prestamo) {
		
		prestamosRepository.save(prestamo);

	}

	@Override
	public Prestamos get(int id) {
		
		Prestamos prestamo = prestamosRepository.findById(id).get();
		return null;
	}

	@Override
	public void delete(int id) {
		
		prestamosRepository.deleteById(id);

	}

}
