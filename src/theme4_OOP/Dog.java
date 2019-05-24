package theme4_OOP;

public class Dog extends Animal {

    @Override
    public void run(int d) {
        System.out.println("run: " + (d <= 500));
    }

    @Override
    public void jump(double h) {
        System.out.println("jump: " + (h <= 0.5));;
    }

    @Override
    public void swim(int s) {
        System.out.println("swim: " + (s <= 10));
    }
}
