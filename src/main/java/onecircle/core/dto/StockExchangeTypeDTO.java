package onecircle.core.dto;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockExchangeTypeDTO {

    private String type;
    private String market;
    private String mic;
    private String name;
    private String tape;
    
}