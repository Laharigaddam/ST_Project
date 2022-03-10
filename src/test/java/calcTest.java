import org.junit.Test;

import static org.junit.Assert.*;

public class calcTest {
    @Test
    public void add_test(){
        calc a = new calc();
        assertEquals(4,a.addition(2,2));
    }
    @Test
    public void sub_test(){
        calc b = new calc();
        assertEquals(2,b.subtraction(6,4));
    }
    @Test
    public void multi_test(){
        calc c = new calc();
        assertEquals(8, c.multiplication(4,2));
    }
    @Test
    public void div_test(){
        calc d = new calc();
        assertEquals(6, d.division(30,5));
    }



}