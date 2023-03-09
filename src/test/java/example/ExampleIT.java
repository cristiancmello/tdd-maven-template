package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleIT {
    @Test
    public void testing() {
        System.out.println("Teste integrado executado: " + ExampleIT.class);
        Assertions.assertTrue(true);
    }
}
