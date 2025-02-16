package uz.nodir.autoclosabledemo.service.core;


import uz.nodir.autoclosabledemo.model.domain.Transaction;

import java.util.Optional;

/**
 * @author: PC
 * @date: 16.02.2025
 * @group: DavrCoders
 **/
public interface OrderDAO {
    Transaction save(Transaction transaction);

    Optional<Transaction> findById(String transactionId);

}
