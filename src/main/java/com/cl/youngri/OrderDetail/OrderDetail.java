package com.cl.youngri.OrderDetail;

import com.cl.youngri.Member.Member;
import com.cl.youngri.Menu.Menu;
import com.cl.youngri.Order.Order;
import jakarta.persistence.*;

@Entity
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderDetailId;
    @ManyToOne
    @JoinColumn(name = "menu_Id", nullable = false)
    private Menu menu;

    @ManyToOne
    @JoinColumn(name = "order_Id", nullable = false)
    private Order order;

    @ManyToOne
    @JoinColumn(name = "member_Id", nullable = false)
    private Member memberId;

    private int quantity;
}
