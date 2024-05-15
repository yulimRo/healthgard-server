package com.healthgard.server.web.dto;

import com.healthgard.server.domain.trainer.Trainer;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class TrainerRegistRequestDto {

	private String name;
	private String birth;
	private String sex;
	private String telNo;
	private String addr1;
	private String addr2;
	private String roleCd;
	private String stateCd;
	
	@Builder
	public TrainerRegistRequestDto(String name, String birth, String sex, String telNo, String addr1, String addr2,
			String roleCd, String stateCd) {
		this.name = name;
		this.birth = birth;
		this.sex = sex;
		this.telNo = telNo;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.roleCd = roleCd;
		this.stateCd = stateCd;
	}

	public Trainer toEntity() {
		return Trainer.builder()
				.name(this.name)
				.birth(this.birth)
				.sex(this.sex)
				.telNo(this.telNo)
				.addr1(this.addr1)
				.addr2(this.addr2)
				.roleCd(this.roleCd)
				.stateCd(this.stateCd)
				.build();
	}
	

}
