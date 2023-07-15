package ru.netology.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateForAmount900AndGetExtra100() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateForAmount1000AndGetExtraNull() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1_000);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateForAmount9200AndGetExtra800() {
        CashbackHackService service = new CashbackHackService();
        int expected = 800;
        int actual = service.remain(9_200);

        assertEquals(actual, expected);
    }

    //junit-jupiter tests
    @Test
    public void shouldCalculateForAmount1100AndGetExtra900() {
        CashbackHackService service = new CashbackHackService();
        int expected = 900;
        int actual = service.remain(1100);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForAmount100AndGetExtra900() {
        CashbackHackService service = new CashbackHackService();
        int expected = 900;
        int actual = service.remain(100);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForAmount100000AndGetExtraNull() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(100000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForAmountNullAndGetExtra1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int actual = service.remain(0);

        Assertions.assertEquals(expected, actual);
    }
}

