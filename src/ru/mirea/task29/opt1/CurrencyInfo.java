package ru.mirea.task29.opt1;

import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CurrencyInfo implements Serializable {
    private String name;
    private static double value;
    private static double growth;

    public static double generateGrowth() throws ParseException {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String result = decimalFormat.format(ThreadLocalRandom.current().nextDouble(1, 95));
        NumberFormat nf = NumberFormat.getInstance();
        return nf.parse(result).doubleValue();

    }
    public static double generateValue(){
        return getValue()+getGrowth();
    }




    public CurrencyInfo(String name, double growth, double value) throws ParseException {
        this.name = name;
        this.growth = growth;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public static double getGrowth() {
        return growth;
    }

    public void setGrowth(double growth) {
        this.growth = growth;
    }

    @Override
    public String toString() {
        return "CurrencyInfo{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", growth=" + growth +
                '}';
    }

    public static void main(String[] args) throws ParseException, IOException, ClassNotFoundException {
        System.out.println("Показать актуальную информацию курсов фондового рынка?[true/false]");
        Scanner sc = new Scanner(System.in);
        boolean step = sc.nextBoolean();

        if (step == true) {
            CurrencyInfo rbl = new CurrencyInfo("RBL", generateGrowth(), 120);
            System.out.println(rbl.toString());
            CurrencyInfo usd = new CurrencyInfo("USD", generateGrowth(), 237);
            System.out.println(usd.toString());
            CurrencyInfo eur = new CurrencyInfo("EUR", generateGrowth(), 284);
            System.out.println(eur.toString());
        } else
            System.out.println("Торги окончены");
        CurrencyInfo rbl1 = null;
        CurrencyInfo usd1 = null;
        CurrencyInfo eur1 = null;
        while (true) {
            System.out.println("Следующий день торгов?[true/false]");
            Scanner sc2 = new Scanner(System.in);
            boolean step2 = sc2.nextBoolean();
            if (step2 == false)
                break;

            rbl1 = new CurrencyInfo("RBL", generateGrowth(), generateValue());
            System.out.println(rbl1.toString());
            usd1 = new CurrencyInfo("USD", generateGrowth(), generateValue());
            System.out.println(usd1.toString());
            eur1 = new CurrencyInfo("EUR", generateGrowth(), generateValue());
            System.out.println(eur1.toString());
            System.out.println("Хотите сохранить состояние фондового рынка?[сохранить/нет]");
            Scanner sc3 = new Scanner(System.in);
            String line = sc3.nextLine();
            if (line.equals("сохранить")) {

                System.out.println("Сохраненное состояние фондового рынка:");
                FileOutputStream fileOutputStream1 = new FileOutputStream("C:\\Users\\ivank\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task29\\opt1\\save1.ser");
                FileOutputStream fileOutputStream2 = new FileOutputStream("C:\\Users\\ivank\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task29\\opt1\\save2.ser");
                FileOutputStream fileOutputStream3 = new FileOutputStream("C:\\Users\\ivank\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task29\\opt1\\save3.ser");

                ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(fileOutputStream1);
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(fileOutputStream2);
                ObjectOutputStream objectOutputStream3 = new ObjectOutputStream(fileOutputStream3);
                objectOutputStream1.writeObject(new CurrencyInfo(rbl1.getName(), rbl1.getGrowth(), rbl1.getValue()));
                objectOutputStream2.writeObject(new CurrencyInfo(usd1.getName(), usd1.getGrowth(), usd1.getValue()));
                objectOutputStream3.writeObject(new CurrencyInfo(eur1.getName(), eur1.getGrowth(), eur1.getValue()));

                objectOutputStream1.close();
                objectOutputStream2.close();
                objectOutputStream3.close();
            }
        }

        FileInputStream fileInputStream1 = new FileInputStream("C:\\Users\\ivank\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task29\\opt1\\save1.ser");
        ObjectInputStream objectInputStream1 = new ObjectInputStream(fileInputStream1);
        FileInputStream fileInputStream2 = new FileInputStream("C:\\Users\\ivank\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task29\\opt1\\save2.ser");
        ObjectInputStream objectInputStream2 = new ObjectInputStream(fileInputStream2);
        FileInputStream fileInputStream3 = new FileInputStream("C:\\Users\\ivank\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task29\\opt1\\save3.ser");
        ObjectInputStream objectInputStream3 = new ObjectInputStream(fileInputStream3);
        CurrencyInfo currencyInfo1 = (CurrencyInfo) objectInputStream1.readObject();
        CurrencyInfo currencyInfo2 = (CurrencyInfo) objectInputStream2.readObject();
        CurrencyInfo currencyInfo3 = (CurrencyInfo) objectInputStream3.readObject();
        System.out.println(currencyInfo1);
        System.out.println(currencyInfo2);
        System.out.println(currencyInfo3);

        objectInputStream1.close();
        objectInputStream2.close();
        objectInputStream3.close();

    }
}
