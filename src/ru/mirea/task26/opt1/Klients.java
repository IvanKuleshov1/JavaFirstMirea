package ru.mirea.task26.opt1;

public class Klients {
    Solvency solvency;


    public void disp(){
        solvency.disp();
    }
}
class Klient1 extends Klients{
    public Klient1(){
        this.solvency = new BadSolvency();
    }
}

class Klient2 extends Klients{
    public Klient2(){
        this.solvency = new BadSolvency();
    }
}

class  Klient3 extends Klients{
    public Klient3(){
        this.solvency = new GoodSolvency();
    }
}