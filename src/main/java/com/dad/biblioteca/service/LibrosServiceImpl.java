package com.dad.biblioteca.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dad.biblioteca.domain.Libros;
import com.dad.biblioteca.repository.LibrosRepository;

@Service
public class LibrosServiceImpl implements LibrosService {
	
	private LibrosRepository librosRepository;

	public LibrosServiceImpl(LibrosRepository librosRepository) {
		this.librosRepository = librosRepository;
	}

	@Override
	public List<Libros> getList() {
		
		List<Libros> libros = (List<Libros>) librosRepository.findAll();
		
		return libros;
	}

	@Override
	public void insert(Libros libros) {
		
		librosRepository.save(libros);
		
	}

	@Override
	public Libros get(int id) {
		
		Libros libro = librosRepository.findById(id).get();
		
		return libro;
	}

	@Override
	public void delete(int id) {
		
		librosRepository.deleteById(id);
		
	}
	
	

}
