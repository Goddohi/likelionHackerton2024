package com.cl.youngri.Order;

import com.cl.youngri.Member.Member;
import com.cl.youngri.Member.MemberRepository;
import com.cl.youngri.OrderDetail.OrderDetail;
import com.cl.youngri.OrderDetail.OrderDetailRepository;
import com.cl.youngri.Store.Store;
import com.cl.youngri.Store.StoreRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class OrderService {
    MemberRepository memberRepository;
    StoreRepository storeRepository;
    OrderRepository orderRepository;
    OrderDetailRepository orderDetailRepository;

    /* 빌더 사용
    orderForm에 저장
    store에서 storeRepository에서 findByStoreId를 사용함
    근데 findByStoreId가 orderForm에서 storeId get함.
    그리고 order에 들어가야할 것들을 다 넣어준다. 그리고 빌드로 마무리하고
    좀전에 빌더사용하느라 만든 order를 orderRepository로 return한다.
     */
    public Order createorder(OrderForm orderForm) {
        Order order = Order.builder() //빌더 사용
                .store(storeRepository.findByStoreId(orderForm.getStoreId()).get())
                .member(memberRepository.findByMemberId(orderForm.getMemberId()).get())
                .orderDateTime(orderForm.getOrderDateTime())
                .paymentMethod(orderForm.getPaymentMethod())
                .calories(orderForm.getCalories())
                .time(orderForm.getTime())
                .build();
        return orderRepository.save(order);
    }
}





//서비스- 주문 받으면 회원, 메뉴, 가게 데이터들




