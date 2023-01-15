public class Jablko {
    private String name;
    private int number;

    Jablko(String name) {
        this.name = name;
    }

    Jablko(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
