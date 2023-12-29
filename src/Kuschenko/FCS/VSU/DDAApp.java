package Kuschenko.FCS.VSU;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DDAApp extends JFrame {

    private DDALine ddaLine;

    public DDAApp() {
        setTitle("Алгоритм DDA-линии");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ddaLine = new DDALine(50, 50, Color.GREEN, 500, 500, Color.GRAY);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        ddaLine.drawDDALineWithColorInterpolation(g);
    }
}




