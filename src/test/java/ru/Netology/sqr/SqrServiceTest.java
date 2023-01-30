
package ru.Netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrServiceTest {


        @Test
       public void countSquares() {
            SQRService service = new SQRService();
            int expected = 1;
            int actual = service.countSquares(200, 300);
            Assertions.assertEquals(expected, actual);
        }

       @Test
        void countSquaresOverLimit() {
            SQRService service = new SQRService();
            int expected = 99;
            int actual = service.countSquares(200, 300);
            Assertions.assertEquals(expected, actual);
        }

        @Test
        void countSquaresUnderLimit() {
            SQRService service = new SQRService();
            int expected = 9;
            int actual = service.countSquares(200, 300);
            Assertions.assertEquals(expected, actual);
        }


    }

