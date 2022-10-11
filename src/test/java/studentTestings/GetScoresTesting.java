package studentTestings;

import org.example.Student.StudentDAO;
import org.example.Student.StudentService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GetScoresTesting {

    @Test
    public void testFindTotal(){

        StudentService service = new StudentService(new StudentDaoStub());
        int total =service.findTotalScore();

        assertEquals(90,total);
    }
}

//Using stub as imitation dao instead of StudentDAO
// and using it for testings
class StudentDaoStub extends StudentDAO{

    @Override
    public int[] getScores(){
        return new int[]{20,30,40};
    }

}
