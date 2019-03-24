package com.in28minutes.microservices.currencyexchangeservice.repository;

import com.in28minutes.microservices.currencyexchangeservice.model.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

    ExchangeValue findByFromAndTo(String from, String to);
}
