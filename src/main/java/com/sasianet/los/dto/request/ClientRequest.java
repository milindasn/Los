package com.sasianet.los.dto.request;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Tag(name = "ClientRequests")
public class ClientRequest {
    private String customerCode;
    private String customerType;
    private String title;
    private String firstName;
    private String surname;
    private String otherName;
    private String fullName;
    private String nicBr;
    private String vatRegno;
    private String cribNo;
    private String residentialStatus;
    private String rAddressL1;
    private String rAddressL2;
    private String residentialCity;
    private String pAddressL1;
    private String pAddressL2;
    private String permanentCity;
    private String telHome;
    private String telOffice;
    private String mobile1;
    private String fax;
    private String email;
    private String maritialStatus;
    private String dobDoi;
    private String nationality;
    private String gender;
    private String subSector;
    private String subSegment;
    private String drivingLicense;
    private String employer;
    private String designation;
    private String keyDecisionMarker;
    private String entUser;
    // Getters and Setters
}

