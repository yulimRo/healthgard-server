package com.healthgard.server.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.healthgard.server.domain.trainer.Trainer;
import com.healthgard.server.domain.trainer.TrainerRepository;
import com.healthgard.server.web.dto.TrainerListReponseDto;
import com.healthgard.server.web.dto.TrainerRegistRequestDto;
import com.healthgard.server.web.dto.TrainerUpdateRequestDto;

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
	
	@Transactional
	public Long save(TrainerRegistRequestDto requestDto) {

		Trainer trainer = requestDto.toEntity();
		Trainer registTrainer = trainerRepository.save(trainer);
		return registTrainer.getTrainerId();
		
	}
	
	@Transactional
	public Trainer findById(Long id) {
		Trainer trainer = trainerRepository.findById(id).orElseThrow(() -> new NullPointerException("조회되는 트레이너 정보가 없습니다."));
		return trainer;
	}
	
	@Transactional
	public Long update(Long id, TrainerUpdateRequestDto requestDto) {
		
		Trainer trainer = trainerRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("조회되는 트레이너 정보가 없습니다. "));
		
		trainer.update(requestDto.getName()
				,requestDto.getBirth()
				, requestDto.getSex()
				, requestDto.getTelNo()
				, requestDto.getAddr1()
				, requestDto.getAddr2()
				, requestDto.getRoleCd()
				,requestDto.getStateCd());
		
		return id;
		
	}
	
	@Transactional
	public Long delete(Long id) {
		
		Trainer trainer = trainerRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("조회되는 트레이너 정보가 없습니다. "));
		trainerRepository.deleteById(trainer.getTrainerId());
		
		return id;
		
	}
}
