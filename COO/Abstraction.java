abstract class Race {
    public abstract void raceStart();

}

class Spa extends Race {

    public void raceStart() {
        System.out.println("It's lights out and away we go!!!");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Spa SpaGp = new Spa();
        SpaGp.raceStart();
    }
}
