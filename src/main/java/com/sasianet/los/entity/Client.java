package com.sasianet.los.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "AF_CO_MAS_CLIENT")
public class Client {
    @Id
    private String clientCode;
    private String clientType;
    private String fullName;
    private String businessSubSector;
    private String clientCategory;
    private String address1;
    private String address2;
    private String cityCode;
    private String reference;
    private String telNo;
    private String faxNo;
    private String email;
    private String officeTelNo;
    private String mobileNo;
    private String activeStatus;
    private String tempActiveStatus;
    private String entUser;
    private Date entDate;
    private String modUser;
    private Date modDate;
    private String catTypeCode;
    private String nicNo;
    private String businessCertificateNo;
    private String keyDecisionMaker;
    private String designation;
    private String directTelNo;
    private String contactForPayment;
    private String designationPayment;
    private String factoryAddress1;
    private String factoryAddress2;
    private String factoryStatus;
    private String fContactPerson;
    private String registeredAddress1;
    private String registeredAddress2;
    private String registeredCityCode;
    private String registeredStatus;
    private String correspondenceStatus;
    private String fTelNo;
    private String fFaxNo;
    private String fEmail;
    private long issuedShareCapital;
    private Date dateOfIncorporation;
    private String vatRegNo;
    private Date vatRegDate;
    private String title;
    private String firstName;
    private String surname;
    private String initials;
    private String otherName;
    private String residentialStatus;
    private long durationAtYears;
    private String durationAtMonths;
    private String passportNo;
    private String maritalStatus;
    private Date dateOfBirth;
    private String nationality;
    private String gender;
    private String baNatureOfBusiness;
    private String baProfession;
    private String baQualifications;
    private String baDesignation;
    private String empName;
    private String empAddress1;
    private String empAddress2;
    private String empReference;
    private String empRdesignation;
    private String empTelNo;
    private String empFaxNo;
    private String afClient;
    private String afGuarantors;
    private String faClient;
    private String faDebtor;
    private long noOfChildren;
    private long dependents;
    private String telNoGen;
    private String faxNoGen;
    private String emailGen;
    private String drivingLicenseNo;
    private String postalCode;
    private String gribNo;
    private String sectorCode;
    private String nicOld;
    private String segementCode;
}
