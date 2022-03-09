import org.junit.Test;

import static org.junit.Assert.*;

public class calcTest {
    @Test
    public void add_test(){
        calc a = new calc();
        assertEquals(4,a.add(2,2));
    }


}