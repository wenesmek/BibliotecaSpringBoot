package com.dad.biblioteca.domain;

public class PrestamoInsertObject {
	
	private int codAlumno;
	
	private int codLibro;
	
	String date;

	public PrestamoInsertObject() {
	}

	public PrestamoInsertObject(int codAlumno, int codLibro, String date) {
		this.codAlumno = codAlumno;
		this.codLibro = codLibro;
		this.date = date;
	}

	public int getCodAlumno() {
		return codAlumno;
	}

	public void setCodAlumno(int codAlumno) {
		this.codAlumno = codAlumno;
	}

	public int getCodLibro() {
		return codLibro;
	}

	public void setCodLibro(int codLibro) {
		this.codLibro = codLibro;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "PrestamoInsertObject [codAlumno=" + codAlumno + ", codLibro=" + codLibro + ", date=" + date + "]";
	}
	
	
	

}
