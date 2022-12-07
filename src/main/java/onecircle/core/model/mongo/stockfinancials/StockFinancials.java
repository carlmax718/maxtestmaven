package onecircle.core.model.mongo.stockfinancials;

import org.springframework.validation.annotation.Validated;
import javax.persistence.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Validated
@Document(collection = "stockFinancials")
public class StockFinancials   {


  @Field(name="ticker_date_id")
  @Indexed( unique = true )
  @Id
  private String tickerDateId;

  @Field(name="ticker")
  private String ticker;

  @Field(name = "source_date")
  private LocalDateTime date;

  @Field(name = "month")
  private int month;

  @Field(name = "year")
  private int year;

  @Field(name = "quarter")
  private int quarter;

  @Field(name = "update_date")
  private LocalDateTime updateDate;

  @Field(name = "source")
  private String source;

  @Field(name = "timestamp")
  private Timestamp timestamp; 
  
  @Field("calendarDate")
  private String calendarDate;

  @Field("reportPeriod")
  private String reportPeriod;

  @Field("updated")
  private String updated;

  @Field("datekey")
  private String dateKey;

  @Field("period")
  private String period;

  @Field("accumulatedOtherComprehensiveIncome")
  private Float accumulatedOtherComprehensiveIncome;

  @Field("assets")
  private Float assets;

  @Field("assetsAverage")
  private Float assetsAverage;

  @Field("assetsCurrent")
  private Float assetsCurrent;

  @Field("assetsNonCurrent")
  private Float assetsNonCurrent;

  @Field("assetTurnover")
  private Float assetTurnover;

  @Field("bookValuePerShare")
  private Float bookValuePerShare;

  @Field("capitalExpenditure")
  private Float capitalExpenditure;

  @Field("cashAndEquivalents")
  private Float cashAndEquivalents;

  @Field("cashAndEquivalentsUSD")
  private Float cashAndEquivalentsUSD;

  @Field("costOfRevenue")
  private Float costOfRevenue;

  @Field("consolidatedIncome")
  private Float consolidatedIncome;

  @Field("currentRatio")
  private Float currentRatio;

  @Field("debtToEquityRatio")
  private Float debtToEquityRatio;

  @Field("debt")
  private Float debt;

  @Field("debtCurrent")
  private Float debtCurrent;

  @Field("debtNonCurrent")
  private Float debtNonCurrent;

  @Field("ldebtUSD")
  private Float debtUSD;

  @Field("deferredRevenue")
  private Float deferredRevenue;

  @Field("depreciationAmortizationAndAccretion")
  private Float depreciationAmortizationAndAccretion;

  @Field("deposits")
  private Float deposits;

  @Field("dividendYield")
  private Float dividendYield;

  @Field("dividendsPerBasicCommonShare")
  private Float dividendsPerBasicCommonShare;

  @Field("earningBeforeInterestTaxes")
  private Float earningBeforeInterestTaxes;

  @Field("earningsBeforeInterestTaxesDepreciationAmortization")
  private Float earningsBeforeInterestTaxesDepreciationAmortization;

  @Field("EBITDAMargin")
  private Float EBITDAMargin;

  @Field("earningsBeforeInterestTaxesDepreciationAmortizationUSD")
  private Float earningsBeforeInterestTaxesDepreciationAmortizationUSD;

  @Field("earningBeforeInterestTaxesUSD")
  private Float earningBeforeInterestTaxesUSD;

  @Field("earningsBeforeTax")
  private Float earningsBeforeTax;

  @Field("earningsPerBasicShare")
  private Float earningsPerBasicShare;

  @Field("earningsPerDilutedShare")
  private Float earningsPerDilutedShare;

  @Field("earningsPerBasicShareUSD")
  private Float earningsPerBasicShareUSD;

  @Field("shareholdersEquity")
  private Float shareholdersEquity;

  @Field("averageEquity")
  private Float averageEquity;

  @Field("shareholdersEquityUSD")
  private Float shareholdersEquityUSD;

  @Field("enterpriseValue")
  private Float enterpriseValue;

  @Field("enterpriseValueOverEBIT")
  private Float enterpriseValueOverEBIT;

  @Field("enterpriseValueOverEBITDA")
  private Float enterpriseValueOverEBITDA;

  @Field("freeCashFlow")
  private Float freeCashFlow;

  @Field("freeCashFlowPerShare")
  private Float freeCashFlowPerShare;

  @Field("foreignCurrencyUSDExchangeRate")
  private Float foreignCurrencyUSDExchangeRate;

  @Field("grossProfit")
  private Float grossProfit;

  @Field("grossMargin")
  private Float grossMargin;

  @Field("goodwillAndIntangibleAssets")
  private Float goodwillAndIntangibleAssets;

  @Field("interestExpense")
  private Float interestExpense;

  @Field("investedCapital")
  private Float investedCapital;

