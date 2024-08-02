package com.cl.youngri.Order;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public class OrderForm {
    @NotNull
    private Long menuId;

    @NotNull
    private Long memberId;

    @NotNull
    private Long storeId;

    @NotNull
    private Long orderDetailId;

    @Min(value = 1)
    private double calories;

    @Min(value = 1)
    private double time;

    @NotNull
    private String paymentMethod;

    @NotNull
    private LocalDateTime orderDateTime;
}
