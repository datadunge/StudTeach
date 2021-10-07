public class Main {
    public static void main(String[] args) {
        Turtle test = new Turtle("jimmy");
        test.printStats();
        test.hideTurtle();
        test.printStats();
        test.goTo(3000000,3293);
        test.printStats();
        test.goTo(30,-32);
        test.showTurtle();
        test.printStats();
    }
}
