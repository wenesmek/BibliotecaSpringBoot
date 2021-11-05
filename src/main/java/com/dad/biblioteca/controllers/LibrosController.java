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

import com.dad.biblioteca.domain.Libros;
import com.dad.biblioteca.repository.LibrosRepository;
import com.dad.biblioteca.service.LibrosServiceImpl;

@Controller
public class LibrosController {

	private LibrosServiceImpl lsi;


	@RequestMapping("/libros")
	public String listaLibros(Model model) {

		List<Libros> libros = lsi.getList();

		model.addAttribute("libros", libros);

		return "libros/libroslist";
	}
	
	
	@RequestMapping("insertalibroform")
	public String insertLibroForm(Model model) {

		Libros libro = new Libros();

		model.addAttribute("libro", libro);

		return "libros/insertLibroForm";
	}
	
	
	@PostMapping("insertlibro")
	public String insertLibro(@ModelAttribute("libro") Libros libro) {

		lsi.insert(libro);

		return "redirect:/";
	}
	
	@GetMapping("/modifylibroform")
	public String modifylibroForm(@RequestParam("codigoLi") int Id, Model model) {

		Libros libro =  lsi.get(Id);

		model.addAttribute("libro", libro);

		return "libros/insertLibroForm";
	}
	
	@GetMapping("/deletelibro")
	public String deleteLibro(@RequestParam("codigoLi") int Id) {
		
		lsi.delete(Id);
		
		
		return "redirect:/";
	}
	
}
