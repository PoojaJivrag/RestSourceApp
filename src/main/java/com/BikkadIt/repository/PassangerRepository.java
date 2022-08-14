package com.BikkadIt.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIt.model.Passanger;


@Repository
public  interface PassangerRepository extends CrudRepository<Passanger, Integer> {

	
}
