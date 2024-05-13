package com.healthgard.server.web;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.healthgard.server.domain.common.Code;
import com.healthgard.server.service.CodeService;
import com.healthgard.server.service.TrainerService;
import com.healthgard.server.util.DateFormatUtil;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class IndexController {
	
	private final TrainerService trainerService;
	
	private final CodeService codeService;
	
	/**
	 * Index Page 
	 * @return
	 */
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	/**
	 * Login Page
	 * @return
	 */
	@GetMapping(value = {"/login",""})
	public String login() {
		return "login";
	}
	
	/**
	 * New Join Page
	 * @return
	 */
	@GetMapping("/join")
	public String join() {
		return "join";
	}
	
	/**
	 * Trainer List Page                                                                                                                     
	 * @return
	 */
	@GetMapping("/trainer/list")
	public String trainerList(Model model) {
		model.addAttribute("trainers", trainerService.findAll());
		return "trainer/trainerList";
	}
	
	/**
	 * New Trainer Regist Page
	 * @return
	 */
	@GetMapping("/trainer/regist")
	public String trainerRegist(Model model) {
		
		List<Code> workState = codeService.findAllByUpperCode("WORK_STATE");
		List<Code> rolePosition = codeService.findAllByUpperCode("ROLE_POSITION");
		
		model.addAttribute("workStateCodeList",workState);
		model.addAttribute("rolePositionCodeList",rolePosition);
		model.addAttribute("today", DateFormatUtil.convertToStrYYYYMMDD_Dash(new Date()));
		return "trainer/createTrainerForm";
	}
}
