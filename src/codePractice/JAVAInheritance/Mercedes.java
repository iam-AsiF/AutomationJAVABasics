package codePractice.JAVAInheritance;

public class Mercedes extends Car {

    // method Override - inherit function from other class - but different action
    @Override
    public void acUp() {
        System.out.println("AC Automatic");
    }

    public static void main(String[] args) {
        Mercedes call = new Mercedes();
        call.gearUp();
        call.breakAction();
        call.acUp();
    }
}
