package onecircle.core.dto.stockohlchistory;

import lombok.*;

import java.util.List;

/**
 * This class is representation for ploygon.io/StockAPI/Grouped Daily (Bars) response object
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockOHLCHistoryInfoDTO {
    private String status;
    private long queryCount;
    private long resultsCount;
    private boolean adjusted;
    private List<Object> results;
}
