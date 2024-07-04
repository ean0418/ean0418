package com.ean.jul042.student;

public interface StudentMapper {
	// method 리턴타입
	//	insert/ update / delete => 영향을 받은 데이터의 수 - int (리턴타입)
	
	
	
	// 메소드명 - mapper.xml의 id와 맞추기!
	// 파라미터 - mapper.xml의 parameterType과 맞추기
	public abstract int regStudent(Student s);
	
}
