package onecircle.core.model.mongo.stockdividends;
import org.springframework.validation.annotation.Validated;
import onecircle.core.dto.stockdividends.StockDividendsByDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.index.Indexed;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import lombok.*;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Validated
@EqualsAndHashCode(callSuper=false)
@Document(collection = "stockDividends")
public class StockDividends{
       
    @Field(name="ticker_dividend_execdate_id")
    @Indexed( unique = true )
    @Id
    private String tickerDivExecId;

    @Field("ticker")
    private String ticker;

    @Field("exDate")
    private String exDate;

    @Field("recordDate")
    private String recordDate;

    @Field("paymentDate")
    private String paymentDate;

    @Field("amount")
    private Double amount;
}
