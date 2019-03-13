package com.gupao.protorype.easy;

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
        return super.clone();
    }
}
