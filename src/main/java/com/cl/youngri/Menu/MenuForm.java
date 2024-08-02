package com.cl.youngri.Menu;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class MenuForm {
    @NotNull
    private String menuName;

    @Min(value = 0)
    private double price;

    @NotNull
    private Long storeId;
}
