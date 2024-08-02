package com.cl.youngri.OrderDetail;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class OrderDetailForm {
    @NotNull
    private Long menuId;

    @NotNull
    private Long orderId;

    @Min(value = 1)
    private int quantity;
}
