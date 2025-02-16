package uz.nodir.autoclosabledemo.endpoint;


import lombok.RequiredArgsConstructor;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.nodir.autoclosabledemo.model.enums.Status;
import uz.nodir.autoclosabledemo.service.business.OrderFinishService;
import uz.nodir.autoclosabledemo.service.core.OrderDAO;

import java.util.List;
import java.util.Map;

/**
 * @author: PC
 * @date: 16.02.2025
 * @group: DavrCoders
 **/

@RestController
@RequestMapping("/api/v1/order")
@RequiredArgsConstructor
public class OrderTestController {
    private final OrderFinishService orderFinishService;


    @PutMapping
    public ResponseEntity<?> createOrder(@RequestParam String orderId) {
        orderFinishService.create(orderId);
        return ResponseEntity.ok(
                Map.of("result", Status.SUCCESS)
        );
    }

}
