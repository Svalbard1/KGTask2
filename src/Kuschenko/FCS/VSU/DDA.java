package Kuschenko.FCS.VSU;

import java.awt.*;

public class DDA {

    public static void drawDDALineWithColorInterpolation(
            Graphics g, int x1, int y1, Color color1,
            int x2, int y2, Color color2) {

        int dx = x2 - x1;
        int dy = y2 - y1;

        int steps = Math.max(Math.abs(dx), Math.abs(dy));

        float redStep = (float) (color2.getRed() - color1.getRed()) / steps;
        float greenStep = (float) (color2.getGreen() - color1.getGreen()) / steps;
        float blueStep = (float) (color2.getBlue() - color1.getBlue()) / steps;

        float xStep = (float) dx / steps;
        float yStep = (float) dy / steps;

        float currentX = x1;
        float currentY = y1;
        float currentRed = color1.getRed();
        float currentGreen = color1.getGreen();
        float currentBlue = color1.getBlue();

        for (int i = 0; i <= steps; i++) {
            g.setColor(new Color((int) currentRed, (int) currentGreen, (int) currentBlue));
            g.fillRect(Math.round(currentX), Math.round(currentY), 1, 1);

            currentX += xStep;
            currentY += yStep;
            currentRed += redStep;
            currentGreen += greenStep;
            currentBlue += blueStep;
        }
    }
}