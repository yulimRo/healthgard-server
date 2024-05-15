/**
 * 
 */
var main = {
    init : function (){
		
		var _this = this;

	 $("#lessonSaveBtn").click(function(){
		 _this.lessonSave();
	  });
	  
      $("#updateLessonMoveBtn").click(function(){
            window.location.href='/lesson/update/' + $(this).parent().siblings().eq(0).text();
	  });
	  
	 $("#lessonUpdateBtn").click(function(){
             _this.lessonUpdate();
	  });
	 $("#lessonDeleteBtn").click(function(){
             _this.lessonDelete();
	  });
	  
	  $('select#lessonType option[value=' + $("input#lessonType").val()+ ']').prop("selected","selected");
	  $('input[name=modifyLessonDeleteYn][value=' + $("#deleteYn").val()+']').prop("checked","checked");
	  
    },
	lessonSave : function(){
		var data = {
            lessonName : $('.lesson-save-form#lessonName').val(),
            lessonMaxNum : $('.lesson-save-form#lessonMaxNum').val(),
            lessonPrice : $('.lesson-save-form#lessonPrice').val(),
            lessonType : $('.lesson-save-form#lessonType option:selected').val(),
       		deleteYn : $('input[name=registLessonDeleteYn]').val(),
        };
        
        $.ajax({
           type :'POST',
           url : '/api/lesson',
           dataType : 'json',
           contentType : 'application/json; charset=utf-8',
           data : JSON.stringify(data)
        }).done(function(){
            alert('신규 수업 정보가 등록되었습니다.');
            window.location.href='/lesson/list';
        }).fail(function (error){
            alert(JSON.stringify(error));
        });
	},
	lessonUpdate : function(){
		var id = $('#lessonId').val();
		
		var data = {
            lessonName : $('.lesson-update-form#lessonName').val(),
            lessonMaxNum : $('.lesson-update-form#lessonMaxNum').val(),
            lessonPrice : $('.lesson-update-form#lessonPrice').val(),
            lessonType : $('.lesson-update-form#lessonType option:selected').val(),
       		deleteYn : $('input[name=modifyLessonDeleteYn]:checked').val(),
        };
        
        $.ajax({
           type :'POST',
           url : '/api/lesson/update/' + id,
           dataType : 'json',
           contentType : 'application/json; charset=utf-8',
           data : JSON.stringify(data)
        }).done(function(){
            alert('수업 정보가 수정되었습니다.');
            window.location.href='/lesson/list';
        }).fail(function (error){
            alert(JSON.stringify(error));
        });
	},
	lessonDelete : function(){
		var id = $('#lessonId').val();
		
        $.ajax({
           type :'POST',
           url : '/api/lesson/remove/' + id,
           dataType : 'json',
           contentType : 'application/json; charset=utf-8'
        }).done(function(){
            alert('수업 정보가 삭제되었습니다.');
            window.location.href='/lesson/list';
        }).fail(function (error){
            alert(JSON.stringify(error));
        });
	},
}

main.init();