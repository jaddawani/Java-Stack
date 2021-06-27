package com.jad.language.services;

import java.util.List;
import java.util.Optional;

//...
import org.springframework.stereotype.Service;

import com.jad.language.models.Language;
import com.jad.language.repository.LanguageRepository;



@Service
public class LanguageService {

private static final Object Language = null;
private final LanguageRepository LanguageRepository;
 
 public LanguageService(LanguageRepository LanguageRepository) {
     this.LanguageRepository = LanguageRepository;
 }
 
 public List<Language> allLanguages() {
     return LanguageRepository.findAll();
 }
 
 
 

 public Language createLanguage(Language b) {
     return LanguageRepository.save(b);
 }
 


 public Language findLanguage(Long id) {
     Optional<Language> optionalLanguage = LanguageRepository.findById(id);
     if(optionalLanguage.isPresent()) {
         return optionalLanguage.get();
     } else {
         return null;
     }
 }
//public Language updateBook(Long id, String name, String creator, String version) {
//	Language language = LanguageRepository.findById(id).orElse(null);
//	language.setname(name);
//	Language.setcreator(creator);
//	Language.setversion(version);
//	
//	return LanguageRepository.save(Language);
//}
public void deleteLanguage(Long id) {
	LanguageRepository.deleteById(id);
	
}

 
}
