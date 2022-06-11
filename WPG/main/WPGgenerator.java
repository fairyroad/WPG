//2019111980 길유정
package main;

import operator.Operator;
import student.Builder;
import student.Student;
import student.StudentBuilder;
import template.Template;

public class WPGgenerator {
    private int totalScore = 0;
    private Student student;
    private Operator operator;
    private Template temp;
    private Generator generator;

    //학생 정보 입력받기
    public void setStudent(){

        student = new Student();
        System.out.println("학생의 이름을 입력해주세요 :)\n");
        student.setName();

        Builder builder = new StudentBuilder();
        builder.setName();
        builder.setItem();
        student.info = builder.build();
    }

    public void createProblem(){
        operator = new Operator();

        System.out.println("풀고싶은 연산의 종류를 띄어쓰기로 구분해서 입력해주세요 :)\n");
        operator.setOperator();
        System.out.println("숫자 범위의 최솟값을 입력해주세요:)\n");
        operator.setMinimum();
        System.out.println("숫자 범위의 최댓값을 입력해주세요:)\n");
        operator.setMaximum();
        System.out.println("풀고 싶은 문제의 총 개수를 입력해주세요(연산자 개수의 배수만큼 입력해주세요):)\n");
        operator.setNumber();
        System.out.println("문제를 만들기 시작합니다 :)\n");
    }

    public void solveProblem(){
        System.out.println("Start!!!!!!\n");
        int i = 0;
        int j= 0;
        double answer;
        int div = operator.getNumber() / operator.getOpNum();
        while(i < operator.getOpNum())
        {
            while(operator.getOp(j) != true)
            {
                j += 1;
            }
            for(int k = 0; k < div; k++)
            {
                temp = operator.getTemplate(j);
                temp.setTemplate();
                temp.getTemplate();
                temp.setAnswer();
                System.out.println("답을 적어주세요:)\n");
                answer = Scanners.getIntegerOne();
                if(answer == temp.getAnswer())
                {
                    System.out.println("정답입니당~~!!\n");
                    setScore(5);
                }
                System.out.println("틀렸습니다ㅠㅠㅠ\n");
            }
            i += 1;

        }
    }

    public void setScore(int num){
        totalScore += num;
    }

    public int getScore(){
        return totalScore;
    }

}
