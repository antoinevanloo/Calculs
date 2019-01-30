public class Main {

    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        Calculs monCalcul = new Calculs(14,22);
        System.out.println(monCalcul.soustraire());
        CalculsTest monCalculTest = new CalculsTest();
        monCalculTest.additionner();
    }

}
