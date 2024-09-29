package se.reky.hakan;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import java.util.Scanner;

public class UtilScannerTest {

    @Test
    public void ScannerTest(){

        String testString = "will this be the same";

        Scanner scanner = new Scanner(testString);

        String result = scanner.nextLine();

        Assertions.assertEquals(testString, result);




    }
}
