package com.cl.youngri.Order;

import com.cl.youngri.Menu.Menu;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter @Setter
public class OrderForm {
    @NotNull
    private List<Menu> menuId; //?? list가 사용 이유

    @NotNull
    private String memberId;

    @NotNull
    private Long storeId;

    @Min(value = 1)
    private double calories;

    @Min(value = 1)
    private double time;

    @NotNull
    private String paymentMethod;

    @NotNull
    private LocalDateTime orderDateTime;
}
