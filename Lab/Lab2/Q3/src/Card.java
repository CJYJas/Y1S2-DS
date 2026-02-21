/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Card {

    public enum Type {
        NUMBER,
        ACTION,
        WILD
    }

    private String colour;   
    private String value;  
    private Type type;

    public Card(String colour, String value, Type type) {
        this.colour = colour;
        this.value = value;
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public String getValue() {
        return value;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        if(type == Type.WILD) {
            return value + " :: ";
        }
        return colour + " " + value + " :: ";
    }
}