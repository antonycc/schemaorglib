package uk.co.polycode.schemaorg.org.schema;

import java.lang.String;

/**
 * MedicalProcedure
 *
 * A process of care used in either a diagnostic, therapeutic, preventive or palliative capacity that relies on invasive (surgical), non-invasive, or other techniques.
 *
 *
 *             This file was generated by OWL to Java as a transformation of the Schema.org schema Version 14.0.
 *             Schema.org is released under the Creative Commons Attribution-ShareAlike License (version 3.0). 
 *             The Schema.org license is applicable to the generated source files and the license is available from 
 *             https://creativecommons.org/licenses/by-sa/3.0/
 *             
 */
public class MedicalProcedure extends MedicalEntity {
  /**
   * Where to find the definition of the OWL Class used to generate this Java class.
   */
  public String isDefinedBy = "https://health-lifesci.schema.org/MedicalProcedure";

  /**
   * Location in the body of the anatomical structure.
   */
  public String bodyLocation;

  /**
   * Typical or recommended followup care after the procedure is performed.
   */
  public String followup;

  /**
   * How the procedure is performed.
   */
  public String howPerformed;

  /**
   * Typical preparation that a patient must undergo before having the procedure performed.
   */
  public MedicalEntity preparation;

  /**
   * The type of procedure, for example Surgical, Noninvasive, or Percutaneous.
   */
  public MedicalProcedureType procedureType;

  /**
   * The status of the study (enumerated).
   */
  public MedicalStudyStatus status;

  /**
   * The status of the study (enumerated).
   */
  public EventStatusType statusEventStatusType;
}

