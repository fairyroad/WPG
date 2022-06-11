package template;

import main.Generator;

public class MultiplicationTemplate implements Template{
    private int num1;
    private int num2;
    private double answer;
    private String name1;
    private String item;

    public void getTemplate(){
        System.out.println(name1+"은 "+num1+"개의 "+item+"을 "+num2+"묶음 가지고 있습니다.\n"
                + "그들이 가지고 있는 "+ item+"이 모두 몇 개입니까?");
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
        this.answer = num1 * num2;
    }
}
