import java.util.*;
public class evenst1{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String ans=" ";
        for(int i=0;i<a.length();i+=2){
            ans+=a.charAt(i);
        }
        System.out.println(ans);
    }
}