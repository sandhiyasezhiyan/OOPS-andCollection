package OOPsAssignment3;

public class ReverseOddWords {
public static void main(String[] args) {
String a="iam a software tester";
char[] word = a.toCharArray();
char[] result = new char[word.length/2];
int j=0;
for(int i=0;i<word.length;i++) {
	if(i%2!=0) {
		result[j]=word[i];
		j++;
	}
}
for(int i = result.length-1;i>=0;i--) {
	System.out.println(""+result[i]);
}
	
}
}
