package pe.edu.cibertec.DAWI_CL1_RubioGuerreroJoseAntonio.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}

}
