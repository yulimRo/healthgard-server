package com.healthgard.server.web.dto;

import com.healthgard.server.domain.lesson.Lesson;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LessonRegistRequestDto {

	private String lessonType;
	private String lessonName;
	private int lessonMaxNum;
	private int lessonPrice;
	private String deleteYn = "N";

	@Builder
	public LessonRegistRequestDto(String lessonType, String lessonName, int lessonMaxNum, int lessonPrice,
			String deleteYn) {
		this.lessonType = lessonType;
		this.lessonName = lessonName;
		this.lessonMaxNum = lessonMaxNum;
		this.lessonPrice = lessonPrice;
		this.deleteYn = deleteYn;
	}

	public Lesson toEntity() {
		return Lesson.builder()
				.lessonName(this.lessonName)
				.lessonMaxNum(this.lessonMaxNum)
				.lessonType(this.lessonType)
				.lessonPrice(this.lessonPrice)
				.deleteYn(this.deleteYn)
				.build();
	}

}
