import static org.junit.Assert.*;
import org.junit.*;


public class skilldemo1test{

    @Test
    public void concatTest(){
        assertEquals("Ok and?", skilldemo1.concat("OK", "and"));
    }


}