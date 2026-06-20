package lang.wrapper.test;

import java.util.Random;
public class LottoGenerator {
    private int[] rottoNumber = new int[6];
    private int count = 0;
    private Random random = new Random();

    public void printNumber(){
        while(count < 6){
            boolean access = true;
            int value = random.nextInt(45) + 1;
            access = accessReturn(value);
            if (access){
                rottoNumber[count] = value;
                count++;
            }
        }
        System.out.print("로또 번호: ");
        for(int i : rottoNumber){
            System.out.print(i+ " ");
        }
    }

    private boolean accessReturn(int value){
        for(int i : rottoNumber){
            if(i == value){
                return false;
            }
        }
        return true;
    }
}
