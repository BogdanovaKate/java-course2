package instruments;

public class Guitar implements Instrument {
    int strings;

    public Guitar(int strings) {
        this.strings = strings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара, у гитары: " + strings + " струн");
    }
}
