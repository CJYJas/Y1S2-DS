/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;

public class ArrayListDeck {

    private final ArrayList<String> colours =
            new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Yellow"));

    private final ArrayList<String> numbers =
            new ArrayList<>(Arrays.asList("Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"));

    private final ArrayList<String> actions =
            new ArrayList<>(Arrays.asList("Reverse","Skip","Draw_Two"));

    private final ArrayList<String> wilds =
            new ArrayList<>(Arrays.asList("Wild","Wild_Draw_Four"));

    private final Random rand = new Random();

    public Card drawCard() {

        boolean isWild = rand.nextBoolean();

        if(isWild) {
            String wildValue = wilds.get(rand.nextInt(wilds.size()));
            return new Card(null, wildValue, Card.Type.WILD);
        }

        String colour = colours.get(rand.nextInt(colours.size()));

        boolean isNumber = rand.nextBoolean();

        if(isNumber) {
            String number = numbers.get(rand.nextInt(numbers.size()));
            return new Card(colour, number, Card.Type.NUMBER);
        } else {
            String action = actions.get(rand.nextInt(actions.size()));
            return new Card(colour, action, Card.Type.ACTION);
        }
    }
}