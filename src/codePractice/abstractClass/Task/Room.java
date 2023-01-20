package codePractice.abstractClass.Task;

public class Room extends School {

    public void fanAction() {
        System.out.println("Fan used");
    }

    public void waterAction() {
        System.out.println("water not used");
    }

    public void doorOpen() {
        System.out.println("door opened");
    }

    public void doorClose() {
        System.out.println("door closed");
    }

    @Override
    public int costAction(int totalHour, int perUnitCost) {
        int elecBill;
        elecBill = totalHour * perUnitCost;
        System.out.println(elecBill);
        return elecBill;
    }

    public static void main(String[] args) {

        Room rm = new Room();
        rm.costAction(10,50);

        rm.waterAction();
    }
}
