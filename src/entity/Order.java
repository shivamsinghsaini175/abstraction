package abstraction.src.entity;

import abstraction.src.enums.OrderStatus;

public class Order {

    int oderId;
    OrderStatus status;
    public Order()
    { }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void setOderId(int oderId) {
        this.oderId = oderId;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public int getOderId() {
        return oderId;
    }


}
