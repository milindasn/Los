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
@Table(name = "AF_CO_MAS_CLIENT_EMPLOYMENT")
public class ClientEmployement {
    @Id
    private String clientCode;
    private String organization;
    private String address1;
    private String telNo;
    private Date fromDate;
    private Date toDate;
    private String entUser;
    private Date entDate;
    private String modUser;
    private Date modDate;
    private String designation;
}
