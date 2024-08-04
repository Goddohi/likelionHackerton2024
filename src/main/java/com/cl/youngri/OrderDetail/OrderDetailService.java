package com.cl.youngri.OrderDetail;

import com.cl.youngri.Menu.MenuRepository;
import com.cl.youngri.Order.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OrderDetailService {

    MenuRepository menuRepository;
    OrderRepository orderRepository;

    OrderDetailRepository orderDetailRepository;

    public OrderDetail createOrderDetail(OrderDetailForm orderDetailForm) {
        OrderDetail od = orderDetailRepository.save(OrderDetail.builder()
                .order(orderRepository.findByOrderId(orderDetailForm.getOrderId()).get())
                .menu(menuRepository.findByMenuId(orderDetailForm.getMenuId()).get())
                .quantity(orderDetailForm.getQuantity())
                .build());

        return od;
    }
}
