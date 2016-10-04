$(function(){
	$(".btnApply").on("click", function(){
		//Validation
		//.trim() 앞뒤공백 없애주는 메소드
		var name = $("#txtName").val().trim();
		var email = $("#txtEmail").val().trim();
		var passward = $("#txtPassward").val().trim();
		var passwardConfirm = $("#txtPasswardConfirm").val().trim();
		var imgProfile = $("#imgProfile").val();

		//console.log(name,email,passward,passwardConfirm,imgProfile);//console 확인

		if (name == ""){
			alert("이름을 입력하세요.");
			$("#txtName").focus();
			return;
		}
		else if (email == ""){
			alert("이메일을 입력하세요.");
			$("#txtEmail").focus();
			return;
		}
		else if (passward == ""){
			alert("비밀번호를 입력하세요.");
			$("#txtPassward").focus();
			return;
		}
		else if (passward != passwardConfirm){
			alert("비밀번호확인을 동일하게 입력하세요.");
			$("#txtPasswardConfirm").focus();
			return;
		}

		//send Data to server
	});
});