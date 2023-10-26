package Assignment;
import java.util.*;
public class Shuffle {
   public static void main(String[] args){
    ArrayList<Integer> ar= new ArrayList<>();
    ar.add(1);
    ar.add(2);
    ar.add(3);
    ar.add(4);
    ar.add(5);
    ar.add(6);
    ar.add(7);
    Collections.shuffle(ar);
    for(int x:ar){
        System.out.println(x);
    }
    }
}