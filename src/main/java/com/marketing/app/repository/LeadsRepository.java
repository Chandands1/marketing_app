package com.marketing.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marketing.app.entity.Leads;

@Repository
public interface LeadsRepository extends JpaRepository<Leads, Long>{

}
