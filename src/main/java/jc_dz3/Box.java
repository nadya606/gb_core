package jc_dz3;

import java.util.ArrayList;

public class Box <T extends Fruit> {
    public ArrayList<T> list = new ArrayList<>();


    public float getWeight() {
        float weight = 0.0f;
        for (T o : list) {
            weight += o.getWeight();
        }
        return weight;
    }

    public void add(T fruit) {
        list.add(fruit);
    }

    @Override
    public String toString() {
        return "Box" +
                "list=" + list;
    }

    public boolean compare() {
        return Math.abs(this.getWeight() - getWeight()) < 0.001;
    }

}

