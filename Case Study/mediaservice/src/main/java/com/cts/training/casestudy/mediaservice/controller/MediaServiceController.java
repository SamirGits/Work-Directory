package com.cts.training.casestudy.mediaservice.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.casestudy.mediaservice.entity.*;
import com.cts.training.casestudy.mediaservice.repository.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class MediaServiceController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	// dependency
	@Autowired
	private MediaServiceRepository mediaService;
	
	// @RequestMapping(value =  "/medias", method = {RequestMethod.GET, RequestMethod.PUT} )
	@GetMapping("/medias") // GET HTTP VERB
	public ResponseEntity<List<Media>> exposeAll() {
		
		List<Media> medias = this.mediaService.findAll();
		ResponseEntity<List<Media>> response = 
								new ResponseEntity<List<Media>>(medias, HttpStatus.OK);
		
		
		return response;
	}
	
	// {<data variable>}
	@GetMapping("/medias/{mediaId}") // GET HTTP VERB
	public ResponseEntity<Media> getById(@PathVariable Integer mediaId) {
		
		Media media = this.mediaService.findAll(mediaId);
		ResponseEntity<Media> response = 
				new ResponseEntity<Media>(media, HttpStatus.OK);

		return response;
	}
	
	// @RequestMapping(value =  "/medias", method = RequestMethod.POST)
	@PostMapping("/medias") // POST HTTP VERB
	public ResponseEntity<Media> save(@RequestBody Media media) {
		this.mediaService.addMedia(media);
		ResponseEntity<Media> response = 
				new ResponseEntity<Media>(media, HttpStatus.OK);

		return response;
	}
	
	@PutMapping("/medias")
	public ResponseEntity<Media> saveUpdate(@RequestBody Media media) {
		this.mediaService.updateMedia(media);
			
		ResponseEntity<Media> response = 
				new ResponseEntity<Media>(media, HttpStatus.OK);

		return response;
	}
	
	@DeleteMapping("/medias/{mediaId}")
	public ResponseEntity<Media> delete(@PathVariable Integer mediaId) {
		
		Media media = this.mediaService.findAllById(mediaId);
		this.mediaService.deleteMedia(mediaId);
		
		ResponseEntity<Media> response = 
				new ResponseEntity<Media>(media, HttpStatus.OK);

		return response;
	}
	
}
