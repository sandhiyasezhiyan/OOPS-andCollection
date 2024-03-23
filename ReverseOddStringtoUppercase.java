package OOPsAssignment3;

public class ReverseOddStringtoUppercase {
public static void main(String[] args) {
	String a="changemyself";
	String upper="";
	char[] word = a.toCharArray();
	for(int i =0;i<a.length();i++) {
		char b= word[i];
		if(i%2!=0) {
			upper = upper +Character.toUpperCase(b);
			
		} else {
			upper = upper+word[i];
		}
		}
	System.out.println(upper);
	
}
}
