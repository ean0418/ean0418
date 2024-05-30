import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;

import org.kxml2.io.KXmlParser;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.ean.http.client.EanHttpClient;

public class weatherMain {

	// http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4146125000

	// 시간 : hour
	// 온도 : temp
	// 날씨 : wfkor
	// 바람 방향 : wdKor
	// 콘솔 출력

	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("C:\\Users\\sdedu\\Desktop\\Test/Weather.txt", true);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);

			String address = "http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4146125000";
			InputStream is = EanHttpClient.downlodad(address);
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "UTF-8");

			int type = xpp.getEventType();
			String tagName = null;

			while (type != XmlPullParser.END_DOCUMENT) {
				if (type == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
				} else if (type == XmlPullParser.TEXT) {
					if (tagName.equals("hour")) {
						bw.write(xpp.getText() + ",");
					} else if (tagName.equals("temp")) {
						bw.write(xpp.getText() + ",");
					} else if (tagName.equals("wfKor")) {
						bw.write(xpp.getText() + ",");
					} else if (tagName.equals("wdKor")) {
						bw.write(xpp.getText() + "\r\n");
						bw.flush();
					}

				} else if (type == XmlPullParser.END_TAG) {
					tagName = "";
				}
				xpp.next();
				type = xpp.getEventType();
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
