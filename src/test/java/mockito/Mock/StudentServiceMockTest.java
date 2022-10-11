package mockito.Mock;

import org.example.Student.StudentDAO;
import org.example.Student.StudentService;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

public class StudentServiceMockTest {

    @Test
    public void testFindTotal(){

        StudentDAO daoMock = mock(StudentDAO.class);
        System.out.println(daoMock.getClass().getSimpleName());

        when(daoMock.getScores()).thenReturn(new int[]{10,30,40});

        StudentService service = new StudentService(daoMock);

       int total = service.findTotalScore();
       assertEquals(80, total);
    }

}
