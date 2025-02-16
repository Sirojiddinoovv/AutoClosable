package uz.nodir.autoclosabledemo.model.transaction.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.nodir.autoclosabledemo.model.enums.Status;

/**
 * @author: PC
 * @date: 16.02.2025
 * @group: DavrCoders
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionCheckResponse {
    private Status status;
}
