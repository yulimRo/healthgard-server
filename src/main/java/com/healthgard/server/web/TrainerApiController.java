package com.healthgard.server.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.healthgard.server.service.TrainerService;
import com.healthgard.server.web.dto.TrainerRegistRequestDto;
import com.healthgard.server.web.dto.TrainerUpdateRequestDto;

import lombok.RequiredArgsConstructor;

/**
 * Api Controller Of Trainer
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/trainer")
public class TrainerApiController {
	
	private final TrainerService trainerService;
	
	@PostMapping(value = "/login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	/**
	 * Reigst New Trainer 
	 * @param requestDto Trainer Info To Regist
	 * @return Long trainerId Trainer Id of Registed Trainer
	 */
	@PostMapping(value = "")
	public Long regist(@RequestBody TrainerRegistRequestDto requestDto) {
		Long trainerId = trainerService.save(requestDto);
		return trainerId;
	}
	 
	@PostMapping(value = "/update/{id}")
	public Long update(@PathVariable String id, @RequestBody TrainerUpdateRequestDto requestDto) {
		Long trainerId = trainerService.update(Long.valueOf(id), requestDto);
		return trainerId;
	}
	@PostMapping(value = "/remove/{id}")
	public Long remove(@PathVariable String id) {
		Long trainerId = trainerService.delete(Long.valueOf(id));
		return trainerId;
	}

}
