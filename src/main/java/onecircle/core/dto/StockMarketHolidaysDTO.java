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
public class StockMarketHolidaysDTO {

    private String exchange;
    private String name;
    private String date;
    private String status;

}