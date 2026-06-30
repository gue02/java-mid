package mid_1_ex;
import java.util.Objects;

public class Item {
    int id;
    String itemName;
    Money price;

    public Item(int id, String itemName, Money price){
        this.id = id;
        this.itemName = itemName;
        this.price = price;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id);
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }
}
