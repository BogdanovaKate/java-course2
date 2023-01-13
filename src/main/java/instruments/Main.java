package instruments;

public class Main {
    public static void main(String[] args) {
        Instrument guitar = new Guitar(7);
        Instrument drum = new Drum(50);
        Instrument trumpet = new Trumpet(10);
        Instrument[] instruments = new Instrument[]{guitar, drum, trumpet};
        playInstruments(instruments);
    }

    public static void playInstruments(Instrument[] instruments) {
        System.out.println("Инструменты играют: " );
        for (int i=0; i<instruments.length; i++) {
            instruments[i].play();
        }

    }
}
