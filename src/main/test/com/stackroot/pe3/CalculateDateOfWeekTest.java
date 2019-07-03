package main.test.com.stackroot.pe3;
import main.java.com.stackroot.pe3.CalculateDateOfWeek;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateDateOfWeekTest {
        CalculateDateOfWeek calculate;
        @Before
        public void setUp() {
            calculate = new CalculateDateOfWeek();
        }

        @After
        public void tearDown() {
            calculate = null;
        }

        @Test
        public void calculateFirstAndLastDateOfTheWeek() {
            String result = calculate.calculateFirstAndLastDateOfTheWeek();
            assertEquals("Mon 01/07/2019Sun 07/07/2019",result);
        }

    }
