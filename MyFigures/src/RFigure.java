import java.awt.*;
import java.util.Random;

public abstract class RFigure {
    private Point startPoint;
    protected int[] color= new int[3];

    public RFigure(int x, int y) {
        startPoint = new Point(x, y);
        color[0] = getRandomNum(255);
        color[1] = getRandomNum(255);
        color[2] = getRandomNum(255);
    }

    protected int getX() {
        return startPoint.getX();
    }

    protected int getY() {
        return startPoint.getY();
    }

    public abstract void show(Graphics paint);

    public void move(int dx, int dy) {
        startPoint = new Point(dx, dy);
    }

    protected static int getRandomNum(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }

    protected static int getRandomNum(int max) {
        return new Random().nextInt(max) + 1;

    }
    protected Color getColor() {
        return new Color(color[0], color[1], color[2], 172);

    }
}


