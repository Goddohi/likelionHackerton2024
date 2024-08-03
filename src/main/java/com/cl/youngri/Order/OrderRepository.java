package com.cl.youngri.Order;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Optional<Order> findByOrderId(Long orderId); //optional 사용해서 findByOrderId 사용하기 위해
}
