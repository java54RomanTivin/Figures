import java.awt.*;

public class Circle extends RFigure {
    protected int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public Circle(int x, int y) {
        super(x, y);
        int rx=1720-getX();
        int ry=1080-getY();
        int r=Math.min(ry,rx)/2;

        this.radius = this.getRandomNum(r);
    }

    public Circle() {
        this(getRandomNum(1720), getRandomNum(1080));
    }

    @Override
    public void show(Graphics paint) {
        paint.setColor(getColor());
        paint.fillOval(this.getX(), this.getY(), getRadius() * 2, getRadius() * 2);
    }

    public void changeRadius(int newRadius) {
        if (newRadius > 300) {
            this.radius = 300;
        } else if (newRadius <= 0) {
            this.radius = 1;
        } else this.radius = newRadius;
    }

    public int getRadius() {
        return radius;
    }
}
