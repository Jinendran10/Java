import java.util.*;
class rev
{
    public static void main(String args[])
    {
        int n,i;
        String s= new String();
        String rev="";
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the String:");
        s=s1.nextLine();
        n=s.length();
        for(i=n-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        System.out.println("The reversed string is:"+rev);
        s1.close();
    }
}
