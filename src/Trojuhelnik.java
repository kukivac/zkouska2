public class Trojuhelnik {

    public static final String ROVNOSTRANNY = "Rovnostranný";
    public static final String ROVNORAMENNY = "Rovnoramenný";
    public static final String OBECNY = "Obecný";
    public static final String OSTROUHLY = "Ostroúhlý";
    public static final String TUPOUHLY = "Tupoúhlý";
    public static final String PRAVOUHLY = "Pravoúhlý";

    private double stranaA;
    private double stranaB;
    private double stranaC;
    private boolean platny = true;

    Trojuhelnik(double stranaA, double stranaB, double stranaC) {
        if ((stranaA + stranaB > stranaC) || (stranaA + stranaC > stranaB) || (stranaB + stranaC > stranaA)) {
            this.platny = false;
        } else {
            this.stranaA = stranaA;
            this.stranaB = stranaB;
            this.stranaC = stranaC;
        }
    }

    Trojuhelnik(double x) {
        this.stranaA = x;
        this.stranaB = x;
        this.stranaC = x;
    }

    private double obvod() {
        return this.stranaA + this.stranaB + this.stranaC;
    }

    private double obsah() {
        double a = this.stranaA;
        double b = this.stranaB;
        double c = this.stranaC;
        double s = ((a + b + c) / 2);
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    private String druhTrojuhlenikuStrany() {
        double a = this.stranaA;
        double b = this.stranaB;
        double c = this.stranaC;
        if ((a == b) && (a == c) && (b == c)) {
            return ROVNOSTRANNY;
        }
        if ((a == b) || (a == c) || (b == c)) {
            return ROVNORAMENNY;
        }
        return OBECNY;
    }

    private String druhTrojuhlenikuUhly() {
        double a = this.stranaA;
        double b = this.stranaB;
        double c = this.stranaC;

        double alfa = Math.cos(b / c);
        double beta = Math.cos(a / c);
        double gama = Math.cos(b / c);

        if ((alfa < 90) && (beta < 90) && (gama < 90)) {
            return OSTROUHLY;
        }
        if ((alfa == 90) && (beta == 90) && (gama == 90)) {
            return PRAVOUHLY;
        }
        return TUPOUHLY;
    }

    public void vypisinfo() {
        if (this.platny) {
            System.out.println("a:" + this.stranaA);
            System.out.println("b:" + this.stranaB);
            System.out.println("c:" + this.stranaC);
            System.out.println("obsah:" + this.obsah());
            System.out.println("obvod:" + this.obvod());
            System.out.println(druhTrojuhlenikuStrany());
            System.out.println(druhTrojuhlenikuUhly());
            System.out.println(" ");
        } else {
            System.out.println("Neplatný trojuhelnik");
            System.out.println(" ");
        }
    }
}
