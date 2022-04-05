package 4april;

public class palindrome2 {
    public static void palindrome2{
    Scanner S = new Scanner(System.in);
        int x = S.nextInt();
        int temp=x;
        int y=0;
        while(temp>0)
        {
            int z = temp%10;
            y*=10;
            y+=z;
            temp/=10;
        }
       if(y==x)System.out.print("true");
       else System.out.print("false");

    }
}
