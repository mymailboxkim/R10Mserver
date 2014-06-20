$(document).ready(function() {
	$("div.paging > a").on("click",function(e){
		e.preventDefault();
		var act = "/customer/notice_list"
		var href = $(this).attr('href');
		
		if(href == "#"){
			return false;
		}else{
			$("#notice_search_form #page").val(href.replace(/\?page=/,''));
			$("#notice_search_form").attr("action",act + href).submit();
		}
	});
	
	$("#search_btn").on("click",function(e){
		e.preventDefault();
		var act = "/customer/notice_list"
		
		$("#notice_search_form #page").val(1);
		$("#notice_search_form").attr("action",act).submit();
	});

	$("#sh_type").val('');

	$("[name=detail_link]").on("click",function(e){
		e.preventDefault();
		var act = "/customer/notice_detail"
			
		$("#notice_search_form #ntcatc_seq").val($("[name=ntcatc_seq]",this).val());
		$("#notice_search_form").attr("action",act).submit();
	});
});