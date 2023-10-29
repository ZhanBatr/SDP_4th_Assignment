class Guitar implements MusicalInstrument {
    private boolean tuned = false;

    @Override
    public void play() {
        if (tuned) {
            System.out.println("Strumming the guitar strings.");
        } else {
            System.out.println("The guitar needs to be tuned first.");
        }
    }

    @Override
    public void tune() {
        System.out.println("Tuning the guitar.");
        tuned = true;
    }
}
