package com.healthgard.server.web.dto;

import java.time.LocalDateTime;

import com.healthgard.server.domain.trainer.Trainer;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class TrainerListReponseDto {

	private Long trainerId;
	private String name;
	private String birth;
	private String sex;
	private String telNo;
	private String addr1;
	private String addr2;
	private String roleCd;
	private String stateCd;
	private LocalDateTime updateDate;
	private String updateId;
	
	@Builder
	public TrainerListReponseDto(Trainer entity) {
		this.trainerId = entity.getTrainerId();
		this.name = entity.getName();
		this.birth = entity.getBirth();
		this.sex = entity.getSex();
		this.telNo = entity.getTelNo();
		this.addr1 = entity.getAddr1();
		this.addr2 = entity.getAddr2();
		this.roleCd = entity.getRoleCd();
		this.stateCd = entity.getStateCd();
	}

}