  @Field("investedCapitalAverage")
  private Float investedCapitalAverage;

  @Field("inventory")
  private Float inventory;

  @Field("investments")
  private Float investments;

  @Field("investmentsCurrent")
  private Float investmentsCurrent;

  @Field("investmentsNonCurrent")
  private Float investmentsNonCurrent;

  @Field("totalLiabilities")
  private Float totalLiabilities;

  @Field("currentLiabilities")
  private Float currentLiabilities;

  @Field("liabilitiesNonCurrent")
  private Float liabilitiesNonCurrent;

  @Field("marketCapitalization")
  private Float marketCapitalization;

  @Field("netCashFlow")
  private Float netCashFlow;

  @Field("netCashFlowBusinessAcquisitionsDisposals")
  private Float netCashFlowBusinessAcquisitionsDisposals;

  @Field("issuanceEquityShares")
  private Float issuanceEquityShares;

  @Field("issuanceDebtSecurities")
  private Float issuanceDebtSecurities;

  @Field("paymentDividendsOtherCashDistributions")
  private Float paymentDividendsOtherCashDistributions;

  @Field("netCashFlowFromFinancing")
  private Float netCashFlowFromFinancing;

  @Field("netCashFlowFromInvesting")
  private Float netCashFlowFromInvesting;

  @Field("netCashFlowInvestmentAcquisitionsDisposals")
  private Float netCashFlowInvestmentAcquisitionsDisposals;

  @Field("netCashFlowFromOperations")
  private Float netCashFlowFromOperations;

  @Field("effectOfExchangeRateChangesOnCash")
  private Float effectOfExchangeRateChangesOnCash;

  @Field("netIncome")
  private Float netIncome;

  @Field("netIncomeCommonStock")
  private Float netIncomeCommonStock;

  @Field("netIncomeCommonStockUSD")
  private Float netIncomeCommonStockUSD;

  @Field("netLossIncomeFromDiscontinuedOperations")
  private Float netLossIncomeFromDiscontinuedOperations;

  @Field("netIncomeToNonControllingInterests")
  private Float netIncomeToNonControllingInterests;

  @Field("profitMargin")
  private Float profitMargin;

  @Field("operatingExpenses")
  private Float operatingExpenses;

  @Field("operatingIncome")
  private Float operatingIncome;

  @Field("tradeAndNonTradePayables")
  private Float tradeAndNonTradePayables;

  @Field("payoutRatio")
  private Float payoutRatio;

  @Field("priceToBookValue")
  private Float priceToBookValue;

  @Field("priceEarnings")
  private Float priceEarnings;

  @Field("priceToEarningsRatio")
  private Float priceToEarningsRatio;

  @Field("propertyPlantEquipmentNet")
  private Float propertyPlantEquipmentNet;

  @Field("preferredDividendsIncomeStatementImpact")
  private Float preferredDividendsIncomeStatementImpact;

  @Field("sharePriceAdjustedClose")
  private Float sharePriceAdjustedClose;

  @Field("priceSales")
  private Float priceSales;

  @Field("priceToSalesRatio")
  private Float priceToSalesRatio;

  @Field("tradeAndNonTradeReceivables")
  private Float tradeAndNonTradeReceivables;
  
  @Field("accumulatedRetainedEarningsDeficit")
  private Float accumulatedRetainedEarningsDeficit;

  @Field("revenues")
  private Float revenues;

  @Field("revenuesUSD")
  private Float revenuesUSD;

  @Field("researchAndDevelopmentExpense")
  private Float researchAndDevelopmentExpense;

  @Field("returnOnAverageAssets")
  private Float returnOnAverageAssets;

  @Field("returnOnAverageEquity")
  private Float returnOnAverageEquity;

  @Field("returnOnInvestedCapital")
  private Float returnOnInvestedCapital;

  @Field("returnOnSales")
  private Float returnOnSales;

  @Field("shareBasedCompensation")
  private Float shareBasedCompensation;

  @Field("sellingGeneralAndAdministrativeExpense")
  private Float sellingGeneralAndAdministrativeExpense;

  @Field("shareFactor")
  private Float shareFactor;

  @Field("shares")
  private Float shares;

  @Field("weightedAverageShares")
  private Float weightedAverageShares;

  @Field("weightedAverageSharesDiluted")
  private Float weightedAverageSharesDiluted;

  @Field("salesPerShare")
  private Float salesPerShare;

  @Field("tangibleAssetValue")
  private Float tangibleAssetValue;

  @Field("taxAssets")
  private Float taxAssets;

  @Field("incomeTaxExpense")
  private Float incomeTaxExpense;

  @Field("taxLiabilities")
  private Float taxLiabilities;

  @Field("tangibleAssetsBookValuePerShare")
  private Float tangibleAssetsBookValuePerShare;

  @Field("workingCapital")
  private Float workingCapital;
}