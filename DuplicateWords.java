package OOPsAssignment3;

public class DuplicateWords {
public static void main(String[] args) {
	String str="We learn Java basics as part of java sessions in java week1";
	int count;
	str = str.toLowerCase();
	String[] word = str.split(" ");
	System.out.println("Duplicates of the string:");
	for(int i=0;i<word.length;i++) {
		count=1;
		for(int j=i+1;j<word.length;j++) {
			if(word[i].equals(word[j])) {
				count++;
				word[j]="0";
			}
			
		}
		
		if(count>1 && word[i]!="0") {
			System.out.println(word[i]);
		}
	}

		
	
  }
}
