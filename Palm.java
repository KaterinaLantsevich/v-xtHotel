package Sprint1.Inlämningsuppgifter;

public class Palm extends Plant implements Nutrition {
    //inkapsling
    private final double liter = 0.5;
    private final String typeOfWater = "tap water ";

    public Palm(double height, String name) {
        super(height, name);
    }

    //implementerar metod getInformation
    //polymorfism
    @Override
    public String getInformation() {
        return typeOfWater + liter * super.getHeight() + "L" ;//returnera resultatet på en gång
    }

}
