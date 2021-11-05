package com.dad.biblioteca.domain;


import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Prestamos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "codalumno")
	private Alumnos alumno;

	@ManyToOne
	@JoinColumn(name = "codlibros")
	private Libros libro;


	private Date fechaprestamo;


	private Date fechadevolucion;

	private String estado;

	public Prestamos() {
	}

	

	public Prestamos(int id, Alumnos alumno, Libros libro, Date fechaPrestamo,
			Date fechaDevolucion, String estado) {
		this.id = id;
		this.alumno = alumno;
		this.libro = libro;
		this.fechaprestamo = fechaPrestamo;
		this.fechadevolucion = fechaDevolucion;
		this.estado = estado;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Alumnos getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumnos alumno) {
		this.alumno = alumno;
	}

	public Libros getLibro() {
		return libro;
	}

	public void setLibro(Libros libro) {
		this.libro = libro;
	}

	public Date getFechaPrestamo() {
		return fechaprestamo;
	}

	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaprestamo = fechaPrestamo;
	}

	public Date getFechaDevolucion() {
		return fechadevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechadevolucion = fechaDevolucion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}



	@Override
	public String toString() {
		return "Prestamos [id=" + id + ", alumno=" + alumno + ", libro=" + libro + ", fechaPrestamo=" + fechaprestamo
				+ ", fechaDevolucion=" + fechadevolucion + ", estado=" + estado + "]";
	}
	
	

}
