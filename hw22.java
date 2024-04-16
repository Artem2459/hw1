import org.junit.Test;
import static org.junit.Assert.*;

public class hw22 {

    @Test
    public void testИмя() {
        String имя = "Артем";
        assertEquals("Артем", имя);
    }

    @Test
    public void testВозраст() {
        int возраст = 16;
        assertEquals(16, возраст);
    }

    @Test
    public void testВывод() {
        String имя = "Артем";
        int возраст = 16;
        String ожидаемыйВывод = "Моё имя: Артем\nМой возраст: 16\n";

      
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Main.main(null);

        String фактическийВывод = outputStream.toString();

        assertEquals(ожидаемыйВывод, фактическийВывод);
    }
}
