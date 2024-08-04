package com.cl.youngri.Menu;

import com.cl.youngri.Store.Store;
import com.cl.youngri.Store.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Service
public class MenuService {
    MenuRepository menuRepository;
    StoreRepository storeRepository;

    @Transactional
    public Menu createMenu(MenuForm menuForm) {
        Store store = storeRepository.findByStoreId(menuForm.getStoreId())
                .orElseThrow(() -> new RuntimeException("Store not found"));

        Menu menu = new Menu();
        menu.setMenuName(menuForm.getMenuName());
        menu.setPrice(menuForm.getPrice());
        menu.setStoreId(store);

        return menuRepository.save(menu);
    }

    @Transactional(readOnly = true)
    public List<Menu> getAllMenus() {
        return menuRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Menu> getMenuById(Long menuId) {
        return menuRepository.findById(menuId);
    }

    @Transactional
    public Menu updateMenu(Long menuId, MenuForm menuForm) {
        Menu menu = menuRepository.findById(menuId)
                .orElseThrow(() -> new RuntimeException("Menu not found"));

        Store store = storeRepository.findById(menuForm.getStoreId())
                .orElseThrow(() -> new RuntimeException("Store not found"));

        menu.setMenuName(menuForm.getMenuName());
        menu.setPrice(menuForm.getPrice());
        menu.setStoreId(store);

        return menuRepository.save(menu);
    }

    @Transactional
    public void deleteMenu(Long menuId) {
        menuRepository.deleteById(menuId);
    }
}

