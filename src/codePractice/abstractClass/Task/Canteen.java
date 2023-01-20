package codePractice.abstractClass.Task;

public class Canteen extends School {

    public void fanAction() {
        System.out.println("Fan used");
    }

    public void waterAction() {
        System.out.println("water used");
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
        Canteen cn = new Canteen();
        cn.costAction(20,50);
    }
}
