import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp {

    public static void main(String[] args) {

        int myNum = 10;
        String myName = "tarub";
        char letter = 't';
        double dec =1.12312312313 ;

        System.out.println(dec);

        //arrays -
        int [] arr= new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        //or
        int [] arr1= {2,4,6,8};
        System.out.println("*****************");
        // to convert the normal array to arraylist
//        List<String> arr1ArrayList = ArraysExample.asList(arr1);
//        arr1ArrayList.contains("2");

        //System.out.println(arr1[0]);

        //for loops
        for( int i=0; i<arr1.length; i++)
        {
            System.out.println(arr1[i]);
        }

        String [] names = {"test","mo"};

        for (int i=0; i< names.length; i++)
        {
            System.out.println(names[i]);
        }
        System.out.println("*****************");
        //enhanced for loop: you can use this the same
        for (String s: names)
        {
            System.out.println(s);
        }
        System.out.println("*****************");
        for (int s: arr1)
        {
            System.out.println(s);
        }

    }
}
