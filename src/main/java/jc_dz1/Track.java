package jc_dz1;

public class Track {
    private int length;

    public Track(int length) {
        this.length = length;
        }

    @Override
    public void doRun(Player animal) {
        animal.run(length);
    }
}
