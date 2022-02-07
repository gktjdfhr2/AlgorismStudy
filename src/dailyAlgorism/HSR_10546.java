package dailyAlgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HSR_10546  {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int time = Integer.parseInt(br.readLine());
		String name = "";
		Map<String, Integer> man = new HashMap(); 
		for (int i = 0; i < (time*2) -1; i++) {
			name = br.readLine();
			if(man.containsKey(name)) {
				man.put(name, man.get(name) +1);
			}
			else {
				man.put(name, 1);
			}
		}
		
		for(Entry<String, Integer> ent : man.entrySet()) {
			if(ent.getValue()%2 != 0) {
				System.out.println(ent.getKey());
			}
		}
		
		
	}
}
//이 내용은 Java로 알고리즘을 준비하시는 분들을 위한 내용이므로 다른 언어를 사용하시는 분들은 건너뛰셔도 됩니다.
//
//일부 회사에서는 알고리즘의 통과 여부에 더해 성능까지 측정하기도 하는데, 물론 기본적으로는 구현을 잘 해야겠지만 공통적으로 다음을 적용하면 조금이나마 성능을 높일 수 있습니다.
//
//입력을 받기 위해서는 Scanner보다 BufferedReader를 사용하는 것이 좋다.
//한 줄 입력이 여러번 들어오는 경우에는 split보다 StringTokenizer를 사용하여 파싱하는 것이 좋다.
//여러 번 출력해야 하는 경우에는 StringBuilder를 사용해 한번에 출력하는 것이 것이 좋다.
//Array를 사용하는 것보다 ArrayList를 사용하는 것이 좋다.
//ArrayList를 정렬하기 위해서는 Collections.sort()를 사용한다.
//배열을 초기화하기 위해서는 java.util.Arrays의 Arrays.fill(배열, 초기화값)을 사용한다.
//연속으로 있는 숫자를 입력받기 위해서는 1번 대신에 2번을 사용하자 ex) 10111010101
//String[] inputs = br.readLine().split(""); 
//br.read() - '0'
//
//
//출처: https://mangkyu.tistory.com/181 [MangKyu's Diary]