import java.util.*;
class largest
{
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        int n,i,num,j;
        System.out.println("Enter the limit:");
        n=s1.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the numbers:");
            j=s1.nextInt();
            if(num<j)
            {
                num=j;
            }
        }
        System.out.println("The largest element is:"+num);
        s1.close();
    }
}
