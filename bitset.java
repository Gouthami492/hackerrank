import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        for(int i=0;i<m;i++){
            String ip = s.next();
            switch(ip.charAt(0)){
                case 'A':
                if(s.nextInt()==1){
                    b1.and(b2);
                }else{
                    b2.and(b1);
                }
                break;
                case 'O':
                if(s.nextInt()==1){
                    b1.or(b2);
                }else{
                    b2.or(b1);
                }
                break;
                case 'X':
                if(s.nextInt()==1){
                    b1.xor(b2);
                }else{
                    b2.xor(b1);
                }
                break;
                case 'F':
                if(s.nextInt()==1){
                    b1.flip(s.nextInt());
                }else{
                    b2.flip(s.nextInt());
                }
                break;
                case 'S':
                if(s.nextInt()==1){
                    b1.set(s.nextInt());
                }else{
                    b2.set(s.nextInt());
                }
                break;
            }
            System.out.println(b1.cardinality()+" "+b2.cardinality());
            if(s.hasNextLine())
               s.nextLine();
        }
    }
}
