package Sprint1.Inlämningsuppgifter;

public class Cactus extends Plant implements Nutrition {
    //inkapsling
    private final String typeOfWater = "Mineral water";

    public Cactus(double height, String name) {
        super(height, name);
    }

    //implementerar metod getInformation
    //polymorfism
    @Override
    public String getInformation() {
        return typeOfWater + " 0.02L";

    }

}

