package Sprint1.Inlämningsuppgifter;

import javax.swing.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Nutrition[] plants = new Nutrition[]{
                new Cactus(0.2, "Igge"),
                new Palm(5, "Laura"),
                new Palm(1, "Putte"),
                new Carnivorous(0.7, "Meatloaf")
        };

            String type = JOptionPane.showInputDialog("Vilken växt ska få mat?");
            if(type == null)
                System.exit(0);
            if(type.equalsIgnoreCase("Igge"))
                JOptionPane.showMessageDialog(null,plants[0].getInformation());
            else if(type.equalsIgnoreCase("Laura"))
                JOptionPane.showMessageDialog(null,plants[1].getInformation());
            else if(type.equalsIgnoreCase("Putte"))
                JOptionPane.showMessageDialog(null,plants[2].getInformation());
            else if(type.equalsIgnoreCase("Meatloaf"))
                JOptionPane.showMessageDialog(null,plants[3].getInformation());

    }
}
