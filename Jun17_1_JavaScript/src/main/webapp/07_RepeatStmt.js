// 7. 반복문
//	동일한 작업을 여러변 반복할 떄 사용

// 1 ~ 10 출력 document.write()

// for

for (let i = 1; i <= 10; i++) {
	document.write(i + " ");
}
document.write("<br>-------------<br>")
// while
let i1 = 1;
while (i1 < 11) {
 document.write(i1 + " ");
  i1++;
  }
 document.write("<br>-------------<br>")
// do-while
let i2 = 1;
do {
	document.write(i2 + " ");
	i2++;
} while (i2 < 11);
document.write("<br>-------------<br>")

// 반복문 깨기
//	break : 멈추고 해당 반복문을 빠져나옴
//	continue : 해당 반복문을 멈추고 다음 반복으로 넘어가서 실행
//	return : 비공식적