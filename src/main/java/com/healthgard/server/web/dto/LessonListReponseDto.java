package com.healthgard.server.web.dto;

import com.healthgard.server.domain.lesson.Lesson;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LessonListReponseDto{
	
	private Long lessonId;
	private String lessonType;
	private String lessonName;
	private int lessonMaxNum;
	private int lessonPrice;
	private String deleteYn;
	
	@Builder
	public LessonListReponseDto(Lesson entity) {
		this.lessonId = entity.getLessonId();
		this.lessonType = entity.getLessonType();
		this.lessonName = entity.getLessonName();
		this.lessonMaxNum = entity.getLessonMaxNum();
		this.lessonPrice = entity.getLessonPrice();
		this.deleteYn = entity.getDeleteYn();
	}
}
