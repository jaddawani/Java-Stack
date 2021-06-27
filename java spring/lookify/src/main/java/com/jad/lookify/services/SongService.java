package com.jad.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jad.lookify.models.Song;
import com.jad.lookify.repositories.SongsReopsitory;

@Service
public class SongService {

	private final SongsReopsitory songrepo;

	public SongService(SongsReopsitory songrepo) {
		this.songrepo = songrepo;
	}

	public void addNew(Song s) {
		songrepo.save(s);
	}

	public List<Song> findAll() {

		return songrepo.findAll();

	}

	public List<Song> getTopten() {
		return songrepo.findTop10ByOrderByRatingDesc();
	}

	public Optional<Song> getSong(Long id) {
		return songrepo.findById(id);
	}

	public void del(Long id) {
		songrepo.deleteById(id);
	}

	public List<Song> findByArtist(String artist) {

		return songrepo.findSongByArtist(artist);

	}

}
