package com.healthgard.server.domain.common;

import com.healthgard.server.domain.BaseTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@NoArgsConstructor
@Embeddable
public class CodePK implements Serializable {

	@Column(name="code")
	private String code;

	@Column(name="upper_code")
	private String upperCode;
	
}
