/**
 * 크롤러
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Parser1 {
 	private static String Address;
 	private static URL Url;
 	private static BufferedReader br;
 	private static HttpURLConnection con;
 	private static String protocol = "GET";

 	public static void main(String[] args) throws IOException {
 		 Address = "http://www.google.com";
 
  	Url = new URL(Address);
   	con = (HttpURLConnection) Url.openConnection();
  	con.setRequestMethod(protocol);
   	con.setRequestProperty("User-Agent", "Mozilla/5.0");
	br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));  // 버퍼 공간 열기

   	String temp;
   	String input = "";
   	while ((temp = br.readLine()) != null) {
				System.out.println(temp);
   	}
	
	br.close(); // 버퍼 공간 열면 항상 닫기 (모든 프로그램 동일)
 }
}