public class Turtle {
    private String name;
    private int x;
    private int y;
    private boolean invisible;
    private String visibility;

    public Turtle(String name1) {
        x = 0;
        y = 0;
        invisible = false;
        name = name1;
    }

    public void showTurtle() {
        invisible = false;
    }

    public void hideTurtle() {
        invisible = true;
    }

    public void goTo(int xpos, int ypos) {
        x = xpos;
        y = ypos;
    }

    public void printStats() {
        if (invisible == false) {
            visibility = "visible";
        }
        else {
            visibility = "not visible";
        }
        System.out.println("turtle \"" + name + "\" is " + visibility + " at coordinates (" + x + ',' + y + ')');
    }
}
