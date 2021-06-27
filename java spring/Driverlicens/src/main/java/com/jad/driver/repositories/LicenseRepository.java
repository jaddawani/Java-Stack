package com.jad.driver.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jad.driver.models.License;


@Repository
public interface LicenseRepository extends CrudRepository <License , Long>  {

}
