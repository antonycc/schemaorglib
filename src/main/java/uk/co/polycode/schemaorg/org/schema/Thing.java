package uk.co.polycode.schemaorg.org.schema;

import java.lang.String;
import java.net.URL;

/**
 * Thing
 *
 * The most generic type of item.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class Thing {
  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://schema.org/Thing";

  /**
   * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally.
   */
  public String additionalType;

  /**
   * An alias for the item.
   */
  public String alternateName;

  /**
   * A description of the item.
   */
  public String description;

  /**
   * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation.
   */
  public String disambiguatingDescription;

  /**
   * The identifier property represents any kind of identifier for any kind of <a class="localLink" href="https://schema.org/Thing">Thing</a>, such as ISBNs, GTIN codes, UUIDs etc. Schema.org provides dedicated properties for representing many of these, either as textual strings or as URL (URI) links. See <a href="/docs/datamodel.html#identifierBg">background notes</a> for more details.
   */
  public PropertyValue identifier;

  /**
   * An image of the item. This can be a <a class="localLink" href="https://schema.org/URL">URL</a> or a fully described <a class="localLink" href="https://schema.org/ImageObject">ImageObject</a>.
   */
  public ImageObject image;

  /**
   * Indicates a page (or other CreativeWork) for which this thing is the main entity being described. See <a href="/docs/datamodel.html#mainEntityBackground">background notes</a> for details.
   */
  public CreativeWork mainEntityOfPage;

  /**
   * The name of the item.
   */
  public String name;

  /**
   * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role.
   */
  public Action potentialAction;

  /**
   * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Wikidata entry, or official website.
   */
  public String sameAs;

  /**
   * A CreativeWork or Event about this Thing.
   */
  public Event subjectOf;

  /**
   * A CreativeWork or Event about this Thing.
   */
  public CreativeWork subjectOfCreativeWork;

  /**
   * URL of the item.
   */
  public URL url;
}

