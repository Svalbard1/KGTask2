package Kuschenko.FCS.VSU;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DDAApp app = new DDAApp();
            app.setVisible(true);
        });
    }
}
