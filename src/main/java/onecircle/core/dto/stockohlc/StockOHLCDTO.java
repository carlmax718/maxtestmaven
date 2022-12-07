package onecircle.core.dto.stockohlc;

import java.math.BigInteger;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StockOHLCDTO {
    private String T;
    private BigInteger v;
    private Float o;
    private Float c;
    private Float h;
    private Float l;
    private long t;
    private Float vw;
    private BigInteger n;

}
