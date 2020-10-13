$(document).ready(function () {
	$("#login").click(function (e) {
		e.preventDefault();
		e.stopPropagation();
			loginViaAjax();
	});

	function loginViaAjax() {
		var serviceUrl="http://localhost:8080/checkAuth";
		var url = window.location.href;
        var baseUrl = url.substring(0, url.lastIndexOf('/') + 1);
		var authData = {
            adminuserid: $('#userName').val().trim(),
			adminpwd: $('#password').val().trim()
        }
		$.ajax({
			type: "POST",
			url: serviceUrl,
			dataType: 'json',
			contentType: "application/json",
			data: JSON.stringify(authData),
			success: function (response) {
				if(response.msg==="login success"){
					window.location = baseUrl+"home";
				}else{
					$("#errors").prepend("Invalid credentials")
				}
			},
			error: function (e) {
				console.log("ERROR: ", e);
			},
		});

	}
});