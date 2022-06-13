package uk.co.polycode.schemaorg.org.schema;

import java.lang.String;
import java.time.ZonedDateTime;

/**
 * WebPage
 *
 * A web page. Every web page is implicitly assumed to be declared to be of type WebPage, so the various properties about that webpage, such as <code>breadcrumb</code> may be used. We recommend explicit declaration if these properties are specified, but if they are found outside of an itemscope, they will be assumed to be about the page.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class WebPage extends CreativeWork {
  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://schema.org/WebPage";

  /**
   * A set of links that can help a user understand and navigate a website hierarchy.
   */
  public BreadcrumbList breadcrumb;

  /**
   * Indicates if this web page element is the main subject of the page.
   */
  public WebPageElement mainContentOfPage;

  /**
   * Indicates the main image on the page.
   */
  public ImageObject primaryImageOfPage;

  /**
   * A link related to this web page, for example to other related web pages.
   */
  public String relatedLink;

  /**
   * People or organizations that have reviewed the content on this web page for accuracy and/or completeness.
   */
  public Person reviewedBy;

  /**
   * People or organizations that have reviewed the content on this web page for accuracy and/or completeness.
   */
  public Organization reviewedByOrganization;

  /**
   * One of the more significant URLs on the page. Typically, these are the non-navigation links that are clicked on the most.
   */
  public String significantLink;

  /**
   * Indicates sections of a Web page that are particularly 'speakable' in the sense of being highlighted as being especially appropriate for text-to-speech conversion. Other sections of a page may also be usefully spoken in particular circumstances; the 'speakable' property serves to indicate the parts most likely to be generally useful for speech.<br/><br/>
   *
   * The <em>speakable</em> property can be repeated an arbitrary number of times, with three kinds of possible 'content-locator' values:<br/><br/>
   *
   * 1.) <em>id-value</em> URL references - uses <em>id-value</em> of an element in the page being annotated. The simplest use of <em>speakable</em> has (potentially relative) URL values, referencing identified sections of the document concerned.<br/><br/>
   *
   * 2.) CSS Selectors - addresses content in the annotated page, eg. via class attribute. Use the <a class="localLink" href="https://schema.org/cssSelector">cssSelector</a> property.<br/><br/>
   *
   * 3.)  XPaths - addresses content via XPaths (assuming an XML view of the content). Use the <a class="localLink" href="https://schema.org/xpath">xpath</a> property.<br/><br/>
   *
   * For more sophisticated markup of speakable sections beyond simple ID references, either CSS selectors or XPath expressions to pick out document section(s) as speakable. For this
   * we define a supporting type, <a class="localLink" href="https://schema.org/SpeakableSpecification">SpeakableSpecification</a>  which is defined to be a possible value of the <em>speakable</em> property.
   */
  public SpeakableSpecification speakable;

  /**
   * One of the domain specialities to which this web page's content applies.
   */
  public Specialty specialty;

  /**
   * Date on which the content on this web page was last reviewed for accuracy and/or completeness.
   */
  public ZonedDateTime lastReviewed;
}

