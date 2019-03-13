package com.gupao.protorype.deep;

public class OrderForm implements Cloneable{

    private String OrderId;
    private OrderDto orderDto;

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public OrderDto getOrderDto() {
        return orderDto;
    }

    public void setOrderDto(OrderDto orderDto) {
        this.orderDto = orderDto;
    }

    @Override
    public String toString() {
        return "OrderForm{" +
                "OrderId='" + OrderId + '\'' +
                ", orderDto=" + orderDto +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        OrderForm orderForm = null;
        try {
            orderForm = (OrderForm)super.clone();
            orderForm.orderDto = (OrderDto) this.orderDto.clone();
            return orderForm;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
