package com.cl.youngri.Store;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter  @Setter
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long storeId;

    @Column(name = "store_name",nullable = false)
    private String storeName;

    @Column(name = "store_PN", nullable = false)
    private String storePhoneNumber;

    @Column(name = "store_category", nullable = false)
    private String category;

}
