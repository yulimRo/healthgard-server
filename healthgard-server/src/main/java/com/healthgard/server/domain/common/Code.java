package com.healthgard.server.domain.common;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.healthgard.server.domain.BaseTimeEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Code extends BaseTimeEntity{
	
	@Id
	String code;
	@Column
	String codeName;
	@Column
	String upperCode;
	@Column
	int sortOrder;
	@Column
	String deleteYn;
	
}
