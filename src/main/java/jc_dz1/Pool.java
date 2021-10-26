package jc_dz1;

    public class Pool {
    public int length;

    public Pool(int length) {
        this.length = length;
        }

    @Override
    public void doSwim(Player animal) {
        animal.swim(length);
    }

}
