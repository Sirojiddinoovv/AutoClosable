package uz.nodir.autoclosabledemo.service.core.impl;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import uz.nodir.autoclosabledemo.model.domain.Transaction;
import uz.nodir.autoclosabledemo.service.core.OrderDAO;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: PC
 * @date: 16.02.2025
 * @group: DavrCoders
 **/

@Service
@Slf4j
public class OrderDAOImpl implements OrderDAO {
    private static final Map<String, Transaction> repository = new ConcurrentHashMap<>();

    @Override
    public Transaction save(Transaction transaction) {
        log.info("save transaction: {}", transaction);
        repository.put(transaction.getId(), transaction);
        return transaction;
    }

    @Override
    public Optional<Transaction> findById(String transactionId) {
        log.info("get transaction by id: {}", transactionId);
        var result = repository.get(transactionId);

        return Optional.of(result);
    }
}
