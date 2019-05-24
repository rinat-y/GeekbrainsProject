package theme4_OOP;

public class Cat extends Animal {

    @Override
    public void run(int d) {
        System.out.println("run: " + (d <= 200));
    }

    @Override
    public void jump(double h) {
        System.out.println("jump: " + (h <= 2.0));;
    }

    @Override
    public void swim(int s) {
        System.out.println("swim: false");
    }
}
