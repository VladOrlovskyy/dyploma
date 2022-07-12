package com.example.blog1.repo;

import com.example.blog1.models.Price;
import org.springframework.data.repository.CrudRepository;

public interface PriceRepository extends CrudRepository<Price, Long> {
}
