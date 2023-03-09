package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTests {
    @Test
    public void testing() {
        System.out.println("Testes unitario executado : " + ExampleTests.class);
        Assertions.assertTrue(true);
    }
}
