public class MethodDemo {
    public static void main (String[] args) {

        //MethodDemo MethodDemo = new MethodDemo();
        MethodDemo2 MethodDemo2 = new MethodDemo2();
        //d.getData();
        //String name = MethodDemo.getData();
       // System.out.println(name);

        String name2 = MethodDemo2.getUserData();
        System.out.println(name2);

        //pag same class naman pede ganto na lang kahit walang new
        staticTest();

    }

    public String getData ()
    {
        System.out.println("Hello world");
        return "test";
    }
    public static String staticTest ()
    {
        System.out.println("Static test sa loob ng same class");
        return "StaticTest";
    }
}
