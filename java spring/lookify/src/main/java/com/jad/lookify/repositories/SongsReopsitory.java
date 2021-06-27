package com.jad.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jad.lookify.models.Song;

@Repository
public interface SongsReopsitory extends CrudRepository<Song, Long> {

	List<Song> findAll();

	List<Song> findTop10ByOrderByRatingDesc();

	List<Song> findSongByArtist(String artist);
}
