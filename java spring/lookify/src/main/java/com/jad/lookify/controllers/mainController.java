package com.jad.lookify.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jad.lookify.models.Song;
import com.jad.lookify.services.SongService;

@Controller
public class mainController {

	private final SongService songserv;

	public mainController(SongService songserv) {
		this.songserv = songserv;
	}

	@RequestMapping("/")
	public String renderHome() {
		return "home.jsp";
	}

	@RequestMapping("/dashboard")
	public String renderDashboard(Model model) {
		model.addAttribute("songs", songserv.findAll());
		return "dashboard.jsp";
	}

	@RequestMapping(value = "/dashboard", method = RequestMethod.POST)
	public String searchartist(Model model, @RequestParam("dashSearchBox") String artist) {

		model.addAttribute("songs", songserv.findByArtist(artist));
		return "search.jsp";
	}

	@RequestMapping("/songs/new")
	public String renderNew(@ModelAttribute Song song) {
		return "new.jsp";
	}

	@RequestMapping(value = "/songs/new", method = RequestMethod.POST)
	public String addNew(@Valid @ModelAttribute Song song, BindingResult result) {

		if (result.hasErrors()) {
			return "new.jsp";
		} else {
			songserv.addNew(song);
			return "redirect:/dashboard";
		}

	}

	@RequestMapping("/topTen")
	public String rendertop10(Model model) {

		model.addAttribute("songs", songserv.getTopten());
		return "topten.jsp";

	}

	@RequestMapping("/songs/{id}")
	public String renderInfo(Model model, @PathVariable("id") Long id) {
		model.addAttribute("song", songserv.getSong(id).get());
		return "info.jsp";
	}

	@RequestMapping("/delete/{id}")
	public String destroy(@PathVariable("id") Long id) {

		songserv.del(id);
		return "redirect:/dashboard";

	}

}
