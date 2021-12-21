package ru.mirea.task30.opt1;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import ru.mirea.task29.opt1.CurrencyInfo;

import java.text.ParseException;


public class CurrencyInfoTest {
    private CurrencyInfo currencyInfo;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @BeforeClass
    public static void globalSetUp() {
        System.out.println("Initial setup...");
        System.out.println("Code executes only once");
        System.out.println("All test finished");
    }


    @Test
    public void AllCurrency() throws ParseException {
        CurrencyInfo someCurrency = new CurrencyInfo("Some name for test",3.4,1.5);
        assert someCurrency!=null;

    }

    @Test
    public void isObjNameNptNull() throws ParseException {
        boolean b = new CurrencyInfo("Some name for test",3.4,1.5).getName() != null;
        assert b;
    }


}



