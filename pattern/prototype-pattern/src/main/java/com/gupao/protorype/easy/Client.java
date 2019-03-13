package com.gupao.protorype.easy;

import java.math.BigDecimal;

public class Client {

    public static void main(String[] args) {
        OrderDto orderDto = new OrderDto();
        orderDto.setName("零食");
        orderDto.setCount(1);
        orderDto.setPrice(new BigDecimal(20));

        OrderForm orderForm = new OrderForm();
        orderForm.setOrderDto(orderDto);
        orderForm.setOrderId("123");


        try {
            OrderForm cloneOrderForm = (OrderForm)orderForm.clone();
            System.out.println(cloneOrderForm.toString());
            System.out.println(cloneOrderForm.getOrderDto());
            System.out.println(orderDto);

            cloneOrderForm.getOrderDto().setPrice(new BigDecimal(50));
            System.out.println(orderDto.getPrice());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
