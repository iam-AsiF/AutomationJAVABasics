package codePractice.abstractClass.Task;

public abstract class School {


    public void fanAction() {

    }

    public void waterAction() {
        System.out.println("water off");
    }

    public void doorOpen() {

    }

    public void doorClose() {

    }

    abstract public int costAction(int totalHour, int perUnitCost);

}
