package onecircle.core.dto.stockfinancials;

import lombok.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockFinancialsInfoDTO {
    private String status;
    private List<StockFinancialsDTO> results;
}