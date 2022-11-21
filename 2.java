import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String sree=sc.nextLine();
        String lekha=sc.nextLine();
        char x=lekha.charAt(lekha.length()-1);
        int count=0;
        for(int i=0;i<sree.length();i++)
        {
            if (sree.charAt(i)==x)
            {
              count+=1 ; 
            }
        }
        System.out.println(count);
    }
}
