package onecircle.core.dto.stockdividends;
import java.math.BigInteger;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import java.util.List; 
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockDividendsDTO {

    String ticker;
    private String status;
    List<StockDividendsByDate>  results;    
}

