package com.healthgard.server.web.dto;

import java.time.LocalDateTime;

import com.healthgard.server.domain.trainer.Trainer;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class TrainerListReponseDto {

	Long trainerId;
	String name;
	String birth;
	String sex;
	String tel_no;
	String addr;
	String role_cd;
	String state_cd;
	LocalDateTime updateDate;
	String updateId;
	
	@Builder
	public TrainerListReponseDto(Trainer entity	) {
		this.trainerId = entity.getTrainerId();
		this.name = entity.getName();
		this.birth = entity.getBirth();
		this.sex = entity.getSex();
		this.tel_no = entity.getTelNo();
		this.addr = entity.getAddr1() + " " + entity.getAddr2();
		this.role_cd = entity.getRoleCd();
		this.state_cd = entity.getStateCd();
	}

}
