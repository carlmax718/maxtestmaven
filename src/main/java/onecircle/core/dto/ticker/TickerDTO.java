package onecircle.core.dto.ticker;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TickerDTO {
    private String ticker;
    private String name;
    private String market;
    private String locale;
    private String currency_name;
    private boolean active;
    private String primary_exchange;
    private String type;
    private String cik;
    private String share_class_figi;
    private String composite_figi;
    private String last_updated_utc;

    public String getCurrencyName() {
        return this.currency_name;
    }

    public String getPrimaryExchange() {
        return this.primary_exchange;
    }

    public boolean getActive() {
        return this.active;
    }

    public String getShareClassFigi() {
        return this.share_class_figi;
    }

    public String getCompositeFigi() {
        return this.composite_figi;
    }

    public String getLastUpdated() {
        return this.last_updated_utc;
    }

}
