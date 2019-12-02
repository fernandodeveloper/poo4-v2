package controller;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Constantes;
import model.Familiar;

@Controller
@RequestMapping("/familiar")

public class FamiliarController {
	
	
	@RequestMapping("/showForms")
	public String showForm(Model familiarModel) {
		Familiar familiar = new Familiar();
		familiarModel.addAttribute("familiar", familiar);
		return "familiar-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("familiar") Familiar familiarModel, 
			BindingResult bindingResult) {
	

		if(bindingResult.hasErrors())
			return "familiar-form";
		
		return "familiar-confirmation";
	}
	
	
	
}
