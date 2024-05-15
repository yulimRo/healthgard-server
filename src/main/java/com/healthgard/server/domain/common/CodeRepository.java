package com.healthgard.server.domain.common;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeRepository extends JpaRepository<Code, CodePK> {

	List<Code> findAllByCodeUpperCode(String upperCode);
	
}
