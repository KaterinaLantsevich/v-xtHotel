package Sprint1.Inlämningsuppgifter;

//Superclass Plant
public abstract class Plant {
    private final double height;
    private final String name;

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public Plant(double height, String name) {
        this.height = height;
        this.name = name;
    }
}
