package com.wellsfargo.batch5.pms.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wellsfargo.batch5.pms.entity.CompanyEntity;
import com.wellsfargo.batch5.pms.entity.StockEntity;


@Repository
public interface StockRepo extends JpaRepository<StockEntity, Integer> {

	List<StockEntity> findAllByCompany(CompanyEntity Company);
}
