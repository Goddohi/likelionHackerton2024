package com.cl.youngri.OrderDetail;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class OrderDetailForm {
    @NotNull
    private int menuId;

    @NotNull
    private Long orderId;

    @Min(value = 1)
    private int quantity;
}
