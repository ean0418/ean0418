import java.io.InputStream;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class LocSearchMain {
	public static void main(String[] args) {
		// 412e7727ffd0b8900060854044814879
		// 37.5044498 / 127.0245716 (y / x)

		// 기준점 주변 반경 5km이내에 검색한 키워드(입력)가 포함된 가게들을
		// 거리 기준으로 정렬 (JSON방식)
		try {

			Scanner k = new Scanner(System.in);
			System.out.print("검색 : ");
			String search = k.next();;
			search = URLEncoder.encode(search, "UTF-8");
			System.out.println(search);
			String address = "https://dapi.kakao.com/v2/local/search/keyword.json";
			address += "?query=" + search;
			address += "&y=37.5044498&x=127.0245716";
			address += "&radius=5000";
			address += "&sort=distance";
			
			// Authorization: KakaoAK 412e7727ffd0b8900060854044814879
			
			HashMap<String, String> headers = new HashMap<String, String>();
			headers.put("Authorization", "KakaoAK 412e7727ffd0b8900060854044814879");
			InputStream is = EanHttpClient.download(address, headers);
			String result = EanHttpClient.convert(is, "UTF-8");
			System.out.println(result);
		
			JSONParser jp = new JSONParser();
			JSONObject jo = (JSONObject) jp.parse(result);
			
			// 총 검색 결과 수
			JSONObject meta = (JSONObject) jo.get("meta");
			System.out.printf("총 검색 결과 수 : %d개\n", meta.get("total_count"));
			
			// 현재페이지 결과 수
			System.out.printf("총 검색 결과 수 : %d개\n", meta.get("pageable_count"));

			// 주소
			// 전화번호
			// 상호명
			// 기준점과의 거리
			JSONArray ja = (JSONArray) jo.get("documents");
			JSONObject data = null;
			for (int i = 0; i < ja.size(); i++) {
				data = (JSONObject) ja.get(i);
				System.out.printf("주소 : %s\n", data.get("address_name"));
				System.out.printf("전화번호 : %s\n", data.get("phone"));
				System.out.printf("상호명 : %s\n", data.get("place_name"));
				System.out.printf("거리 : %s\n", data.get("distance"));
			}
			// 를 출력

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
