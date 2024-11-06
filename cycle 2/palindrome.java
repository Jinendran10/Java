import java.util.*;
class palindrome{
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        int len,i;
        String str;
        String rev="";
        System.out.println("Enter the String:");
        str=s1.nextLine();
        len=str.length();
        for(i=0;i<len;i++)
        {
            rev=rev+str.charAt(len-i-1);
        }
        if(rev.equals(str))
        {
            System.out.println("The given string is a palindrome!");
        }
        else{
            System.out.println("THe given string is not a palindrome!");
        }
        s1.close();
    }
}
