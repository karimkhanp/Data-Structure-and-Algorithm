
import java.io.BufferedReader;
import java.util.Scanner;


class Merging
{
    void merge(int a[])
    {
        
    }


}

public class Merge {
    public static void main(String a[])
    {
        int[] ip=new int[10];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            String tocken=scan.next();
            ip[i]=Integer.parseInt(tocken);
        }

        Merging ob1=new Merging();
        ob1.merge(ip);

    }
}