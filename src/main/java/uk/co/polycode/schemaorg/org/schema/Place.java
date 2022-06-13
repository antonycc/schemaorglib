package uk.co.polycode.schemaorg.org.schema;

import java.lang.Boolean;
import java.lang.String;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Place
 *
 * Entities that have a somewhat fixed, physical extension.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class Place extends Thing {
  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://schema.org/Place";

  /**
   * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.<br/><br/>
   *
   * Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. https://schema.org/width, https://schema.org/color, https://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism.
   */
  public PropertyValue additionalProperty;

  /**
   * Physical address of the item.
   */
  public PostalAddress address;

  /**
   * The overall rating, based on a collection of reviews or ratings, of the item.
   */
  public AggregateRating aggregateRating;

  /**
   * An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs.
   */
  public LocationFeatureSpecification amenityFeature;

  /**
   * A short textual code (also called "store code") that uniquely identifies a place of business. The code is typically assigned by the parentOrganization and used in structured URLs.<br/><br/>
   *
   * For example, in the URL http://www.starbucks.co.uk/store-locator/etc/detail/3047 the code "3047" is a branchCode for a particular branch.
   */
  public String branchCode;

  /**
   * The basic containment relation between a place and one that contains it.
   */
  public Place containedInPlace;

  /**
   * The basic containment relation between a place and another that it contains.
   */
  public Place containsPlace;

  /**
   * Upcoming or past event associated with this place, organization, or action.
   */
  public Event event;

  /**
   * The fax number.
   */
  public String faxNumber;

  /**
   * The geo coordinates of the place.
   */
  public GeoCoordinates geo;

  /**
   * The geo coordinates of the place.
   */
  public GeoShape geoGeoShape;

  /**
   * Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. "a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a". As defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a>.
   */
  public Place geoContains;

  /**
   * Represents a relationship between two geometries (or the places they represent), relating a containing geometry to a contained geometry. "a contains b iff no points of b lie in the exterior of a, and at least one point of the interior of b lies in the interior of a". As defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a>.
   */
  public GeospatialGeometry geoContainsGeospatialGeometry;

  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a>.
   */
  public GeospatialGeometry geoCoveredBy;

  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that covers it. As defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a>.
   */
  public Place geoCoveredByPlace;

  /**
   * Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. "Every point of b is a point of (the interior or boundary of) a". As defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a>.
   */
  public GeospatialGeometry geoCovers;

  /**
   * Represents a relationship between two geometries (or the places they represent), relating a covering geometry to a covered geometry. "Every point of b is a point of (the interior or boundary of) a". As defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a>.
   */
  public Place geoCoversPlace;

  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: "a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them". As defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a>.
   */
  public GeospatialGeometry geoCrosses;

  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that crosses it: "a crosses b: they have some but not all interior points in common, and the dimension of the intersection is less than that of at least one of them". As defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a>.
   */
  public Place geoCrossesPlace;

  /**
   * Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: they have no point in common. They form a set of disconnected geometries." (a symmetric relationship, as defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a>)
   */
  public GeospatialGeometry geoDisjoint;

  /**
   * Represents spatial relations in which two geometries (or the places they represent) are topologically disjoint: they have no point in common. They form a set of disconnected geometries." (a symmetric relationship, as defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a>)
   */
  public Place geoDisjointPlace;

  /**
   * Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a>. "Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other" (a symmetric relationship)
   */
  public Place geoEquals;

  /**
   * Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a>. "Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other" (a symmetric relationship)
   */
  public GeospatialGeometry geoEqualsGeospatialGeometry;

  /**
   * Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a>.
   */
  public GeospatialGeometry geoIntersects;

  /**
   * Represents spatial relations in which two geometries (or the places they represent) have at least one point in common. As defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a>.
   */
  public Place geoIntersectsPlace;

  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a>.
   */
  public Place geoOverlaps;

  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to another that geospatially overlaps it, i.e. they have some but not all points in common. As defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a>.
   */
  public GeospatialGeometry geoOverlapsGeospatialGeometry;

  /**
   * Represents spatial relations in which two geometries (or the places they represent) touch: they have at least one boundary point in common, but no interior points." (a symmetric relationship, as defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a> )
   */
  public Place geoTouches;

  /**
   * Represents spatial relations in which two geometries (or the places they represent) touch: they have at least one boundary point in common, but no interior points." (a symmetric relationship, as defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a> )
   */
  public GeospatialGeometry geoTouchesGeospatialGeometry;

  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a>.
   */
  public Place geoWithin;

  /**
   * Represents a relationship between two geometries (or the places they represent), relating a geometry to one that contains it, i.e. it is inside (i.e. within) its interior. As defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a>.
   */
  public GeospatialGeometry geoWithinGeospatialGeometry;

  /**
   * The <a href="http://www.gs1.org/gln">Global Location Number</a> (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
   */
  public String globalLocationNumber;

  /**
   * A URL to a map of the place.
   */
  public Map hasMap;

  /**
   * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
   */
  public String isicV4;

  /**
   * Keywords or tags used to describe some item. Multiple textual entries in a keywords list are typically delimited by commas, or by repeating the property.
   */
  public DefinedTerm keywords;

  /**
   * The latitude of a location. For example <code>37.42242</code> (<a href="https://en.wikipedia.org/wiki/World_Geodetic_System">WGS 84</a>).
   */
  public BigDecimal latitude;

  /**
   * An associated logo.
   */
  public ImageObject logo;

  /**
   * The longitude of a location. For example <code>-122.08585</code> (<a href="https://en.wikipedia.org/wiki/World_Geodetic_System">WGS 84</a>).
   */
  public BigDecimal longitude;

  /**
   * The opening hours of a certain place.
   */
  public OpeningHoursSpecification openingHoursSpecification;

  /**
   * A photograph of this place.
   */
  public Photograph photo;

  /**
   * A photograph of this place.
   */
  public ImageObject photoImageObject;

  /**
   * A review of the item.
   */
  public Review review;

  /**
   * A slogan or motto associated with the item.
   */
  public String slogan;

  /**
   * The special opening hours of a certain place.<br/><br/>
   *
   * Use this to explicitly override general opening hours brought in scope by <a class="localLink" href="https://schema.org/openingHoursSpecification">openingHoursSpecification</a> or <a class="localLink" href="https://schema.org/openingHours">openingHours</a>.
   */
  public OpeningHoursSpecification specialOpeningHoursSpecification;

  /**
   * The telephone number.
   */
  public String telephone;

  /**
   * A page providing information on how to book a tour of some <a class="localLink" href="https://schema.org/Place">Place</a>, such as an <a class="localLink" href="https://schema.org/Accommodation">Accommodation</a> or <a class="localLink" href="https://schema.org/ApartmentComplex">ApartmentComplex</a> in a real estate setting, as well as other kinds of tours as appropriate.
   */
  public String tourBookingPage;

  /**
   * Indicates whether some facility (e.g. <a class="localLink" href="https://schema.org/FoodEstablishment">FoodEstablishment</a>, <a class="localLink" href="https://schema.org/CovidTestingFacility">CovidTestingFacility</a>) offers a service that can be used by driving through in a car. In the case of <a class="localLink" href="https://schema.org/CovidTestingFacility">CovidTestingFacility</a> such facilities could potentially help with social distancing from other potentially-infected users.
   */
  public Boolean hasDriveThroughService;

  /**
   * A flag to signal that the item, event, or place is accessible for free.
   */
  public Boolean isAccessibleForFree;

  /**
   * The total number of individuals that may attend an event or venue.
   */
  public BigInteger maximumAttendeeCapacity;

  /**
   * A flag to signal that the <a class="localLink" href="https://schema.org/Place">Place</a> is open to public visitors.  If this property is omitted there is no assumed default boolean value
   */
  public Boolean publicAccess;

  /**
   * Indicates whether it is allowed to smoke in the place, e.g. in the restaurant, hotel or hotel room.
   */
  public Boolean smokingAllowed;
}

