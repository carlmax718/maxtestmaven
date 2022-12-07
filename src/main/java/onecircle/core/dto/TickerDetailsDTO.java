package onecircle.core.dto;

import lombok.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TickerDetailsDTO {
    String ticker;
    String logo;
    String listDate;
    long cik;
    String bloomberg;
    String figi;
    String lei;
    long sic;
    String country;
    String industry;
    String sector;
    long marketcap;
    long employees;
    String phone;
    String ceo;
    String url;
    String description;
    String hq_address;
    String hq_state;
    String hq_country;
    List<Object> similar;
    List<Object> tags;
    String updated;
    boolean active;
}