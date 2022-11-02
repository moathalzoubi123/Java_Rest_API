package com.datajpa.relationships.repository;

import com.datajpa.relationships.model.Zipcode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ZipcodeRepository extends CrudRepository<Zipcode, Long> {
}
