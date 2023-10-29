class Violin implements MusicalInstrument {
    private boolean tuned = false;

    @Override
    public void play() {
        if (tuned) {
            System.out.println("Bowing the violin and creating enchanting music.");
        } else {
            System.out.println("The violin needs to be tuned first.");
        }
    }

    @Override
    public void tune() {
        System.out.println("Tuning the violin.");
        tuned = true;
    }
}
