
   public class StringLiteral
{
   public static void main(String args[])
{
    String a="  SARFARAJ  ";
    String b=" sayyed";

     System.out.println("Lower case string is: " + a.toLowerCase());

     System.out.println("Upper case string is: " + b.toUpperCase());

     System.out.println("Length of the string is: " + a.length());

     System.out.println("String contains SAR or not: " + a.contains("SAR"));

     System.out.println("Character at index 2 is: " + a.charAt(2));

     System.out.println("Index no. at character e is: " + b.indexOf('e'));

    System.out.println("Two string are equals or not: " + a.equals(b));

    System.out.println("Replce character in string is: " + a.replace('J','Z'));

    System.out.println("Check eqaul ignore case: " + a.equalsIgnoreCase(b));

    System.out.println("Trim string is: " + a.trim());

    System.out.println("Concate string is: " + a.concat(b));

    System.out.println("Substring is:" + a.substring(1,5));

} 
}
