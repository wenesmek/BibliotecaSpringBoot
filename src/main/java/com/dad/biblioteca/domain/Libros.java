package com.dad.biblioteca.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Libros {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codigo;

	private String titulo;

	private String autor;

	private String editorial;

	private String asignatura;

	private String estado;

	public Libros() {
	}

	public Libros(int codigo, String titulo, String autor, String editorial, String asignatura, String estado) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.asignatura = asignatura;
		this.estado = estado;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Libros [codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial
				+ ", asignatura=" + asignatura + ", estado=" + estado + "]";
	}

	
}
