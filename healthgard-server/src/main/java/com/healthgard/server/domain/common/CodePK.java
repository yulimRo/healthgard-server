package com.healthgard.server.domain.common;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Embeddable
public class CodePK implements Serializable{

	private String code;
	
	private String upperCode;

	@Builder
	public CodePK(String code, String upperCode) {
		this.code = code;
		this.upperCode = upperCode;
	}
	
	
}
