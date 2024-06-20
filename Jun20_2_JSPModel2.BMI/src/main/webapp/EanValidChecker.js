// 잘못됐으면 true값 (뭔가 문제가 되면 true, 정상적이면 false인 컨셉)

// <input>을 넣었을 때
//	아무것도 안썻으면 true, 뭐라도 썻으면 false
function isEmpty(input) {
	return (!input.value);
}

// <input>을 넣었을 때
//	한글 / 특수문자가 적혀있다면 true, 없다면 false
function containsAnother(input) {
	let pass = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ@_.";
	
	let iv = input.value;
    for (let i = 0; i = iv.length; i++) {
		if (pass.indexOf(iv[i]) == -1) { // pass에 있는 내용 중에서
										// 내가 쓴 내용이 없으면
			return true;
		}	
	}
    return false;
}

// <input>, 글자 수를 넣었을 때
//	그 글자 수보다 적으면 true, 그 글자 수 이상이면 false
function atLeastLetter(input, len) {
	return(input.valuse.length < len);
}

// <input> x 2개 넣었을 떄
// 내용이 다르면 true, 같으면 false (pw,pw확인)
function notEqualPw(input1, input2) {
	return (input1.value != input2.value);
}
















