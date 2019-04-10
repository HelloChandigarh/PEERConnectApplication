package com.fis.pairconnect.repository;

import com.fis.pairconnect.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
