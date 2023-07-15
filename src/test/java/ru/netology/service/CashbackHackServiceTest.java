package ru.netology.service;

import org.junit.Test;

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
    public void shouldCalculateForAmount9100AndGetExtra100() {
        CashbackHackService service = new CashbackHackService();
        int expected = 800;
        int actual = service.remain(9_200);

        assertEquals(actual, expected);
    }
}
