package uk.co.polycode.schemaorg.org.schema;

import java.lang.String;

/**
 * MedicalRiskFactor
 *
 * A risk factor is anything that increases a person's likelihood of developing or contracting a disease, medical condition, or complication.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class MedicalRiskFactor extends MedicalEntity {
  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://health-lifesci.schema.org/MedicalRiskFactor";

  /**
   * The condition, complication, etc. influenced by this factor.
   */
  public MedicalEntity increasesRiskOf;
}

