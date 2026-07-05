package mid_1_ex;

public class PayService {
    public void pay(int balance, int price){
        if(balance < price){
            throw new NotEnoughMoneyException("잔액이 부족합니다.");
        }
        System.out.println("결제가 완료되었습니다.");
    }
}

