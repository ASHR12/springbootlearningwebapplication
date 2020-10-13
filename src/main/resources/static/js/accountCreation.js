$(document).ready(function () {
	$("#createaccount").click(function (e) {
		e.preventDefault();
		e.stopPropagation();
			createAccountViaAjax();
	});

	function createAccountViaAjax() {
		var accountNo= Math.floor(Math.random() * 10000000000000000);
		var ibEnr = $('input[name="enrollementoption"]:checked').val();
		var serviceUrl="http://localhost:8080/createAccount";
		var accountData = {
            firstname: $('#fname').val().trim(),
			lastname: $('#lname').val().trim(),
			age: $('#age').val().trim(),
			mobilenumber: $('#mobileNo').val().trim(),
			pannumber: $('#panNo').val().trim(),
			dob: $('#dob').val().trim(),
			emailid: $('#emailID').val().trim(),
			userid: $('#uname').val().trim(),
			pwd: $('#psswrd').val().trim(),
			accountId:accountNo,
			enrollforIB:ibEnr
        }
		$.ajax({
			type: "POST",
			url: serviceUrl,
			dataType: 'json',
			contentType: "application/json",
			data: JSON.stringify(accountData),
			success: function (response) {
				$("#successmessage").prepend("Account created successfully "+accountNo)
			},
			error: function (e) {
				console.log("ERROR: ", e);
			},
		});

	}
});