package ru.vsu.cs;

import java.awt.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrameMain().setVisible(true); // обращаемся к нашему конструктору
            }
        });
    }
}
