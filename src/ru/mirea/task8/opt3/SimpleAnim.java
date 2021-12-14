package ru.mirea.task8;

import java.awt.*;
import java.awt.event.*;

class SimpleAnim extends Frame {
    private Image[] img = new Image[44];
    private int count;
    SimpleAnim(String s) {
        super(s);
        MediaTracker tr = new MediaTracker(this);
        for (int k = 0; k < 44; k++) {
            img[k] = getToolkit().getImage(/*"src/" + "ru/" + "mirea/" + "task8/" + */(k + 1) + ".gif");//src/ru/mirea/task8/43.gif
            tr.addImage(img[k], 0);
            try {
                tr.waitForAll(); // Ждем загрузки всех изображений
            } catch (InterruptedException e) {}
            setSize(650, 650);
            setVisible(true);
        }
    }
    public void paint(Graphics g) {
        g.drawImage(img[count % 44], 0, 0, this);
    }

    public void go() {
        while (count < 10000000) {
            repaint(); // Выводим следующий кадр
            try { // Задержка в 0.1 сек
                Thread.sleep(100);
            }
            catch (InterruptedException e) {}
            count++;
        }
    }

    public static void main(String[] args) {
        SimpleAnim f = new SimpleAnim(" Простая анимация");
        f.go();
        WindowAdapter adapter = new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
                //f.setSize(800, 300);
            }
        };
        f.addWindowListener(adapter);
    }
}
