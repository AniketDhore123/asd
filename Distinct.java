package programee;

import java.util.Arrays;

public class Distinct {

	public static void main(String[] args) {
		char[]ch= {'a','a','c','d','e'};
		int[] frequency=new int[26];
	
	for(int c:ch) {
		int j=c-97;
		frequency[j]=frequency[j]+1;
	}
	//System.out.println(Arrays.toString(frequency));
	
	for(int index=0;index<26;index++) {
		int asciiValue=index+97;
		char pk=(char)asciiValue;
		if(frequency[index]!=0) {
			System.out.println(pk+"has occured"+frequency[index]);
		}
	}
	
	}
}
