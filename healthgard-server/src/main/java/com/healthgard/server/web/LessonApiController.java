package com.healthgard.server.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthgard.server.service.LessonService;
import com.healthgard.server.web.dto.LessonRegistRequestDto;
import com.healthgard.server.web.dto.LessonUpdateRequestDto;

import lombok.RequiredArgsConstructor;

/**
 * Api Controller Of Lesson
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/lesson")
public class LessonApiController {
	
	private final LessonService lessonService;
	
	/**
	 * Reigst New Lesson 
	 * @param requestDto Trainer Info To Regist
	 * @return Long trainerId Trainer Id of Registed Trainer
	 */
	@PostMapping(value = "")
	public Long regist(@RequestBody LessonRegistRequestDto requestDto) {
		Long lessonId = lessonService.save(requestDto);
		return lessonId;
	}
	 
	/**
	 * Modify Lesson Info
	 * @param requestDto Trainer Info To Regist
	 * @return Long trainerId Trainer Id of Registed Trainer
	 */
	@PostMapping(value = "/update/{id}")
	public Long update(@PathVariable String id, @RequestBody LessonUpdateRequestDto requestDto) {
		Long lessonId = lessonService.update(Long.valueOf(id), requestDto);
		return lessonId;
	}
	@PostMapping(value = "/remove/{id}")
	public Long remove(@PathVariable String id) {
		Long lessonId = lessonService.delete(Long.valueOf(id));
		return lessonId;
	}

}
