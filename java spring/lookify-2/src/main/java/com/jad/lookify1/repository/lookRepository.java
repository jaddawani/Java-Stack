package com.jad.lookify1.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jad.lookify1.models.Song;

@Repository
public interface lookRepository extends CrudRepository<Song, Long> {

	List<Song> findAll();
}
