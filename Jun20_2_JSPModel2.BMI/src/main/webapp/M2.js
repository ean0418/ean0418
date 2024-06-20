function bmiCheck() {
	let nameBox = document.p.name;
	let heightBox = document.p.height;
	let weightBox = document.p.weight;
	let photoBox = document.p.photo;

	if (isEmpty(nameBox) || atLestLetter(nameBox, 2)) {
		alert("Please fill in ur name properly.");
		nameBox.value = "";
		nameBox.focus();
		return false;
	} else if (isEmpty(heightBox) || isNotNumber(heightBox)
		|| atLeastLetter(heightBox, 3)) {
		alert("please fill in ur height properly.");
		heightBox.value = "";
		heightBox.focus();
		return false;
	} else if (isEmpty(weightBox) || isNotNumber(weightBox)
		|| atLeastLetter(weightBox, 3)) {
		alert("please fill in ur weight properly.");
		weightBox.value = "";
		weightBox.focus();
		return false;
	} else if (isEmpty(photoBox) || (isNotType(photoBox, "png") && isNotType(photoBox, "gif")
		&& isNotType(photoBox, "jpg") && isNotType(photoBox, "bmp"))) {
		alert("please fill in ur photo properly.");
		photoBox.value = "";
		return false;
	}
	return true;
}