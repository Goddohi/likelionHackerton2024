package com.cl.youngri.Order;

import com.cl.youngri.Member.Member;
import com.cl.youngri.Menu.Menu;
import com.cl.youngri.OrderDetail.OrderDetail;
import com.cl.youngri.Store.Store;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter  @Setter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "menuId", nullable = false)
    private Menu menu;

    @ManyToOne
    @JoinColumn(name = "memberId", nullable = false)
    private Member member;

    @ManyToOne
    @JoinColumn(name = "storeId", nullable = false)
    private Store store;

    @ManyToOne
    @JoinColumn(name = "orderDetail_Id", nullable = false)
    private OrderDetail orderDetail;

    private double calories;
    private double time;
    private String paymentMethod;

    @Column(nullable = false)
    private LocalDateTime orderDateTime;
}
