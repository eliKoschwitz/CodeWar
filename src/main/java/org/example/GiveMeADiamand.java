package org.example;

public class GiveMeADiamand {
    public static String repeat(int count, String with) {
        String nameDesString = new String(new char[count]).replace("\0", with);
        return nameDesString;
    }

    public static String print (int n) {
        int input = n;
        String dia = "";
        int spaces = 1;
        spaces = input / 2;
        int astrix = 1;
        boolean flag = true;

        if (n % 2 == 0) {
            System.out.println("not Working!");
            return dia;
        } else {
            for (int i = 0; i < input; i++) {
                dia = repeat(spaces, " "); // here everything is overwritten
                dia = dia + repeat(astrix,"*");
                dia = dia + "\r";
                System.out.print(dia);

                if(astrix < input && flag) {
                    astrix = astrix + 2;
                    spaces = spaces - 1;
                } else {
                    flag = false;
                    astrix = astrix - 2;
                    spaces = spaces + 1;
                }
            }
        }
        return dia;
    }

    public static void main(String[] args) {
        int input =11;
        print(input);
        //System.out.println(print(input));
    }
}

