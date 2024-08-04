package com.cl.youngri.OrderDetail;

import com.cl.youngri.Menu.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
}
