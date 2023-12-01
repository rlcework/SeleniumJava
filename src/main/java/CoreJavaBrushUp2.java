import java.util.ArrayList;

public class CoreJavaBrushUp2 {

    public static void main (String [] args) {

        int[] arr2 = {1,2,4,5,6,7,8,9,10,122};

        //2,4,6,8,122
        for(int i=0; i< arr2.length; i++)
        {
            if (arr2[i] % 2 == 0)
            {
                System.out.println(arr2[i]);
                //break;
            }
            else
            {
                System.out.println(arr2[i]+" is not an even number");
            }
        }

        //Dynamic arrays when the limit always changing
        ArrayList<String> a = new ArrayList<String>();
        a.add("rahul");
        a.add("test");
        a.add("testmo");
        a.add("selenium");
        System.out.println(a.get(2));
        System.out.println(a.size());

        for(int i=0; i<a.size(); i++ )
       {
           System.out.println(a.get(i));
       }
        for (String val :a)
        {
            System.out.println(val);
        }

        //to check item is present in ArrayList
        a.contains("testmo");
    }
}
