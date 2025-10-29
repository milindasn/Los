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
@Table(name = "LOS_CLIENT")
public class LosClient {
    @Id
    private String losClientId;
    private String customerType;
    private String title;
    private String firstName;
    private String surname;
    private String otherName;
    private String fullName;
    private String nicBr;
    private String vatRegNo;
    private String cribNo;
    private String resStatus;
    private String resAddress1;
    private String resAddress2;
    private String resCityCode;
    private String perAddress1;
    private String perAddress2;
    private String perCityCode;
    private String telHome;
    private String telOffice;
    private String mobile1;
    private String fax;
    private String email;
    private String maritalStatus;
    private String dobDoi;
    private String nationality;
    private String gender;
    private String subSector;
    private String subSegment;
    private String drivingLicense;
    private String employer;
    private String designation;
    private String keyDecisionMarker;
    private String netassetClientCode;
    private String entUser;
    private Date entDate;
}
