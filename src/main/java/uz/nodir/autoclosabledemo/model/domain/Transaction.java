package uz.nodir.autoclosabledemo.model.domain;


import lombok.*;
import uz.nodir.autoclosabledemo.model.enums.Status;

/**
 * @author: PC
 * @date: 16.02.2025
 * @group: DavrCoders
 **/

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    private String id;
    private Status status;
}
