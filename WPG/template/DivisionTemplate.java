package template;

import main.Generator;

public class DivisionTemplate implements Template {
    private int num1;
    private int num2;
    private double answer;
    private String name1;
    private String item;

    public void getTemplate(){
        System.out.println(name1+"은 "+item +"을 "+num1+"개 가지고 있습니다.\n"
        + "(그/그녀)는 "+num2+"명의 친구에게 "+item+"을 똑같이 나누어 주고 싶습니다.\n"
                +"각각" +item+ "을 몇 개씩 가지게 되나요? (만약 똑같이 나누어 떨어지지 않을 경우에는 소수로 표현해주세요.)\n");
    }
    public void setTemplate(){
        this.name1 = Generator.getRandomName();
        this.item = Generator.getRandomItem();
        this.num1 = Generator.getRandomRange();
        this.num2 = Generator.getRandomRange();
    }
    public double getAnswer(){
        return answer;
    }
    public void setAnswer(){
        this.answer = num1 / num2;
    }
}
