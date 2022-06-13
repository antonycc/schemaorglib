package uk.co.polycode.schemaorg.org.schema;

import java.lang.String;
import java.time.ZonedDateTime;

/**
 * ShippingDeliveryTime
 *
 * ShippingDeliveryTime provides various pieces of information about delivery times for shipping.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class ShippingDeliveryTime extends StructuredValue {
  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://pending.schema.org/ShippingDeliveryTime";

  /**
   * Days of the week when the merchant typically operates, indicated via opening hours markup.
   */
  public OpeningHoursSpecification businessDays;

  /**
   * The typical delay between the receipt of the order and the goods either leaving the warehouse or being prepared for pickup, in case the delivery method is on site pickup. Typical properties: minValue, maxValue, unitCode (d for DAY).  This is by common convention assumed to mean business days (if a unitCode is used, coded as "d"), i.e. only counting days when the business normally operates.
   */
  public QuantitativeValue handlingTime;

  /**
   * The typical delay the order has been sent for delivery and the goods reach the final customer. Typical properties: minValue, maxValue, unitCode (d for DAY).
   */
  public QuantitativeValue transitTime;

  /**
   * Order cutoff time allows merchants to describe the time after which they will no longer process orders received on that day. For orders processed after cutoff time, one day gets added to the delivery time estimate. This property is expected to be most typically used via the <a class="localLink" href="https://schema.org/ShippingRateSettings">ShippingRateSettings</a> publication pattern. The time is indicated using the ISO-8601 Time format, e.g. "23:30:00-05:00" would represent 6:30 pm Eastern Standard Time (EST) which is 5 hours behind Coordinated Universal Time (UTC).
   */
  public ZonedDateTime cutoffTime;
}

