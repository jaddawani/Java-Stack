package com.jad.lookify1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jad.lookify1.models.Song;
import com.jad.lookify1.repository.lookRepository;

@Service
public class lookService {
	
	private final lookRepository lookReopo;
	public lookService(lookRepository lookReopo) {
		this.lookReopo= lookReopo;
	}
	
		
	
	public void createSong(Song song) {
		lookReopo.save(song);
	}
	
	public List<Song> findAll() {

		return lookReopo.findAll();

	}
	
	
	public Song show(long id) {
		
		return lookReopo.findById(id).orElse(null);
		
	}
	

}
