package uk.co.polycode.schemaorg.org.schema;

import java.lang.String;

/**
 * NutritionInformation
 *
 * Nutritional information about the recipe.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class NutritionInformation extends StructuredValue {
  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://schema.org/NutritionInformation";

  /**
   * The number of calories.
   */
  public Energy calories;

  /**
   * The number of grams of carbohydrates.
   */
  public Mass carbohydrateContent;

  /**
   * The number of milligrams of cholesterol.
   */
  public Mass cholesterolContent;

  /**
   * The number of grams of fat.
   */
  public Mass fatContent;

  /**
   * The number of grams of fiber.
   */
  public Mass fiberContent;

  /**
   * The number of grams of protein.
   */
  public Mass proteinContent;

  /**
   * The number of grams of saturated fat.
   */
  public Mass saturatedFatContent;

  /**
   * The serving size, in terms of the number of volume or mass.
   */
  public String servingSize;

  /**
   * The number of milligrams of sodium.
   */
  public Mass sodiumContent;

  /**
   * The number of grams of sugar.
   */
  public Mass sugarContent;

  /**
   * The number of grams of trans fat.
   */
  public Mass transFatContent;

  /**
   * The number of grams of unsaturated fat.
   */
  public Mass unsaturatedFatContent;
}

