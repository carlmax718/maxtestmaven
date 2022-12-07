package onecircle.core.dto;

import lombok.*;

import java.util.List;

/**
 * This class is representation for ploygon.io/StockAPI/Grouped Daily (Bars) response object
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LocaleInfoDTO {
	
    private String status;
    private List<LocaleDTO> results;
}
