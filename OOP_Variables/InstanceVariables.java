public class InstanceVariables {
    String MyName = "Mugalu Wa Thumba Daniel";
    public void ReturnDanielFullName(){
        System.out.println("My Name is " + MyName);
    }
    public static void main(String[] args) {
        InstanceVariables I1 = new InstanceVariables();
        I1.ReturnDanielFullName();
    }
}