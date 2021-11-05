package com.dad.biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.dad.biblioteca.domain.Prestamos;

public interface PrestamosRepository extends CrudRepository<Prestamos, Integer> {
	
	@Query("select p from Prestamos p where p.fechadevolucion = NULL")
	List<Prestamos> findFechasNull();
	
	

}
