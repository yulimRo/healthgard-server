package com.healthgard.server.domain.common;

import javax.persistence.*;

import com.healthgard.server.domain.BaseTimeEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(
		name="code",
		uniqueConstraints={
				@UniqueConstraint(
						name="code_pk",
						columnNames={"code", "upper_code"}
				)
		}
)
public class Code extends BaseTimeEntity{

	@EmbeddedId
	private CodePK codePk;

	private String codeName;
	
	@Column
	private int sortOrder;
	
	@Column
	private String deleteYn;
	
}
