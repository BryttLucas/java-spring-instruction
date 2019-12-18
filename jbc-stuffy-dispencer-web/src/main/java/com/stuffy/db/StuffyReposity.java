package com.stuffy.db;

import org.springframework.data.repository.CrudRepository;

import com.stuffy.business.Stuffy;

public interface StuffyReposity extends CrudRepository<Stuffy, Integer> {

}
