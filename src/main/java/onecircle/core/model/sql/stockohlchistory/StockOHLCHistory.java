package onecircle.core.model.sql.stockohlchistory;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import javax.persistence.*;
import javax.persistence.Table;
import lombok.*;

/**
 * This class holds SQL table entity for stockohlc *
 * 
 * @author Anshu Anand
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@IdClass(StockOHLCHistoryID.class)
@Table(name = "stockohlc_history")
public class StockOHLCHistory {

    @Id
    @Column(name = "ticker")
    private String ticker;

    @Id
    @Column(name = "timestamp")
    private Timestamp timestamp;   

    @Column(name = "trading_volume")
    private BigInteger tradingVolume;

    @Column(name = "open_price")
    private Float openPrice;

    @Column(name = "close_price")
    private Float closePrice;

    @Column(name = "high_price")
    private Float highPrice;

    @Column(name = "low_price")
    private Float lowPrice;   

    @Column(name = "volume_weighted_avg")
    private Float volumeWeightedAvgPrice;

    @Column(name = "number_of_transactions")
    private BigInteger noTransaction;

    @Column(name = "source_date")
    private LocalDateTime date;

    @Column(name = "month")
    private int month;

    @Column(name = "year")
    private int year;

    @Column(name = "quarter")
    private int quarter;

    @Column(name = "update_date")
    private LocalDateTime updateDate;

    @Column(name = "source")
    private String source;

}
