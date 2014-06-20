$('document').ready(function(){
			function moveSlider(index){
				var willMoveLeft=-(index*400);
				$('.slider_panel').animate({left:willMoveLeft}, 'slow');
				$('.control_button[data-index='+index+']').addClass('active');
				$('.control_button[data-index!='+index+']').removeClass('active');
			}
			$('.control_button').each(function(index){
				$(this).attr('data-index',index);
				}).click(function(){
					var index=$(this).attr('data-index');
					moveSlider(index);
				});

			var randomNumber = Math.round(Math.random()*3);
			moveSlider(randomNumber);
			
			//--�����̴� �ʱ�ȭ
			var rndNum = Math.floor(Math.random()*3)
			moveSlider(rndNum);
});