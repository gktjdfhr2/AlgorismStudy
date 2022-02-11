package dailyAlgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class HSR_17219 {
		
	public static void main(String[] args) throws IOException{
		//입력을 위한 BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//주소와 비밀번호가 담아지는 map
		HashMap<String, String> map = new HashMap<String, String>();
		
		//입력값을 공백에 맞춰 저장할 StringTokenizer
		StringTokenizer st;
		int info, time;
		
		//주소의 개수와 비밀번호를 찾을 주소 개수 를 입력받음
		st = new StringTokenizer(br.readLine());		
		info = Integer.parseInt(st.nextToken());
		time = Integer.parseInt(st.nextToken());
		
		//입력한 주소 개수 만큼 맵에 값 추가
		for (int i = 0; i < info; i++) {
			st = new StringTokenizer(br.readLine());
			map.put(st.nextToken(), st.nextToken());
		}
		
		//입력한 비밀번호 찾기 개수 만큼 반복
		for (int i = 0; i < time; i++) {
			String url =br.readLine();
			
			//입력한 url 값이 map에 key로 값을 가지고 있을시 해당  key의 value(비밀번호) 를 출력
			if(map.containsKey(url)) {
				System.out.println(map.get(url));
			}
		}
	}
}
