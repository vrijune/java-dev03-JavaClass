package ictgradschool.industry.javaclass.printpattern;

public class Pattern {

    private int repetitions;
    private char symbol;


    public Pattern(int repetitions, char symbol
    ) {

        this.repetitions = repetitions;
        this.symbol = symbol;
    }


    public void setNumberOfCharacters(int repetitions) {
        this.repetitions = repetitions;
    }

    ;

    public int getNumberOfCharacters() {
        return repetitions;
    }



    public String toString() {
        String x = "";
        for (int i = 0; i < repetitions; i++) {

            x += symbol;
        }
        return x;
    }
}

