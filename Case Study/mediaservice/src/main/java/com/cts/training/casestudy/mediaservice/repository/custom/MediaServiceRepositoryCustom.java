package com.cts.training.casestudy.mediaservice.repository.custom;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cts.training.casestudy.mediaservice.repository.*;
import com.cts.training.casestudy.mediaservice.entity.*;

public class MediaServiceRepositoryCustom {


	@Autowired
	private MediaServiceRepository mediaServiceRepository;
	
	public List<Media> findAllMedia() {
		// add additional logic
		return this.mediaServiceRepository.findAll();
	}
	
	public Media findMediaById(Integer id) {
		// TODO Auto-generated method stub
		// resolves problem of null reference exception
		Optional<Media> record =  this.mediaServiceRepository.findById(id);
		// reduces the chance of NullException
		
		// can check if object is there
		Media media = new Media();
		if(record.isPresent())
			media = record.get();
		return media;
		
	}

	public boolean addMedia(Media media) {
		// TODO Auto-generated method stub
		this.mediaServiceRepository.save(media);
		return true;
	}

	public boolean updateMedia(Media media) {
		// TODO Auto-generated method stub
		this.mediaServiceRepository.save(media);
		return true;
	}

	public boolean deleteMedia(Integer id) {
		// TODO Auto-generated method stub
		this.mediaServiceRepository.deleteById(id);
		return true;
	}



}
