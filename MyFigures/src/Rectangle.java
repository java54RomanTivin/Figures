import java.awt.*;

public class Rectangle extends RFigure {
    protected int width;
    protected int height;
    private Boolean isDiagonalShown = false;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public Rectangle(int x, int y) {
        super(x, y);
        this.height = getRandomNum(600);
        this.width = getRandomNum(600);
    }
    public Rectangle() {
        this(getRandomNum(1120), getRandomNum(480));

    }

    @Override
    public void show(Graphics paint) {
        paint.setColor(getColor());
        paint.fillRect(getX(), getY(), getWidth(), getHeight());
        if (isDiagonalShown) {
            showDiagonal(paint);
        }
    }

    public void showDiagonal(Graphics paint) {
        Line line = new Line(getX(), getY(), getX() + width, getY() + height);
        line.show(paint);
        isDiagonalShown = !isDiagonalShown;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
