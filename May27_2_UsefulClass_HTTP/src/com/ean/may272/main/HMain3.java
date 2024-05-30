package com.ean.may272.main;

import java.io.InputStream;

import com.ean.http.client.EanHttpClient;

public class HMain3 {
	public static void main(String[] args) {
		try {
			InputStream is = EanHttpClient.downlodad("https://www.naver.com");
			String result = EanHttpClient.convert(is, "UTF-8");
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
