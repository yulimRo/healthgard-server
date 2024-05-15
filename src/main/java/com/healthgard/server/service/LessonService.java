package com.healthgard.server.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.healthgard.server.domain.lesson.Lesson;
import com.healthgard.server.domain.lesson.LessonRepository;
import com.healthgard.server.web.dto.LessonListReponseDto;
import com.healthgard.server.web.dto.LessonRegistRequestDto;
import com.healthgard.server.web.dto.LessonUpdateRequestDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LessonService {

	private final LessonRepository lessonRepository;
	
	public List<LessonListReponseDto> findAll() {
		List<LessonListReponseDto> lessonList = lessonRepository.findAll()
				.stream().map(LessonListReponseDto::new).collect(Collectors.toList());
		return lessonList;
	}
	
	@Transactional
	public Long save(LessonRegistRequestDto requestDto) {
		Lesson lesson = requestDto.toEntity();
		Lesson registLesson = lessonRepository.save(lesson);
		return registLesson.getLessonId();
		
	}
	
	@Transactional
	public Lesson findById(Long id) {
		Lesson lesson = lessonRepository.findById(id).orElseThrow(() -> new NullPointerException("조회되는 수업 정보가 없습니다."));
		return lesson;
	}
	
	@Transactional
	public Long update(Long id, LessonUpdateRequestDto requestDto) {
		
		Lesson lesson = lessonRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("조회되는 수업 정보가 없습니다. "));
		
		lesson.update(requestDto.getLessonType()
				, requestDto.getLessonName()
				, requestDto.getLessonMaxNum()
				, requestDto.getLessonPrice()
				, requestDto.getDeleteYn());
		
		return id;
		
	}
	
	@Transactional
	public Long delete(Long id) {
		
		Lesson lesson = lessonRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("조회되는 수업 정보가 없습니다. "));
		lessonRepository.deleteById(lesson.getLessonId());
		
		return id;
		
	}
}
