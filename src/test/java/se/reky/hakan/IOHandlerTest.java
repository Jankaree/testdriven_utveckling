package se.reky.hakan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import org.junit.jupiter.api.Assertions;
import java.util.Scanner;

public class IOHandlerTest {
    private IOHandler ioHandler(String dataForScanner) {
        Scanner scanner = new Scanner(dataForScanner);
        return new IOHandler(scanner);
    }

    @Test
    public void hasNextIntTest(){
        IOHandler iOHandler = ioHandler("1");
        Assertions.assertTrue(iOHandler.hasNextInt());
    }

    @Test
    public void hasNextIntFalseTest(){
        IOHandler iOHandler = ioHandler("test");
        Assertions.assertFalse(iOHandler.hasNextInt());
    }

}
