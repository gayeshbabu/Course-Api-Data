package com.courseApiApp.topics;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;



public interface TopicsRepository extends JpaRepository<Topics, Integer> {

	//public Topics findById();
}
