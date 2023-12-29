package Kuschenko.FCS.VSU;

import java.awt.*;

class DDALine {
    private int x1, y1;
    private Color color1;
    private int x2, y2;
    private Color color2;

    public DDALine(int x1, int y1, Color color1, int x2, int y2, Color color2) {
        this.x1 = x1;
        this.y1 = y1;
        this.color1 = color1;
        this.x2 = x2;
        this.y2 = y2;
        this.color2 = color2;
    }

    public void drawDDALineWithColorInterpolation(Graphics g) {
        DDA.drawDDALineWithColorInterpolation(g, x1, y1, color1, x2, y2, color2);
    }
}
