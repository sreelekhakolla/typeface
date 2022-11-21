import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String sree=sc.nextLine();
        String lekha=sc.nextLine();
        int len1=0,len2=0;
        for(char c: sree.toCharArray()) {
         len1++;
      }
        for(char c: lekha.toCharArray()) {
         len2++;
      }
        char x=lekha.charAt(len2-1);
        int count=0;
        for(int i=0;i<len1;i++)
        {
            if (sree.charAt(i)==x)
            {
              count+=1 ; 
            }
        }
        System.out.println(count);
    }
}
