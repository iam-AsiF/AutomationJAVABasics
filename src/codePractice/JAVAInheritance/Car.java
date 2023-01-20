package codePractice.JAVAInheritance;

public class Car {

    // method overload - multiple function name - same class - different param or return type
    public void gearUp() {
        System.out.println("Gear Up");
    }

    public void gearUp(int x) {
        System.out.println(x);
    }

    public void breakAction() {
        System.out.println("Break up");
    }

    public void acUp() {
        System.out.println("AC Manual/Automatic");
    }

    public void acUp(int a) {
        System.out.println("No AC ");
    }

    public static void main(String[] args) {
        Car call = new Car();
        call.gearUp();
        call.gearUp(6);
    }
}
