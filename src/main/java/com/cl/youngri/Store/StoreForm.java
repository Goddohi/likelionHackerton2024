package com.cl.youngri.Store;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter  @Setter
public class StoreForm {

    @NotBlank(message = "가게 이름")
    @Size(max=255)
    private String storeName;

    @NotBlank(message = "가게 번호")
    @Size(max=12)
    private String storePhoneNumber;

    @NotBlank(message = "가게 카테고리")
    @Size(max=255)
    private String category;


}
