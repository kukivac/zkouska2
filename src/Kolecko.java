import java.util.ArrayList;

public class Kolecko {
    //VLASTNOSTI
    private ArrayList<Jablko> arrayOfJablko;

    //KONSTRUKTOR
    Kolecko() {
        this.setArrayOfJablko(new ArrayList<>());
    }

    //GETTERY A SETTERY
    public void setArrayOfJablko(ArrayList<Jablko> arrayOfJablko) {
        this.arrayOfJablko = arrayOfJablko;
    }

    public ArrayList<Jablko> getArrayOfJablko() {
        return arrayOfJablko;
    }

    private Jablko getElementFromArrayOfJablko(int index) {
        ArrayList<Jablko> arrayOfJablko = this.getArrayOfJablko();
        int length = arrayOfJablko.toArray().length;
        index = this.lowerIndex(index,length);
        Jablko jablko = arrayOfJablko.get(index);
        return jablko;
    }

    //LOGIKA TŘÍDY
    public void addJablko(Jablko jablko) {
        this.arrayOfJablko.add(jablko);
    }

    public void printArrayOfJablko(int pocet) {
        for (int i = 0; i < pocet; i++) {
            System.out.println(this.getOutputOfElement(i));
        }
    }

    private String getOutputOfElement(int index) {
        Jablko jablko = this.getElementFromArrayOfJablko(index);
        return "Slovo: " + jablko.getName() + " Číslo: " + jablko.getNumber();
    }

    private int lowerIndex(int index, int length) {
        if (index > (length - 1)) {
            index = index - length;
            return this.lowerIndex(index, length);
        }
        return index;
    }
}