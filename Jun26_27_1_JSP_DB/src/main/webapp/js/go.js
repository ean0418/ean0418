function goAppleDetail(loc) {
	location.href = "AppleDetailController?a_region=" + loc;	
}

function deleteApple(loc) {
	let t = confirm(`${loc} 정말 지우겟소?`);
	if (t) {
	location.href = "AppleDeleteController?a_region=" + loc;		
	}
}



