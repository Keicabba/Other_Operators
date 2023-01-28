package it.figuccia;

public class TestOperators {
    public static void main(String[] args) {
        int a = 15;
        a+=5;
        a-=4;

        int b=a++;

        boolean statement1 = (b % 2) != 0;
        boolean statement2 = ((b * (b + 1)) % 3) == 0;

        if(statement1 && statement2) {
            System.out.println("b is an even number and the result of (b multiplied for b + 1) is a multiple of 3!");
        } else {
            System.out.println("One or both statements are false!");
        }
    }
}
