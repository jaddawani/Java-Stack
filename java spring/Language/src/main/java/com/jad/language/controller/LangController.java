package com.jad.language.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jad.language.models.Language;
import com.jad.language.services.LanguageServices;

@Controller
public class LangController {
	
	
	private final LanguageServices LanguageServices ;

    public LangController(LanguageServices  LanguageServices  ) {
        this.LanguageServices  = LanguageServices ;

    }
	
	
	
	
	   @RequestMapping("/languages")
	    public String index(Model model , @ModelAttribute("lang") Language lang) {
		   List<Language> langs = LanguageServices.allLanguage();
		   model.addAttribute("langs" , langs);
	       return "index.jsp";
    
	}

	   @RequestMapping(value="/createlang", method=RequestMethod.POST)
	    public String create(@Valid @ModelAttribute("lang") Language lang, BindingResult result) {
	        if (result.hasErrors()) {
	            return "index.jsp";
	        } else {
	        	LanguageServices.createLanguage(lang);
	            return "redirect:/languages";
	        }
	   }

	   
	   @RequestMapping("/languages/{id}")
	   public String detail(@PathVariable("id") Long id, Model model) {
	   Language lang = LanguageServices.findLanguage(id);
       model.addAttribute("lang", lang);
	   
       return "details.jsp";
	   

	   }
	   
	   @RequestMapping("/languages/edit/{id}")
	   public String edit(@PathVariable("id") Long id, Model model) {
	   Language lang = LanguageServices.findLanguage(id);
       model.addAttribute("lang", lang);
	   
       return "edit.jsp";
	   }
	   

	   
	   @RequestMapping(value="/languages/{id}/updating", method=RequestMethod.PUT)
	    public String update(@Valid @ModelAttribute("lang") Language lang ,@PathVariable("id") Long id, Model model, BindingResult result) 
	   {
	        if (result.hasErrors()) {
	            return "edit.jsp";
	        } else {
	        	LanguageServices.updatelanguage(lang);
	            return "redirect:/languages";
	        }
	    }
	   
	   
	   @RequestMapping(value="/languages/{id}/delete")
	    public String destroy(@PathVariable("id") Long id) {
		   LanguageServices.deleteLanguage(id);
	        return "redirect:/languages";
	    }
}
	   

