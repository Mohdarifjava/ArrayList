package Arraylistmax;
import java.util.ArrayList;
import java.util.Collections;


public class Maxvalue {
    public void salary() {


        ArrayList<Integer> int_value = new ArrayList<>();
        int_value.add(23000);
        int_value.add(24000);
        int_value.add(25000);
        int_value.add(26000);

        Integer max=Collections.max(int_value);
        System.out.println("Arraylist salary:"+int_value+max);
        System.out.println("Arraylist salary:"+max);

    }
    public static void main (String args[])
    {
        Maxvalue mx=new Maxvalue();
        mx.salary();
    }
}