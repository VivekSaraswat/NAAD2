package com.streamliners.task1;
class InvalidReplacementsException extends Exception{
    public InvalidReplacementsException (String message){
        super(message);
        System.out.println(message);
    }
}
public class SubTask4 {
    public static void main(String[] args) {
        System.out.println(modify("12332321", "2R3S1T4D"));

    }

    private static String modify(String s, String replacements) {
        String regex = "([0-9][A-Z])*$";
        if (replacements.matches(regex)) {
            System.out.println("Valid");
        } else {
            try {
                throw new InvalidReplacementsException("Invalid");
            } catch (InvalidReplacementsException e) {
                System.out.println(e);
                return null;
            }
        }
        return null;
    }
}