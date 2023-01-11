package programee;

import java.util.HashMap;

public class Dist {
	public static void main(String[] args) {
		
	
String s="abcdefaaa";
HashMap<Character,Integer>hm=new HashMap<>();
for(int i=0;i<s.length();i++) {
	Character ch=s.charAt(i);
	
	if(hm.containsKey(ch)) {
		hm.put(ch, hm.get(ch)+1);
		}
	else {
		hm.put(ch, 1);
	}
}System.out.println(hm);

	}
}
