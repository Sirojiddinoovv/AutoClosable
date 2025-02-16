package uz.nodir.autoclosabledemo.model.transaction.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: PC
 * @date: 16.02.2025
 * @group: DavrCoders
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionCheckRequest {
    private String transactionId;

}
