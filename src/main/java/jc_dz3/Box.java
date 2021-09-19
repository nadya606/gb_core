package jc_dz3;

import java.awt.font.GlyphJustificationInfo;
import java.util.ArrayList;

public class Box <T extends Fruit> {
    public ArrayList<T> list = new ArrayList<>();
    

    public float getWeight() {
        return list * list.size(). //не могу разобраться что здесь должно быть в продолжении
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














/*
    public float getWeight() {
        float weight = 0.0f;
        for (T o : list) {
            weight += o.getWeight();
        }
        return weight;
    }

    public float compare(Box<?>o) {
        return Math.abs(this.getWeight() - o.getWeight());
    }
    public int compareTo(Object o) {
        return ((Box) o).size - size;
    }*/

}

