package com.cl.youngri.Menu;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MenuForm {
    @NotNull
    private String menuName;

    @Min(value = 0)
    private double price;

    @NotNull
    private Long storeId;
}
