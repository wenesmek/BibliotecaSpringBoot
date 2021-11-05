package com.dad.biblioteca.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dad.biblioteca.domain.PrestamoInsertObject;
import com.dad.biblioteca.domain.Prestamos;
import com.dad.biblioteca.repository.AlumnosRepository;
import com.dad.biblioteca.repository.LibrosRepository;
import com.dad.biblioteca.repository.PrestamosRepository;
import com.dad.biblioteca.service.AlumnosServiceImpl;
import com.dad.biblioteca.service.LibrosServiceImpl;
import com.dad.biblioteca.service.PrestamosServiceImpl;

@Controller
public class PrestamosController {

	private PrestamosServiceImpl psi;
	private AlumnosServiceImpl asi;
	private LibrosServiceImpl lsi;
	
	

	public PrestamosController(PrestamosServiceImpl psi, AlumnosServiceImpl asi, LibrosServiceImpl lsi) {
		this.psi = psi;
		this.asi = asi;
		this.lsi = lsi;
	}

	@RequestMapping("/prestamos")
	public String listaPrestamos(Model model) {

		List<Prestamos> prestamos = psi.getList();

		model.addAttribute("prestamos", prestamos);

		return "prestamos/prestamoslist";
	}
	
	@RequestMapping("/prestamosvigo")
	public String listaPrestamosVigor(Model model) {

		List<Prestamos> prestamos = psi.getListFechasNulas();

		model.addAttribute("prestamos", prestamos);

		return "prestamos/prestamoslist";
	}
	
	@PostMapping("/insertprestamo")
	public String insertaPrestamo(@ModelAttribute("datos") PrestamoInsertObject pio) {
		
		Prestamos prestamo = new Prestamos();
		
		System.out.println(pio);
		
		prestamo.setAlumno(asi.get(pio.getCodAlumno()));
		
		prestamo.setLibro(lsi.get(pio.getCodLibro()));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			prestamo.setFechaPrestamo(sdf.parse(pio.getDate()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		psi.insert(prestamo);
		
		return "redirect:/";
		
	}
	
	@RequestMapping("/insertprestamoform")
	public String insertPrestamoForm(Model model) {
		
		PrestamoInsertObject pio = new PrestamoInsertObject();
		
		model.addAttribute("datos", pio);

		return "prestamos/insertPrestamoForm";
	}
	
	@GetMapping("/deleteprestamo")
	public String deleteLibro(@RequestParam("codigoP") int Id) {
		
		psi.delete(Id);
		
		
		return "redirect:/";
	}

}
