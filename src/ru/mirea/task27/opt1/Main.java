package ru.mirea.task27.opt1;

import java.util.HashMap;
import java.util.Set;

//восспользуемся раблотой HashMap для хранения номеров ячеек клиентов фондового отделения банка

public class Main {
    public static void main(String [] args){
        HashMap<Integer, String> mscwBrnchDtbs = new HashMap();
        mscwBrnchDtbs.put(231, "Ахтямов Артём Евгеньевич");
        mscwBrnchDtbs.put(343,"Калашникова Ирина Алексеевна");
        mscwBrnchDtbs.put(483, "Королев Илья Сергеевич");
        mscwBrnchDtbs.put(457, "Хакимова Александра Эльдаровна");
        mscwBrnchDtbs.put(234, "Тулохонов Алексей Федорович");
        mscwBrnchDtbs.put(865, " Ермолаева Карина Алексеевна");
        mscwBrnchDtbs.put(748, "Панов Никита Андреевич");

        System.out.println("\nВыведем базу данных пользователей московского отделения банка\n");
        System.out.println(mscwBrnchDtbs);

        System.out.println("\nПолучим данные номеров ячеек");
        Set<Integer> key = mscwBrnchDtbs.keySet();
        System.out.println(key);

        HashMap<Integer, String> spbBrnchDtbs = new HashMap<>();
        spbBrnchDtbs.put(356, "Бабердина Вероника Павловна");
        spbBrnchDtbs.put(346, "Петров Даниил Дмитриевич ");
        spbBrnchDtbs.put(956, "Фамилия, имя, отчество ");
        spbBrnchDtbs.put(625, "Митрофанова Дарья Анатольевна ");
        spbBrnchDtbs.put(957, "Кузнецова Ксения Игоревна ");

        System.out.println("\nОбъединим полученные две базы");
        mscwBrnchDtbs.putAll(spbBrnchDtbs);
        System.out.println(mscwBrnchDtbs);


    }
}
