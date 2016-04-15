package org.isep.gapp.controllers;

import org.isep.gapp.metier.IRespoAppMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/respoApp")
public class RespoAppController {
	@Autowired
	private IRespoAppMetier metier;
	@RequestMapping(value="/index")
	public String index(Model model){
		return "gestions";
		
	}

}
