package com.jad.lookify1.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jad.lookify1.models.Song;
import com.jad.lookify1.services.lookService;

@Controller
public class lookController {
	
	private final lookService lookServ;
	public lookController(lookService lookServ) {
		this.lookServ= lookServ;
	}
	
	
	@RequestMapping("/")
	public String renderHome() {
		return "home.jsp";
	}
	
	
	@RequestMapping("/new")
	public String newcreate(@ModelAttribute("songs") Song song) {
		return "new.jsp";
	}
	
	
	@RequestMapping("/dashboard")
	public String renderDashboard(Model model) {
		model.addAttribute("songs", lookServ.findAll());
		return "dashboard.jsp";
	}
	
	
	
	@RequestMapping(value="/new", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("songs") Song song, BindingResult result) {
        if (result.hasErrors()) {
            return "new.jsp";
        } else {
        	lookServ.createSong(song);
            return "redirect:/dashboard";
        }
    }
	
	@RequestMapping("/details/{id}")
	public String show() {
		
		
	}
}
