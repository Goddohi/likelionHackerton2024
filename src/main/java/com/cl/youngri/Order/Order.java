package com.cl.youngri.Order;

import com.cl.youngri.Member.Member;
import com.cl.youngri.Store.Store;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Entity
@Getter  @Setter
@Builder
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //기본키
    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "member_Id", nullable = false) //name은 대부분 _사용해서 보기 쉽게
    private Member member;

    @ManyToOne
    @JoinColumn(name = "store_Id", nullable = false)
    private Store store;

    private double calories;
    private double time;
    private String paymentMethod;

    @Column(nullable = false)
    private LocalDateTime orderDateTime;
}
