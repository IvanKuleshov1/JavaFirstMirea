package ru.mirea.task28.opt1;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.concurrent.ThreadLocalRandom;



public class Automobile {
    private String manufacturer;
    private int startYear;
    DecimalFormat decimalFormat = new DecimalFormat( "#.#" );
    String result = decimalFormat.format(ThreadLocalRandom.current().nextDouble(1, 10));
    NumberFormat nf = NumberFormat.getInstance();
    double capacity = nf.parse(result).doubleValue();


    private final Engine autoEngine = new Engine((int) (Math.random() * 1000+150), capacity);

    public Automobile() throws ParseException {
    }


    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getStartYear() {
        return startYear;
    }

    public Engine getAutoEngine() {
        return autoEngine;
    }

    //Нестатический вложенный класс
    private class Engine {
        private int power;       //л.с.
        private double capacity;         //литры

        private Engine(int power, double capacity) {
            this.power = power;
            this.capacity = capacity;
        }

        private void setPower(int power)
        {
            this.power = power;
        }

        private void setCapacity(double capacity)
        {
            this.capacity = capacity;
        }
        private double getPower()
        {
            return power;
        }

        private double getCapacity() {
            return capacity;
        }
    }

    //Статический класс внутри внешнего класса
    public static class Coupe extends Automobile
    {
        private String color;
        public Coupe(String manufacturer, int startYear, String color) throws ParseException {
            super();
            Automobile.Coupe.this.setManufacturer(manufacturer);
            Automobile.Coupe.this.setStartYear(startYear);
            this.color = color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public void coupeGetInfo()
        {
            System.out.println("\n\tПроизводитель: " + Automobile.Coupe.this.getManufacturer()
                    + "\n\tГод запуска: " + Automobile.Coupe.this.getStartYear()
                    + "\n\tЦвет автомобиля: " + Coupe.this.color+'\n'
                    + "\tМощность двигателя: " + Automobile.Coupe.this.getAutoEngine().getPower()+'\n'
                    + "\tОбъём двигателя: " + Automobile.Coupe.this.getAutoEngine().getCapacity()+'\n');
        }
    }

    //Анонимный класс
    private class Sedan extends Automobile {
        private int price;
        public Sedan(String manufacturer, int startYear, int price) throws ParseException {
            super();
            Automobile.Sedan.this.setManufacturer(manufacturer);
            Automobile.Sedan.this.setStartYear(startYear);
            this.price = price;

        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }

        public void sedGetInfo()
        {
            System.out.println("\n\tПроизводитель: " + this.getManufacturer()
                    + "\n\tГод выпуска: " + this.getStartYear()
                    + "\n\tЦена: " + this.price
                    + "\n\tМощность двигателя: " + Automobile.Sedan.this.getAutoEngine().getPower()
                    + "\n\tОбъём двигателя: " + Automobile.Sedan.this.getAutoEngine().getCapacity());
        }
    }

    public static void main(String[] args) throws ParseException {
        Automobile.Coupe auto = new Coupe(
                "Mitsubishi",
                2018,
                "Grey");
        Automobile.Sedan auto2 = new Automobile().new Sedan(
                "Volvo",
                2010,
                1300000);

        auto.coupeGetInfo();
        auto2.sedGetInfo();
    }
}
