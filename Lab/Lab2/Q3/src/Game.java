/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Game {

    private boolean previousWasWild = false;

    public String arrayTurn(ArrayListDeck deck) {

        Card card = deck.drawCard();
        String output = "";
        
        if(previousWasWild && card.getType() == Card.Type.NUMBER) {
            output = "Pick Colour :: ";
            previousWasWild = false;
        } else {
            output = card.toString();
            previousWasWild = (card.getType() == Card.Type.WILD);
        }

        return output;
    }
    
     public String linkedTurn(LinkedListDeck deck) {

        Card card = deck.drawCard();

        String output = "";
        
        if(previousWasWild && card.getType() == Card.Type.NUMBER) {
            output = "Pick Colour :: ";
            previousWasWild = false;
        } else {
            output = card.toString();
            previousWasWild = (card.getType() == Card.Type.WILD);
        }

        return output;
    }
}
