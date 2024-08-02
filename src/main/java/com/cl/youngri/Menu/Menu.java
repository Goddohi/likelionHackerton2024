package com.cl.youngri.Menu;

import com.cl.youngri.Store.Store;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int menuId;

    @Column(name = "menu_Name",unique = true, nullable = false)
    private String menuName;

    private double price;

    @ManyToOne
    @JoinColumn(name = "store_Id", nullable = false)
    private Store storeId;
}
