package com.dad.biblioteca.repository;

import org.springframework.data.repository.CrudRepository;

import com.dad.biblioteca.domain.Libros;

public interface LibrosRepository extends CrudRepository<Libros, Integer> {

}
