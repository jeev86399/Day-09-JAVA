import java.util.*;
public class oddst2{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String ans=" ";
        for(int i=1;i<a.length();i+=2){
            ans+=a.charAt(i);
        }
        System.out.println(ans);
    }
}