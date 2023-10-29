import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InstrumentFactory factory = new InstrumentFactory();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Musical Instruments Shop!");
        List<MusicalInstrument> ownedInstruments = new ArrayList<>();

        while (true) {
            System.out.print("Enter the instrument you want to play/tune (guitar/piano/violin) or 'exit' to quit: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("exit")) {
                break;
            }

            if (input.equals("list")) {
                System.out.println("Owned Instruments:");
                for (int i = 0; i < ownedInstruments.size(); i++) {
                    System.out.println(i + 1 + ". " + ownedInstruments.get(i).getClass().getSimpleName());
                }
            } else if (input.startsWith("play") || input.startsWith("tune")) {
                String[] parts = input.split(" ");
                if (parts.length == 2) {
                    int instrumentIndex = Integer.parseInt(parts[1]) - 1;
                    if (instrumentIndex >= 0 && instrumentIndex < ownedInstruments.size()) {
                        MusicalInstrument instrument = ownedInstruments.get(instrumentIndex);
                        if (parts[0].equals("play")) {
                            instrument.play();
                        } else if (parts[0].equals("tune")) {
                            instrument.tune();
                        }
                    } else {
                        System.out.println("Invalid instrument index.");
                    }
                } else {
                    System.out.println("Invalid command format.");
                }
            } else {
                try {
                    MusicalInstrument instrument = factory.createInstrument(input);
                    ownedInstruments.add(instrument);
                    System.out.println("You now own a " + instrument.getClass().getSimpleName() + "!");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        System.out.println("Thank you for visiting the Musical Instruments Shop!");
    }
}
