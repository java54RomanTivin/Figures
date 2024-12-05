
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<RFigure> figureArrayList = new ArrayList<>();
    static JFrame frame = new JFrame("Figures");
    static JButton buttonCreateLine = new JButton("Create Line");
    static JButton buttonCreateRectangle = new JButton("Create Rectangle");
    static JButton buttonCreateTriangle = new JButton("Create Triangle");
    static JButton buttonCreateTrapezium = new JButton("Create Trapezium");
    static JButton buttonCreateCircle = new JButton("Create Circle");
    static DrawingPanel drawingPanel = new DrawingPanel();

    public static void main(String[] args) {
        setupFrame(frame);
        applyClick();
    }

    private static void setupFrame(JFrame jFrame) {

        jFrame.setSize(1920, 1080);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setResizable(false);
        jFrame.setLayout(null);

        buttonCreateLine.setBounds(0, 0, 200, 80);
        buttonCreateRectangle.setBounds(0, 80, 200, 80);
        buttonCreateTriangle.setBounds(0, 160, 200, 80);
        buttonCreateTrapezium.setBounds(0, 240, 200, 80);
        buttonCreateCircle.setBounds(0, 320, 200, 80);
        drawingPanel.setBounds(200, 0, 1720, 1080);
        drawingPanel.setBackground(Color.white);

        jFrame.add(buttonCreateLine);
        jFrame.add(buttonCreateRectangle);
        jFrame.add(buttonCreateTriangle);
        jFrame.add(buttonCreateTrapezium);
        jFrame.add(buttonCreateCircle);
        jFrame.add(drawingPanel);
    }

    static class DrawingPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (RFigure figure : figureArrayList) {
                figure.show(g);
            }
        }
    }

    private static void applyClick() {
        buttonCreateLine.addActionListener(al -> {
            Line line = new Line();
            figureArrayList.add(line);
            drawingPanel.repaint();
        });
        buttonCreateRectangle.addActionListener(al -> {
            Rectangle rectangle = new Rectangle();
            figureArrayList.add(rectangle);
            drawingPanel.repaint();
        });
        buttonCreateTriangle.addActionListener(al -> {
            Triangle triangle = new Triangle();
            figureArrayList.add(triangle);
            drawingPanel.repaint();
        });
        buttonCreateTrapezium.addActionListener(al -> {
            Trapezium trapezium = new Trapezium(200, 200, 600, 100, 900, 510);
            figureArrayList.add(trapezium);
            drawingPanel.repaint();
        });
        buttonCreateCircle.addActionListener(al -> {
            Circle circle = new Circle();
            figureArrayList.add(circle);
            drawingPanel.repaint();
        });
    }
}