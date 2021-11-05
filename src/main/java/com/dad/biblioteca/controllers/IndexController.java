package com.dad.biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dad.biblioteca.domain.Alumnos;
import com.dad.biblioteca.domain.Libros;


@Controller
public class IndexController {
	
	
	
	@RequestMapping("/")
	public String index(Model model) {
		
//		List<Alumnos> alumnos = alumnosDao.getList();
//		
//		List<Libros> libros = librosDao.getList();
//		
//		model.addAttribute("alumnos", alumnos);
//		
//		model.addAttribute("libros", libros);
		
		
		return "index";
	}

}
