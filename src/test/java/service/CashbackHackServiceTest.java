package service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldReturnZeroIfAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn900IfAmount100() {
        CashbackHackService service = new CashbackHackService();
        int amount = 100;
        int actual = service.remain(amount);

        int expected = 900;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn1500IfAmount500() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int actual = service.remain(amount);

        int expected = 500;

        assertEquals(expected, actual);
    }

    @Test
    void shouldGiveMassageIfAmountLessThanZero(){
        CashbackHackService service = new CashbackHackService();
        int amount = -2;
        assertThrows(IllegalArgumentException.class, ()-> service.remain(amount) );
    }
}