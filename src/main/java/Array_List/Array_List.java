package Array_List;
import java.util.ArrayList;


public class Array_List {

    public static void main(String args[]){

        ArrayList<Integer> ar = new ArrayList<>();

        ar.add(35);
        ar.add(1);
        ar.add(67);

        System.out.println(ar);

        int b = ar.get(1);

        System.out.println(b);

    }
}
