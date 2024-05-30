package com.ean.may271.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class EncodingMain {
	
	// Encoding : 정보의 형태나 형식을 변환하는 처리방식
	// 컴퓨터 : 전자기계 (전기가 흐르거나, 안흐르거나)
	// 'ㅋ' => 전기의 흐름으로 표현 (ex : 모스 부호) => encoding
	
	// Decoding : 인코딩 된 데이터 통신 전송 및 파일을 원래의 상태로 변환
	// 전기의 흐름 => 'ㅋ' : decoding
	
	// encoding 방식은 여러 종류가 있음 ! 
	// 추석 -A-> 1010 -A-> 추석
	// 추석 -B-> 0101 -C-> 설날
	// 추석 -C-> 0001 -???-> ?!?!?!
	
	// 전세계적으로 주력 : UTF-8 (Unicode Transform Format)
	// 한국만 타겟 : EUC-KR
	// MS전용 : MS949
	
	public static void main(String[] args) {
//		FileOutputStream fos = null;
//		try {																	// false값이면 덮어쓰기
//			fos = new FileOutputStream("C:\\Users\\sdedu\\Desktop\\Test/ean.txt", true);
//		} catch (FileNotFoundException e) {										// true 값이면 이어붙이기
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		OutputStreamWriter osw = null;
//		try {
//			osw = new OutputStreamWriter(fos, "UTF-8");
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		BufferedWriter bw = new BufferedWriter(osw);
//		try {
//			bw.write("adaskdljsadjsadjlas");
//			bw.append("\r\n");
//			bw.append("배고팡"+"\r\n");
//			bw.append("10월아 빨리와..."+"\r\n");
//			bw.flush();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			bw.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		BufferedReader br = null;
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\sdedu\\Desktop\\Test/ean.txt");
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			br = new BufferedReader(isr);
			
			String line = null;
			while ((line = br.readLine())!=null) {
				System.out.println(line);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
}
