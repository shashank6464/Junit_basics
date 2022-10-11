package arrayTestings;

import org.example.testPackage.ArrayMethods;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTesting {

    @Test
    public void finIndexTest(){

        ArrayMethods obj = new ArrayMethods();

        int result = obj.findIndex(new int[]{1,2,3,4,5,6}, 4);

        assertEquals(3,result);
    }


    @Test
    public void searchNumberTest(){

        ArrayMethods obj = new ArrayMethods();

        boolean result = obj.searchNumber(new int[]{1,2,3,4,5,6}, 4);

        System.out.println(result);

        assertEquals(true,result);

        assertTrue(result);

        String str =null;
        assertNull(str);
        assertNotNull(result);
       // assertEquals(null, result);

       // fail("Unfinished method");



    }

    @Test
    public void findIndexEmpty(){

        ArrayMethods obj = new ArrayMethods();

        assertEquals(-1,obj.findIndex(new int[]{}, 2));

    }

    @Test
    public void findIndexOutofBound(){

        ArrayMethods obj = new ArrayMethods();
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> obj.printArray(new int[]{1,2}, 4));

    }

    @Test
    public void findIndexMultiple(){
        ArrayMethods obj = new ArrayMethods();

        assertAll(
                () -> assertEquals(1, obj.findIndex(new int[]{1,2}, 2)),
                () -> assertEquals(2, obj.findIndex(new int[]{1}, 2))

        );


    }

    //Test Asserts
    @Test
    public void testAsserts(){

         boolean result = true;
         assertEquals(true, result);
         assertTrue(result);

    }



}
