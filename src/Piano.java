class Piano implements MusicalInstrument {
    private boolean tuned = false;

    @Override
    public void play() {
        if (tuned) {
            System.out.println("Playing a beautiful melody on the piano.");
        } else {
            System.out.println("The piano needs to be tuned first.");
        }
    }

    @Override
    public void tune() {
        System.out.println("Tuning the piano.");
        tuned = true;
    }
}