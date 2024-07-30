package com.cl.youngri.OrderDetail;

import com.cl.youngri.Menu.Menu;
import com.cl.youngri.Order.Order;
import jakarta.persistence.*;
@Entity
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderDetailId;
    @ManyToOne
    @JoinColumn(name = "menuId", nullable = false)
    private Menu menu;

    @ManyToOne
    @JoinColumn(name = "orderId", nullable = false)
    private Order order;

    private int quantity;
}
