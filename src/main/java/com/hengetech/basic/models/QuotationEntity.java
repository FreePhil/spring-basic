package com.hengetech.basic.models;


import java.util.Date;

import groovy.transform.builder.Builder;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "TT_Quotation")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
public class QuotationEntity {
    private @Id @Column(name="CustomerCode") String customerCode;
    private @Column(name="ChargeCode") String chargeCode;
    private @Column(name="Currency") String currency;
    private @Column(name="UnitPrice") Double unitPrice;
    private @Column(name="MinCharge") Double minCharge;
    private @Column(name="CreatedBy") String createdBy;
    private @Column(name="CreatedDate") @Temporal(TemporalType.TIMESTAMP) Date createdDate;
    private @Column(name="RevisedBy") String revisedBy;
    private @Column(name="RevisedDate") @Temporal(TemporalType.TIMESTAMP) Date revisedDate;
}
