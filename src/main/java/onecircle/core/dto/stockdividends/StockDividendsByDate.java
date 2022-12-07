package onecircle.core.dto.stockdividends;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class StockDividendsByDate {

    private String exDate;
    private String recordDate;
    private String paymentDate;
    private Double amount;

}