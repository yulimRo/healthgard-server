package com.healthgard.server.domain.lesson;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.healthgard.server.domain.BaseTimeEntity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Lesson extends BaseTimeEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long lessonId;
	
	@Column
	private String lessonType;
	
	@Column
	private String lessonName;
	
	@Column
	private int lessonMaxNum;
	
	@Column
	private int lessonPrice;
	
	@Column
	private String deleteYn;

	@Builder
	public Lesson(Long lessonId, String lessonType, String lessonName, int lessonMaxNum, int lessonPrice,
			String deleteYn) {
		this.lessonId = lessonId;
		this.lessonType = lessonType;
		this.lessonName = lessonName;
		this.lessonMaxNum = lessonMaxNum;
		this.lessonPrice = lessonPrice;
		this.deleteYn = deleteYn;
	}
	
	public Long update (String lessonType, String lessonName, int lessonMaxNum, int lessonPrice, String deleteYn) {
		this.lessonType = lessonType;
		this.lessonName = lessonName;
		this.lessonMaxNum = lessonMaxNum;
		this.lessonPrice = lessonPrice;
		this.deleteYn = deleteYn;
		
		return this.lessonId;
	}
	
	
	
}
