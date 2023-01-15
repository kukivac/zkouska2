public class Main {
    public static void main(String[] args) {
        Kolecko kolecko = new Kolecko();
        kolecko.addJablko(new Jablko("golden1",51));
        kolecko.addJablko(new Jablko("golden2",52));
        kolecko.addJablko(new Jablko("golden3",53));
        kolecko.addJablko(new Jablko("golden4",54));
        kolecko.addJablko(new Jablko("golden5",55));

        kolecko.printArrayOfJablko(15);

        System.out.println(" ");

        Trojuhelnik trojuhelnik1 = new Trojuhelnik(2,3,4);
        Trojuhelnik trojuhelnik2 = new Trojuhelnik(4);
        Trojuhelnik trojuhelnik3 = new Trojuhelnik(8,6,9);

        trojuhelnik1.vypisinfo();
        trojuhelnik2.vypisinfo();
        trojuhelnik3.vypisinfo();
    }
}