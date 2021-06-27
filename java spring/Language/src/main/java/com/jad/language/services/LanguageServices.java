package com.jad.language.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jad.language.models.Language;
import com.jad.language.repositories.LanguageRepository;

@Service
public class LanguageServices {

	private final LanguageRepository langRepo;

	public LanguageServices(LanguageRepository langRepository) {
		this.langRepo = langRepository;
	}
	
	//get all languages
	
	public List<Language> allLanguage() {
        return langRepo.findAll();
    }
	
	
	//create language 
	 public Language createLanguage(Language x) {
	        return langRepo.save(x);
	    }
	 
	 //retrieves book "id"
	 public Language findLanguage(Long id) {
	        Optional<Language> optionalLang = langRepo.findById(id);
	        if(optionalLang.isPresent()) {
	            return optionalLang.get();
	        } else {
	            return null;
	        }
	    }
	 //return this.langRepo.findById(id).orElse(null);
	 
//	 public Language updateLanguage(Long id, String name, String creator, String version) {
//			Language lang = langRepo.findById(id).orElse(null);
//			lang.setName(name);
//			lang.setCreator(creator);
//			lang.setVersion(version);
//			
//			return langRepo.save(lang);
//		}
	 
	 
	 public Language updatelanguage(Language lang) {return langRepo.save(lang);}
	 
	
	 public void deleteLanguage(Long id) {
			langRepo.deleteById(id);
			
		}
	 
	 
}
