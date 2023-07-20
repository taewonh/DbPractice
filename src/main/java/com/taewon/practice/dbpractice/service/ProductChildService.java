package com.taewon.practice.dbpractice.service;

import com.taewon.practice.dbpractice.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductChildService {

    private final ProductRepository repository;
}
