import java.util.*;
public class reversenst4{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String ans=" ";
        for(int i=0;i<a.length();i++){
            ans=a.charAt(i)+(ans);
        }System.out.println(ans);
    }
}