package com.fis.pairconnect.repository;

import com.fis.pairconnect.model.OrderProduct;
import com.fis.pairconnect.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
