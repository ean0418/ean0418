


function check() {
	
	let a_region = document.regForm.a_region;
	let a_color = document.regForm.a_color;
	let a_taste = document.regForm.a_taste;
	let a_price = document.regForm.a_price;
	let a_intro = document.regForm.a_intro;
	
	if (isEmpty(a_region) || isEmpty(a_color) || isEmpty(a_taste) || isEmpty(a_price) || isEmpty(a_intro)
	|| isNotNumber(a_price)) {
		alert('값을 다시 입력하세요');
		a_region.value = "";
		a_color.value = "";
		a_taste.value = "";
		a_price.value = "";
		a_intro.value = "";
		a_region.focus();
		return false;
	}
	return true;	
}