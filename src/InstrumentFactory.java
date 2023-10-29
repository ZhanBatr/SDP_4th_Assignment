public class InstrumentFactory {
        public MusicalInstrument createInstrument(String type) {
            switch (type.toLowerCase()) {
                case "guitar":
                    return new Guitar();
                case "piano":
                    return new Piano();
                case "violin":
                    return new Violin();
                default:
                    throw new IllegalArgumentException("Invalid instrument type: " + type);
            }
        }
    }
