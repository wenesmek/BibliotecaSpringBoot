package com.dad.biblioteca.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dad.biblioteca.domain.Alumnos;
import com.dad.biblioteca.repository.AlumnosRepository;

@Service
public class AlumnosServiceImpl implements AlumnosService {
	
	
	private AlumnosRepository alumnosRepository;
	
	
	
	public AlumnosServiceImpl(AlumnosRepository alumnosRepository) {
		this.alumnosRepository = alumnosRepository;
	}

	@Override
	public List<Alumnos> getList() {
		
		List<Alumnos> alumnos = (List<Alumnos>) alumnosRepository.findAll();
		
		return alumnos;
	}

	@Override
	public void insert(Alumnos alumno) {
		
		alumnosRepository.save(alumno);

	}

	@Override
	public Alumnos get(int id) {
		
		Alumnos alumno =  alumnosRepository.findById(id).get();
		
		return alumno;
	}

	@Override
	public void delete(int id) {
		
		alumnosRepository.deleteById(id);

	}

}
