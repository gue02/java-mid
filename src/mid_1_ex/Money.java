package mid_1_ex;

public class Money {
    final int money;

    public Money(int money){
        this.money = money;
    }

    public Money add(int amount){
        Money money1 = new Money(money + amount);
        return money1;
    }

    public Money subtract(int amount){
        Money money1 = new Money(money - amount);
        return money1;
    }
}
