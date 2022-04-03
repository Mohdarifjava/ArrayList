package Arraylistmax;
import java.util.ArrayList;
import java.util.Collections;


public class Max_age {
    public void age()
    {
        ArrayList<Integer>int_age=new ArrayList<>();
        int_age.add(23);
        int_age.add(24);
        int_age.add(25);
        int_age.add(26);

        Integer max= Collections.max(int_age);
        System.out.println("Employee age:"+int_age);
        System.out.println("Employee max:"+max);
        System.out.println("Employee remove:"+int_age.remove(1));
        System.out.println("Employee size:"+int_age.size());


    }

    public static void main(String[] args) {
        Max_age ma=new Max_age();
        ma.age();
    }




}
