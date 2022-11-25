package ru.vsu.cs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameMain extends JFrame{ //те наш класс наследуется от JFrame
    // JFrame - компонент swing-а
    private JTextField textFieldA; // с J это всё типы
    private JPanel panelMain;
    private JTextField textFieldB;
    private JTextField textFieldC;
    private JButton buttonCalc;
    private JCheckBox checkBox1;
    private JPasswordField passwordField1;

    //Конструктор:
    public FrameMain(){
        this.setTitle("Calc"); // зоголовок окна
        this.setContentPane(panelMain);   // главная - панель мейн
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // опреация, когда мы закрываем кнопочку окна - завершение проги
        this.pack(); //метод пак - правильным образом расстваит компоненты

        // Create Listener  or Go to Listener
        // это называется анонимным классом
        buttonCalc.addActionListener(new ActionListener() {  //ActionListener - класс, который отвечает за обработчики событий
            @Override
            public void actionPerformed(ActionEvent e) {
                //тут будем писать код обработки событий
                try {
                    double a = Double.parseDouble(textFieldA.getText());
                    double b = Double.parseDouble(textFieldB.getText());
                    double c = sum(a, b);
                    textFieldC.setText(String.format("%s", c));
                } catch (Exception err){
                    JOptionPane.showMessageDialog(null,"Некорректный данные", "Ошибка", JOptionPane.ERROR_MESSAGE);
                }
            } //ЛОГИКУ В ОБРАБОТЧИК СОБЫТИЙ НЕ ПИСАТЬ
        });

    }
//Компоновщики - размещают компоненты внутри контейнера
    private static double sum (double a, double b){     //Логика
                                                        // Обычно логика пишется в др классах
        return a + b;
    }
}
