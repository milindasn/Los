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
@Table(name = "AF_CO_MAS_CLIENT_INCOME_EXPEN")
public class ClientIncomeExpense {
    @Id
    private String clientCode;
    private String iECode;
    private long amount;
    private String remarks;
    private String entUser;
    private Date entDate;
    private String modUser;
    private Date modDate;
    private String activeStatus;
    private String type;
}
