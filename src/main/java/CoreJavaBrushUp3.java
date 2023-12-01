public class CoreJavaBrushUp3 {

    public static void main (String [] args) {

        //String literal - if same, will refer to the existing object
        String l = "Literal";
        String x = "Literal";

        //String new it will force to create a new memory even if the same text
        String t = new String ("Test");
        String t1 = new String ("Test");

        String test = "test lang ito";
        String[] splittedString = test.split(" lang");
        System.out.println(splittedString[0]);
        System.out.println(splittedString[1]);
        //System.out.println(splittedString[2]);
        System.out.println(splittedString[1].trim());
        System.out.println("************");

        for(int i = test.length()-1; i>=0; i--)
        {
            System.out.println(test.charAt(i));
        }
    }
}
