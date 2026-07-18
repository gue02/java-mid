package collection.list.text.ex2;

import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {
    List<Item> itemList = new ArrayList<>();

    public void addItem(Item item){
        itemList.add(item);
    }

    public void displayItems(){
        int sum = 0;
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemList.size(); i++) {
            Item nowitem = itemList.get(i);
            System.out.println("상품명: "+nowitem.getName()+ ", 합계: "+nowitem.getTotalPrice());
            sum += nowitem.getTotalPrice();
        }
        System.out.println("전체 가격 합: "+sum);
    }
}
