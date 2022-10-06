package Sprint1.Inlämningsuppgifter;

public class Carnivorous extends Plant implements Nutrition {
    //inkapsling
    private final String typeOfWater = "Protein";

    public Carnivorous(double height, String name) {
        super(height, name);
    }

    //implementerar metod getInformation
    //polymorfism
    @Override
    public String getInformation() {
        return typeOfWater + " " + String.format("%.2fL",  0.1 +(0.2 * getHeight()));
    }
}
