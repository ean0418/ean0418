package com.ean.jul103.boxoffice;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

@Service
public class BoxOfficeDAO {

	
	public String getKoreaMovie(HttpServletRequest req) {
		try {
URL u = new URL("https://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchWeeklyBoxOfficeList.xml?key=980d474fe310adb00fdce90b5ad133d1&targetDt=20240701");
			
			HttpURLConnection huc = (HttpURLConnection) u.openConnection();
			InputStream is = huc.getInputStream();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			
			
			StringBuffer sb = new StringBuffer();
			
			String line = null;
			while ((line = br.readLine()) != null) {
				sb.append(line.replace("\r\n", ""));
			}
			
		
			return sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
