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
import lombok.*;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
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

    @Column
    private double calories;
    @Column
    private double time;
    @Column
    private String paymentMethod;

    @Column(nullable = false)
    private LocalDateTime orderDateTime;
}
