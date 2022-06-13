package uk.co.polycode.schemaorg.org.schema;

import java.lang.String;

/**
 * ProductGroup
 *
 * A ProductGroup represents a group of <a class="localLink" href="https://schema.org/Product">Product</a>s that vary only in certain well-described ways, such as by <a class="localLink" href="https://schema.org/size">size</a>, <a class="localLink" href="https://schema.org/color">color</a>, <a class="localLink" href="https://schema.org/material">material</a> etc.<br/><br/>
 *
 * While a ProductGroup itself is not directly offered for sale, the various varying products that it represents can be. The ProductGroup serves as a prototype or template, standing in for all of the products who have an <a class="localLink" href="https://schema.org/isVariantOf">isVariantOf</a> relationship to it. As such, properties (including additional types) can be applied to the ProductGroup to represent characteristics shared by each of the (possibly very many) variants. Properties that reference a ProductGroup are not included in this mechanism; neither are the following specific properties <a class="localLink" href="https://schema.org/variesBy">variesBy</a>, <a class="localLink" href="https://schema.org/hasVariant">hasVariant</a>, <a class="localLink" href="https://schema.org/url">url</a>.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class ProductGroup extends Product {
  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://pending.schema.org/ProductGroup";

  /**
   * Indicates a <a class="localLink" href="https://schema.org/Product">Product</a> that is a member of this <a class="localLink" href="https://schema.org/ProductGroup">ProductGroup</a> (or <a class="localLink" href="https://schema.org/ProductModel">ProductModel</a>).
   */
  public Product hasVariant;

  /**
   * Indicates a textual identifier for a ProductGroup.
   */
  public String productGroupID;

  /**
   * Indicates the property or properties by which the variants in a <a class="localLink" href="https://schema.org/ProductGroup">ProductGroup</a> vary, e.g. their size, color etc. Schema.org properties can be referenced by their short name e.g. "color"; terms defined elsewhere can be referenced with their URIs.
   */
  public DefinedTerm variesBy;
}

