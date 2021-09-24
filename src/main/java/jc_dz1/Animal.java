package jc_dz1;

public abstract class Animal {

    public String name;
    //private boolean onDistance;
    public int maxRunDistance;
    public int maxSwimDistance;


    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }


    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробежал дистанцию");
        } else {
            System.out.println(name + " не пробежал");
        }
    }
    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println(name + " проплыл басейн");
        } else {
            System.out.println(name + " не проплыл");
        }
    }

}
