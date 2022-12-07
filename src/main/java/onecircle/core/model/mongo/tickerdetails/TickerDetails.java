package onecircle.core.model.mongo.tickerdetails;

import org.springframework.validation.annotation.Validated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.index.Indexed;
import java.util.List;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Validated
@EqualsAndHashCode(callSuper=false)
@Document(collection = "tickerDetails")
public class TickerDetails   {

  @Field("ticker")
  @Id
  //@Indexed(unique = true)
  private String ticker;

  @Field("logo")
  private String logo;

  @Field("listDate")
  private String listDate;

  @Field("cik")
  private long cik;

  @Field("bloomberg")
  private String bloomberg;

  @Field("figi")
  private String figi;

  @Field("lei")
  private String lei;

  @Field("sic")
  private long sic;

  @Field("country")
  private String country;

  @Field("industry")
  private String industry;

  @Field("sector")
  private String sector;

  @Field("marketcap")
  private long marketcap;

  @Field("employees")
  private long employees;

  @Field("phone")
  private String phone;

  @Field("ceo")
  private String ceo;

  @Field("url")
  private String url;

  @Field("description")
  private String description;

  @Field("hq_address")
  private String hq_address;

  @Field("hq_state")
  private String hq_state;
  
  @Field("hq_country")
  private String hq_country;

  @Field("similar")  
  private List<Object> similar;

  @Field("tags")  
  private List<Object> tags;
  
  @Field("updated")
  private String updated;

   @Field("active")
   private boolean active;

}