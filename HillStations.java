// Superclass HillStations
class HillStations {
    public void location() {
        System.out.println("Location: Hill Station");
    }

    public void famousFor() {
        System.out.println("Famous For: Scenic beauty and tourism");
    }
}

// Subclass Manali
class Manali extends HillStations {
    @Override
    public void location() {
        System.out.println("Location: Manali, Himachal Pradesh");
    }

    @Override
    public void famousFor() {
        System.out.println("Famous For: Adventure sports and picturesque landscapes");
    }
}

// Subclass Mussoorie
class Mussoorie extends HillStations {
    @Override
    public void location() {
        System.out.println("Location: Mussoorie, Uttarakhand");
    }

    @Override
    public void famousFor() {
        System.out.println("Famous For: Hilltops, waterfalls, and colonial architecture");
    }
}

// Subclass Gulmarg
class Gulmarg extends HillStations {
    @Override
    public void location() {
        System.out.println("Location: Gulmarg, Jammu and Kashmir");
    }

    @Override
    public void famousFor() {
        System.out.println("Famous For: Skiing, snow-capped peaks, and natural beauty");
    }
}

public class Main {
    public static void main(String[] args) {
        // i. Call the location() and famousFor() method by the Parent class (Hillstations class)
        HillStations hillStation = new HillStations();
        hillStation.location();
        hillStation.famousFor();

        // ii. Call the location() and famousFor() method by all subclasses and print accordingly
        Manali manali = new Manali();
        Mussoorie mussoorie = new Mussoorie();
        Gulmarg gulmarg = new Gulmarg();

        System.out.println("\nCalling location() and famousFor() methods by all subclasses:");
        manali.location();
        manali.famousFor();

        mussoorie.location();
        mussoorie.famousFor();

        gulmarg.location();
        gulmarg.famousFor();
    }
}
