package com.health.insurance.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthInsuranceRepository extends JpaRepository<HealthInsuranceEntity, Long> {

		List<HealthInsuranceEntity> findAllByMobile(Long mobile);
		
		List<HealthInsuranceEntity> findAllByEmail(String email);
		
	
}
