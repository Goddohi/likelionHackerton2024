package com.cl.youngri.Store;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StoreService {

    StoreRepository storeRepository;
/*member와는 다름 왜냐면 member는 사용자가 입력하고 입력을 받는 것이지만
이것은 storeid으로 구분을 짓는 것이 아니기 떄문에 이렇게 또 storeForm을 만들어서 사용
 */
    public Store createStore(StoreForm storeForm) {
            Store store = storeRepository.save(Store.builder()
                    .storeName(storeForm.getStoreName())
                    .storePhoneNumber(storeForm.getStorePhoneNumber())
                    .category(storeForm.getCategory())
                    .build());
            return storeRepository.save(store);
    }

    public Optional<Store> findMemberByStoreId(long storeId) {
        return storeRepository.findByStoreId(storeId);
    }
}
