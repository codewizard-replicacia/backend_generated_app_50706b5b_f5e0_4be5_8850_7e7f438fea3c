package com.mycompany.group234.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.mycompany.group234.model.FocusGroup;
import com.mycompany.group234.model.AdvertisingAgency;
import com.mycompany.group234.model.DataAnalysis;
import com.mycompany.group234.model.Survey;
import com.mycompany.group234.model.CompetativeAnalysis;
import com.mycompany.group234.model.MarketResearch;
import com.mycompany.group234.model.TargetMarketIdentification;
import com.mycompany.group234.model.BrandPerception;
import com.mycompany.group234.model.MediaPlanAndBuying;
import com.mycompany.group234.converter.DurationConverter;
import com.mycompany.group234.converter.UUIDToByteConverter;
import com.mycompany.group234.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Survey")
@Table(name = "\"Survey\"", schema =  "\"generated_app\"")
@Data
                        
public class Survey {
	public Survey () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"SurveyID\"", nullable = true )
  private Integer surveyID;
	  
  @Column(name = "\"AudienceCategory\"", nullable = true )
  private Boolean audienceCategory;
  
	  
  @Column(name = "\"Questionnaire\"", nullable = true )
  private String questionnaire;
  
	  
  @Column(name = "\"Respondants\"", nullable = true )
  private String respondants;
  
	  
  @Column(name = "\"ResponseCaptured\"", nullable = true )
  private String responseCaptured;
  
	  
  @Column(name = "\"DataValidationsInput\"", nullable = true )
  private String dataValidationsInput;
  
	  
  @Column(name = "\"Finalreport\"", nullable = true )
  private String finalreport;
  
  
  
  
   
	@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"SurveyFeedback1\"",
            joinColumns = @JoinColumn( name="\"SurveyID\""),
            inverseJoinColumns = @JoinColumn( name="\"TargetMarketID\""), schema = "\"generated_app\"")
private List<TargetMarketIdentification> feedback1 = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Survey [" 
  + "SurveyID= " + surveyID  + ", " 
  + "AudienceCategory= " + audienceCategory  + ", " 
  + "Questionnaire= " + questionnaire  + ", " 
  + "Respondants= " + respondants  + ", " 
  + "ResponseCaptured= " + responseCaptured  + ", " 
  + "DataValidationsInput= " + dataValidationsInput  + ", " 
  + "Finalreport= " + finalreport 
 + "]";
	}
	
}