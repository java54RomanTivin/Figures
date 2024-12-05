import java.awt.*;
import java.lang.reflect.Array;

public class Trapezium extends RFigure {

    int[] arrX = {0, 0, 0, 0};
    int[] arrY = {0, 0, 0, 0};

    Trapezium(int pointXLeftUp, int pointYUp, int pointXRightUp, int pointXLeftDown, int pointXRightDown, int pointYDown) {
        super(pointXLeftUp, pointYUp);
        if (pointXLeftUp < 100)
            pointXLeftUp = 100;

        if (pointXRightUp <= pointXLeftUp)
            pointXRightUp = pointXLeftUp + 100;

        if (pointXLeftDown > pointXLeftUp)
            pointXLeftDown = pointXLeftUp - 100;

        if (pointXRightDown <= pointXRightUp)
            pointXRightDown = pointXRightUp + 100;

        if (pointYDown <= pointYUp)
            pointYDown = pointYUp + 100;

        this.arrX[0] = getX();
        this.arrX[1] = pointXRightUp;
        this.arrX[2] = pointXRightDown;
        this.arrX[3] = pointXLeftDown;
        this.arrY[0] = getY();
        this.arrY[1] = getY();
        this.arrY[2] = pointYDown;
        this.arrY[3] = pointYDown;
    }

    Trapezium() {
        super(getRandomNum(1700), getRandomNum(1000));
        this.arrX[0] = getX();
        this.arrX[1] = getRandomNum(getX() + 100, 1720);
        this.arrX[2] = getRandomNum(this.arrX[1], 1720);
        this.arrX[3] = getRandomNum(getX());
        this.arrY[0] = getY();
        this.arrY[1] = getY();
        this.arrY[2] = getRandomNum(getY(), 1080);
        this.arrY[3] = this.arrY[2];
    }

    @Override
    public void show(Graphics paint) {
        paint.setColor(getColor());
        paint.fillPolygon(getArrX(), getArrY(), 4);
    }

    public int[] getArrX() {
        return arrX;
    }

    public int[] getArrY() {
        return arrY;
    }
}

