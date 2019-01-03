package com.panacea.exercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.panacea.exercise.dto.ExerciseDTO;
import com.panacea.exercise.service.ExerciseService;

@RestController
@RequestMapping("/api/v1")
public class ExerciseController1 {

	private ExerciseService exerciseService;

	@Autowired
	public ExerciseController1(ExerciseService exerciseService) {

		this.exerciseService = exerciseService;
	}

	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public ResponseEntity<ExerciseDTO> login(@RequestBody ExerciseDTO exerciseDTO) {
			
		ExerciseDTO exerciseDTOresponse = new ExerciseDTO(); 
		exerciseDTOresponse = exerciseService.calculate(exerciseDTO);
		
			return new ResponseEntity<>(exerciseDTOresponse, HttpStatus.OK);
		}

	}

