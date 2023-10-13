package com.hengetech.basic.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hengetech.basic.models.QuotationEntity;

public interface QuotationRepo extends JpaRepository<QuotationEntity, String> {

}
