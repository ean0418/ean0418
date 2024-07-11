$(function() {
	goResign();
	logoutEvent();
	idCheckEvent();
	searchAddressEvent();
});

function searchAddressEvent() {
	$("#ms_addr1, #ms_addr2").click(() => {
		new daum.Postcode({
			oncomplete: function(data) {
				$("#signup_ms_addr1").val(data.zonecode);
				$("#signup_ms_addr2").val(data.roadAddress);
			}
		}).open();
		
	});
    
}

function idCheckEvent() {
	$("#signup_ms_id").keyup(function() {
		let ms_id = $(this).val();
		// alert(ms_id);
		$.getJSON("member.id.check?ms_id=" + ms_id, function(memberJSON) {
			if (memberJSON.member[0] == null) {
				$("#signup_ms_id").css("color", "white");
			} else {
				$("#signup_ms_id").css("color", "red");
			}
		});
	});
}

function logoutEvent() {
	$("#logoutBtn").click(() => {
		let msg = confirm('로그아웃 하시겠습니까?');
		if (msg) {
			location.href = "member.logout";
		}
	});
}

function goResign() {
	$("#resignBtn").click(() => {
		let msg = prompt('탈퇴 하시겠습니까 ? Y/N');
		if (msg == 'Y') {
			let msg2 = confirm('정말 탈퇴하시겠습니까 ?');
			if (msg2) {
				alert('안녕히 가세요~');
				location.href = "member.delete";
			}
		}
	});
}