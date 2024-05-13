package com.healthgard.server.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.healthgard.server.domain.trainer.TrainerRepository;
import com.healthgard.server.web.dto.TrainerListReponseDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TrainerService {

	private final TrainerRepository trainerRepository;
	
	public List<TrainerListReponseDto> findAll() {
		List<TrainerListReponseDto> trainerList = trainerRepository.findAll()
				.stream().map(TrainerListReponseDto::new).collect(Collectors.toList());
		return trainerList;
	}
}
