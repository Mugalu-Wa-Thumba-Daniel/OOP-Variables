public class StaticVariables {
    static String MyName = "Mugalu Wa Thumba Daniel";
    public static void main(String[] args) {
        StaticVariables mugaluName = new StaticVariables();
        String name = mugaluName.ReturnMyName();
        System.out.println("My name is "+name);
    }
    public String ReturnMyName(){
        return MyName;
    }
}