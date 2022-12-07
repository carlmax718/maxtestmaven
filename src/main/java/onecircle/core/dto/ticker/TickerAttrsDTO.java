package onecircle.core.dto.ticker;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TickerAttrsDTO {
    private String currencyName;
    private String currency;
    private String baseName;
    private String base;
}
