package com.fis.userr.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fis.userr.bean.Userr;

@Repository
public interface UserrRepository extends JpaRepository<Userr, Integer> {
	Userr findByUsername(String username);

}
