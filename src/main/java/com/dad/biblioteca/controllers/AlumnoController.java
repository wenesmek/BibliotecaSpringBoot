package com.dad.biblioteca.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dad.biblioteca.domain.Alumnos;
import com.dad.biblioteca.repository.AlumnosRepository;
import com.dad.biblioteca.service.AlumnosServiceImpl;

@Controller
public class AlumnoController {
	
	private AlumnosServiceImpl asi;
	
	

	public AlumnoController(AlumnosServiceImpl alumnosServiceImpl) {
	this.asi = alumnosServiceImpl;
}

	@RequestMapping("/alumnos")
	public String listaAlumnos(Model model) {

		List<Alumnos> alumnos = asi.getList();

		model.addAttribute("alumnos", alumnos);

		return "alumnos/alumnoslist";
	}

	@PostMapping("/insertalumno")
	public String insertAlumno(@ModelAttribute("alumno") Alumnos alumno) {
		
		asi.insert(alumno);

		return "redirect:/";
	}

	@RequestMapping("/insertalumnoform")
	public String insertAlumnoForm(Model model) {

		Alumnos alumno = new Alumnos();

		model.addAttribute("alumno", alumno);

		return "alumnos/insertAlumnoForm";
	}

	@GetMapping("/modifyalumnoform")
	public String modifyAlumnoForm(@RequestParam("codigoAl") int Id, Model model) {

		Alumnos alumno =  asi.get(Id);
		
		model.addAttribute("alumno", alumno);

		return "alumnos/insertAlumnoForm";
	}
	
	@GetMapping("/deletealumno")
	public String deleteAlumno(@RequestParam("codigoAl") int Id) {
		
		asi.delete(Id);
		
		
		return "redirect:/";
	}

}
