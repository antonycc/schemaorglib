package uk.co.polycode.schemaorg.org.schema;

import java.lang.String;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * AggregateOffer
 *
 * When a single product is associated with multiple offers (for example, the same pair of shoes is offered by different merchants), then AggregateOffer can be used.<br/><br/>
 *
 * Note: AggregateOffers are normally expected to associate multiple offers that all share the same defined <a class="localLink" href="https://schema.org/businessFunction">businessFunction</a> value, or default to http://purl.org/goodrelations/v1#Sell if businessFunction is not explicitly defined.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class AggregateOffer extends Offer {
  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://schema.org/AggregateOffer";

  /**
   * The highest price of all offers available.<br/><br/>
   *
   * Usage guidelines:<br/><br/>
   *
   * <ul>
   * <li>Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.</li>
   * <li>Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.</li>
   * </ul>
   */
  public BigDecimal highPrice;

  /**
   * The lowest price of all offers available.<br/><br/>
   *
   * Usage guidelines:<br/><br/>
   *
   * <ul>
   * <li>Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.</li>
   * <li>Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.</li>
   * </ul>
   */
  public BigDecimal lowPrice;

  /**
   * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use <a class="localLink" href="https://schema.org/businessFunction">businessFunction</a> to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a <a class="localLink" href="https://schema.org/Demand">Demand</a>. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   */
  public Offer offers;

  /**
   * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. Use <a class="localLink" href="https://schema.org/businessFunction">businessFunction</a> to indicate the kind of transaction offered, i.e. sell, lease, etc. This property can also be used to describe a <a class="localLink" href="https://schema.org/Demand">Demand</a>. While this property is listed as expected on a number of common types, it can be used in others. In that case, using a second type, such as Product or a subtype of Product, can clarify the nature of the offer.
   */
  public Demand offersDemand;

  /**
   * The number of offers for the product.
   */
  public BigInteger offerCount;
}

