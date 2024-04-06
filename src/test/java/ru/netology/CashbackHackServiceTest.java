package ru.netology;


import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    @Test
    public void shouldCheckUnderBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckEqualBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckUpperBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 10001;

        int actual = service.remain(amount);
        int expected = 999;

        Assert.assertEquals(expected, actual);
    }
}
