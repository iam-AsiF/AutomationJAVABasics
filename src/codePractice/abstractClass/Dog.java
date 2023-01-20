package codePractice.abstractClass;
 class Dog extends Animal{

    @Override
    public void sound() {
        System.out.println("Sound is fine");
    }

    @Override
    public void food() {
        System.out.println("food is great");
    }

    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.sound();

        Animal an = new Dog();
        an.sound();
        an.test();
    }
}
