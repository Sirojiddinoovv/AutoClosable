package uz.nodir.autoclosabledemo.service.business;


import lombok.RequiredArgsConstructor;
import org.springframework.web.client.RestTemplate;
import uz.nodir.autoclosabledemo.model.domain.Transaction;
import uz.nodir.autoclosabledemo.model.enums.Status;
import uz.nodir.autoclosabledemo.model.transaction.request.TransactionCheckRequest;
import uz.nodir.autoclosabledemo.model.transaction.response.TransactionCheckResponse;
import uz.nodir.autoclosabledemo.service.core.OrderDAO;

/**
 * @author: PC
 * @date: 16.02.2025
 * @group: DavrCoders
 **/


@RequiredArgsConstructor
public class TransactionManager implements AutoCloseable {
    private final RestTemplate restTemplate;
    private final OrderDAO orderDAO;
    private final Transaction transaction;


    public void executeTransaction() {

        try {
            /*
                Call client service by REST request
             */

            var result = restTemplate.postForObject("http://localhost:9090/payment/api/v1/check", new TransactionCheckRequest(transaction.getId()), TransactionCheckResponse.class);


            if (result != null && result.getStatus() == Status.SUCCESS)
                transaction.setStatus(Status.SUCCESS);
            else
                transaction.setStatus(Status.FAILED);

        } catch (Exception e) {
            /*
                If taken a TIME OUT error or another exception
             */

            transaction.setStatus(Status.NEED_CONFIRM);
        }
    }

    @Override
    public void close() {
        orderDAO.save(transaction);
    }
}
