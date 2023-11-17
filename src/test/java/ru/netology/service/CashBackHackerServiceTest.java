package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashBackHackerServiceTest {
    CashBackHackerService service = new CashBackHackerService();

    @Test
    public void testRemainLessThanBoundary() {
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemainEqualToBoundary() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemainGreaterThanBoundary() {
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }
}

