import java.awt.*;

public class Line extends RFigure {
    private Point endPoint;

    public Line(int xStart, int yStart, int xEnd, int yEnd) {
        super(xStart, yStart);
        endPoint = new Point(xEnd, yEnd);
    }
    public Line() {
        super(RFigure.getRandomNum(1720),RFigure.getRandomNum(1080));
        endPoint= new Point(RFigure.getRandomNum(1720),RFigure.getRandomNum(1080));
    }
    @Override
    public void show(Graphics paint) {
        paint.setColor(getColor());
        paint.drawLine(getX(),getY(),getXEnd(),getYEnd());
    }
    protected int getXEnd(){
        return endPoint.getX();
    }
    protected int getYEnd(){
        return endPoint.getY();
    }
}
