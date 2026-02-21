/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;

public class LinkedListDeck {

    private final LinkedList<String> colours =
            new LinkedList<>(Arrays.asList("Red", "Blue", "Green", "Yellow"));

    private final LinkedList<String> numbers =
            new LinkedList<>(Arrays.asList("Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"));

    private final LinkedList<String> actions =
            new LinkedList<>(Arrays.asList("Reverse","Skip","Draw_Two"));

    private final LinkedList<String> wilds =
            new LinkedList<>(Arrays.asList("Wild","Wild_Draw_Four"));

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
