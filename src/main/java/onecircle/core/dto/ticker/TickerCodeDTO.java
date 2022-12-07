package onecircle.core.dto.ticker;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TickerCodeDTO {
    private String cik;
    private String figiuid;
    private String scfigi;
    private String cfigi;
    private String figi;
}
