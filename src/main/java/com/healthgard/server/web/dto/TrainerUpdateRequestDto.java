package com.healthgard.server.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class TrainerUpdateRequestDto {

	private String name;
	private String birth;
	private String sex;
	private String telNo;
	private String addr1;
	private String addr2;
	private String roleCd;
	private String stateCd;
	
	@Builder
	public TrainerUpdateRequestDto(String name, String birth, String sex, String telNo, String addr1, String addr2,
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


	

}
