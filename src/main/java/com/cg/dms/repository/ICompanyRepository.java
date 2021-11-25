package com.cg.dms.repository;
import com.cg.dms.entities.Company;
import com.cg.dms.entities.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ICompanyRepository extends JpaRepository<Company, Integer> {

}