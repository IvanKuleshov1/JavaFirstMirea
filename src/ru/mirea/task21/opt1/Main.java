package ru.mirea.task21.opt1;

public class Main {
    public static void main (String [] args){
        final Info<String> name1=new Info<>("Герман Оскарович Греф");
        final Info<Integer> data1=new Info<>(1970);
        final Info<String> name2=new Info<>("Иванов Иван Иванович");
        final Info<Integer> data2=new Info<>(1990);
        System.out.println("\nДанные обслуживающего сотрудника:\n"+name1.getInfo()+" "+data1.getInfo()+"г.");
        System.out.println("\nДанные пользователя:\n"+name2.getInfo()+" "+data2.getInfo()+"г.");
    }
}
