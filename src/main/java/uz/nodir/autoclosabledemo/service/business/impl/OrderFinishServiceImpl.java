package uz.nodir.autoclosabledemo.service.business.impl;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import uz.nodir.autoclosabledemo.model.domain.Transaction;
import uz.nodir.autoclosabledemo.model.enums.Status;
import uz.nodir.autoclosabledemo.service.business.OrderFinishService;
import uz.nodir.autoclosabledemo.service.business.TransactionManager;
import uz.nodir.autoclosabledemo.service.core.OrderDAO;

/**
 * @author: PC
 * @date: 16.02.2025
 * @group: DavrCoders
 **/

@Service
@Slf4j
@RequiredArgsConstructor
public class OrderFinishServiceImpl implements OrderFinishService {
    private final RestTemplate restTemplate;
    private final OrderDAO orderDAO;

    @Override
    public void create(String orderId) {
        log.info("Received command to improve order transaction status by requestId: {}", orderId);

        Transaction transaction = new Transaction(orderId, Status.CREATED);

        try (TransactionManager manager = new TransactionManager(restTemplate, orderDAO, transaction)) {
            manager.executeTransaction();
        }

        log.info("Order transaction status updated");
    }
}
