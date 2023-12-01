import java.util.HashMap;
public class Hasmap {

    public static void main (String [] args) {

        HashMap<String, String> testId= new HashMap<>();

        int row = 10;

        testId.put("Test_"+row, "Test");

        System.out.println(testId);
        System.out.println(testId.get("Test_"+row));
    }
}
