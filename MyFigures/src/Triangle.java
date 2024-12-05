import java.awt.*;
import java.lang.reflect.Array;

public class Triangle extends RFigure {
    int[] arrX = {0, 0, 0};
    int[] arrY = {0, 0, 0};

    Triangle(int[] pointsX, int[] pointsY) {
        super(pointsX[0], pointsY[0]);
        arrX=pointsX;
        arrY=pointsY;
    }

    Triangle() {
        super(getRandomNum(1720), getRandomNum(1080));
        this.arrX[0] = getX();
        this.arrX[1] = getRandomNum(1720);
        this.arrX[2] = getRandomNum( 1720);
        this.arrY[0] = getY();
        this.arrY[1] = getRandomNum( 1080);
        this.arrY[2] = getRandomNum(1080);
    }

    @Override
    public void show(Graphics paint) {
        paint.setColor(getColor());
        paint.fillPolygon(getArrX(), getArrY(), 3);
    }

    public int[] getArrX() {
        return arrX;
    }

    public int[] getArrY() {
        return arrY;
    }
}
