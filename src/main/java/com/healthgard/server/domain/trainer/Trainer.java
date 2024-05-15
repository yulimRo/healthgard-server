package com.healthgard.server.domain.trainer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.healthgard.server.domain.BaseTimeEntity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Trainer extends BaseTimeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long trainerId;
	String name;
	String birth;
	String sex;
	String telNo;
	String addr1;
	String addr2;
	String roleCd;
	String stateCd;
	
	@Builder
	public Trainer(Long trainerId, String name, String birth, String sex, String telNo, String addr1, String addr2,
			String roleCd, String stateCd) {
		this.trainerId = trainerId;
		this.name = name;
		this.birth = birth;
		this.sex = sex;
		this.telNo = telNo;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.roleCd = roleCd;
		this.stateCd = stateCd;
	}
	
	public Long update(String name, String birth, String sex, String telNo, String addr1, String addr2,
	String roleCd, String stateCd) {
		this.name = name;
		this.birth = birth;
		this.sex = sex;
		this.telNo = telNo;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.roleCd = roleCd;
		this.stateCd = stateCd;
		
		return this.trainerId;
	}
	
	

}
