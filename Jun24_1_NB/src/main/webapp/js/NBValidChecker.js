function check() {
	console.log("asd");
	let numBox = document.nbForm.userAns;
	 
	if (isEmpty(numBox) || atLeastLetter(numBox) ||isNotNumber(numBox)
	 || numBox.value[0] == numBox.value[1]
	 || numBox.value[0] == numBox.value[2]
	 || numBox.value[1] == numBox.value[2]) {
		alert("Please fill in Num properly.");
		numBox.value = "";
		numBox.focus();
		return false;
	} 
	return true;
}