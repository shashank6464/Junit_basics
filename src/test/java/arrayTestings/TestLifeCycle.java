package arrayTestings;

import org.example.testPackage.ArrayMethods;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestLifeCycle {

    private ArrayMethods obj;

    @Test
    public void finIndexTest(){

        int result = obj.findIndex(new int[]{1,2,3,4,5,6}, 4);

        assertEquals(3,result);
    }


    @Test
    public void searchNumberTest(){

        boolean result = obj.searchNumber(new int[]{1,2,3,4,5,6}, 4);

        System.out.println(result);

        assertEquals(true,result);

    }

    @BeforeEach
    public void beforeEachTest(){
        System.out.println("2 First initialized method before each test");
        obj = new ArrayMethods();

    }

    @AfterEach
    public void afterEachTest(){
        System.out.println("3 Cleaning up Test");
    }

    @BeforeAll
    public static void beforeAllTest(){
        System.out.println("1 Before running all Tests");

    }

    @AfterAll
    public static void afterAllTest(){
        System.out.println("4 After running all Test");
    }


}
