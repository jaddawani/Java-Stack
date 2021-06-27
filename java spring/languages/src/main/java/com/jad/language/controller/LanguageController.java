package com.jad.language.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jad.language.models.Language;
import com.jad.language.services.LanguageService;


@Controller
public class LanguageController {
 private final LanguageService LanguageService ;

    public LanguageController(LanguageService  LanguageService  ) {
        this.LanguageService  = LanguageService ;

    }

     @RequestMapping("/language")
     public String index(Model model) {
//         List<Language> language1 = LanguageService .allLanguages();
//         Language language=new Language();
//         model.addAttribute("languages", language1);
//         model.addAttribute("language", language);
         return "index.jsp";
    }
//     @RequestMapping("/languages/edit/{id}")
//     public String edit(Model model) {
//         List<Language> language = LanguageService .allLanguages();
//         model.addAttribute("language", language);
//         return "edit.jsp";
//    }
}