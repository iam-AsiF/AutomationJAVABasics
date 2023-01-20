package codePractice.JAVAInheritance;

public class BMW extends Car {

    // method Override - inherit function from other class - but different action
    @Override
    public void acUp() {
        System.out.println("AC Manual");
    }

    public static void main(String[] args) {
        BMW call = new BMW();
        call.gearUp();
        call.breakAction();
        call.acUp();
    }

}
