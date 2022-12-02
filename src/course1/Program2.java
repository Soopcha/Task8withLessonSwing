package course1;

import java.util.Locale;

import util.SwingUtils;

public class Program2 {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.ROOT);
        //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        SwingUtils.setDefaultFont("Times New Roman", 18);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMain().setVisible(true);
            }
        });


    }
}

