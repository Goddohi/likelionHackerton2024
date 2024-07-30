package OrderDetail;

import Menu.Menu;
import Order.Order;
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
