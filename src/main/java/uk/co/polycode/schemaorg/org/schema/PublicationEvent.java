package uk.co.polycode.schemaorg.org.schema;

import java.lang.String;

/**
 * PublicationEvent
 *
 * A PublicationEvent corresponds indifferently to the event of publication for a CreativeWork of any type e.g. a broadcast event, an on-demand event, a book/journal publication via a variety of delivery media.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class PublicationEvent extends Event {
  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://schema.org/PublicationEvent";

  /**
   * An agent associated with the publication event.
   */
  public Person publishedBy;

  /**
   * An agent associated with the publication event.
   */
  public Organization publishedByOrganization;

  /**
   * A broadcast service associated with the publication event.
   */
  public BroadcastService publishedOn;
}

