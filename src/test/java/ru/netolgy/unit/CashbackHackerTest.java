package ru.netolgy.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerTest {

    @Test
    public void shouldAmount1200() {
        CashbackHacker service = new CashbackHacker();
        int amount = 1200;
        int actual = service.remain(amount);
        int expected = 800;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldAmount800() {
        CashbackHacker service = new CashbackHacker();
        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldAmount1000() {
        CashbackHacker service = new CashbackHacker();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}