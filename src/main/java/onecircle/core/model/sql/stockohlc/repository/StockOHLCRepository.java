package onecircle.core.model.sql.stockohlc.repository;
import  onecircle.core.model.sql.stockohlc.StockOHLCDaily;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * StockOHLCRepository
 */
public interface StockOHLCRepository extends JpaRepository<StockOHLCDaily, String> {
    
}