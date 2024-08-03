package com.cl.youngri.OrderDetail;

import com.cl.youngri.Member.Member;
import com.cl.youngri.Menu.Menu;
import com.cl.youngri.Order.Order;
import com.cl.youngri.Store.Store;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity @Builder
@Getter @Setter
@RequiredArgsConstructor
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


    private int quantity;
}
