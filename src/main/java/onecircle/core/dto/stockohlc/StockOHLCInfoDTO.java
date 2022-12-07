package onecircle.core.dto.stockohlc;

import lombok.*;

import java.util.List;

/**
 * This class is representation for ploygon.io/StockAPI/Grouped Daily (Bars) response object
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockOHLCInfoDTO {
    private String status;
    private long queryCount;
    private long resultsCount;
    private boolean adjusted;
    private List<StockOHLCDTO> results;
}
