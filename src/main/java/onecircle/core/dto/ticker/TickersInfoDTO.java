package onecircle.core.dto.ticker;

import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TickersInfoDTO {
    private String request_id;
    private int count;
    private String status;
    private List<TickerDTO> results;
    private String next_url;

    public String getNextUrl() {
        return this.next_url;
    }
}