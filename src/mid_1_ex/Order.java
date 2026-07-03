package mid_1_ex;

public class Order {
    private Item item;
    private OrderStatus status;
    private DeliveryInfo deliveryInfo;

    public Order(Item item, String address, String receiverName){
        this.item = item;
        this.status = OrderStatus.READY;

        this.deliveryInfo = new DeliveryInfo(address,receiverName);
    }

    private class DeliveryInfo{
        String address;
        String orderName;

        DeliveryInfo(String address,String orderName){
            this.address = address;
            this.orderName = orderName;
        }
    }
}
