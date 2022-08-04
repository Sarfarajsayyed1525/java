
public class VowelAndConsonantCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int vowelCount=0;
     int consonantCount=0;
     String s="MY NAME IS SAYYED SARFARAJ";
     s=s.toLowerCase();
     for(int i=0;i<s.length();i++)
     { 
     if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' && s.charAt(i)=='u')
     {
    	 vowelCount++;
     }
     else if(s.charAt(i)>='a' && s.charAt(i)<='z' )
     {
    	 consonantCount++;
     }
     }
     System.out.println("Vowel count is" + " " + vowelCount);
     System.out.println("Consonant count is"+ " " + consonantCount);
	}

}
