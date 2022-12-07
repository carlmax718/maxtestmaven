package onecircle.core.model.sql.ticker;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Narendra
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = "ticker")
public class Ticker {

    @Id
    @Column(name = "ticker")
    private String tickerId;

    @Column(name = "name")
    private String tickerName;

    @Column(name = "market")
    private String market;

    @Column(name = "locale")
    private String locale;

    @Column(name = "currency")
    private String currency;

    @Column(name = "active")
    private boolean isActive;

    @Column(name = "primary_exchange")
    private String primaryExchange;

    @Column(name = "type")
    private String type;

    @Column(name = "cik")
    private String cik;

    @Column(name = "composite_figi")
    private String compositeFigi;

    @Column(name = "source_date")
    private LocalDate sourceDate;

    @Column(name = "share_class_figi")
    private String shareClassFigi;
    
    @Column(name = "source")
    private String source;
    
    @Column(name = "update_date")
    private LocalDate updateDate;
}
