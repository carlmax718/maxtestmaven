package onecircle.core.model.sql.stockexchangetype;

import lombok.*;
import java.io.Serializable;
import javax.persistence.*;
import onecircle.core.model.sql.stockexchangetype.StockExchangeTypeId;

/**
 * @author Baljit Singh
 *
 */

@NoArgsConstructor
@Entity
@Table(name = "stockexchangetype")
@IdClass(StockExchangeTypeId.class)
public class StockExchangeType implements Serializable {


    public StockExchangeType(String type, String market,
        String mic, String name, String tape) {
        this.type   = type;
        this.market = market;
        this.mic    = mic;
        this.name   = name;
        this.tape   = tape;
    }

    @Column(name = "type")
    private String type;

    @Column(name = "market")
    private String market;

    @Column(name = "mic")
    private String mic;

    @Id
    @Column(name = "name", nullable=false)
    private String name;

    @Column(name = "tape")
    private String tape;
}
