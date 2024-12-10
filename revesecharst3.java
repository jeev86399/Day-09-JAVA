import java.util.*;
public class revesecharst3{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        char b[]=a.toCharArray();
        int n=b.length;
        int l=0;
        int h=n-1;
        while(l<=h){
            char temp=b[l];
            b[l]=b[h];
            b[h]=temp;
            l++;
            h--;
        }
        String res=new String(b);
        System.out.println(res);
    }
}