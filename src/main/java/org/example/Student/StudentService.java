package org.example.Student;


public class StudentService {

    private StudentDAO dao;

    public StudentService(StudentDAO dao){
        super();
        this.dao = dao;
    }

    public int findTotalScore(){
        int[] arr = dao.getScores();
        int sum=0;
        for(Integer val :arr){
            sum+=val;
        }
        return sum;
    }

}
