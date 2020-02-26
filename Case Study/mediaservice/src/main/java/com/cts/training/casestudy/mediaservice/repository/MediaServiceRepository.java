package com.cts.training.casestudy.mediaservice.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.training.casestudy.mediaservice.entity.Media;

public interface MediaServiceRepository extends JpaRepository<Media, Integer>{


}
