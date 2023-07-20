package com.taewon.practice.dbpractice.service;

import com.taewon.practice.dbpractice.entity.Product;
import com.taewon.practice.dbpractice.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.stream.IntStream;

@Service
@AllArgsConstructor
@Slf4j
public class ProductParentService {

    private final ProductChildService childService;

    private final ProductRepository repository;

    public long count() {
        return repository.count();
    }

    public void saveRandomProduct(int saveCount) {
        IntStream.range(0, saveCount)
                .forEach(index -> {
                    Product product = Product.buildRandom();
                    repository.save(product);
                    log.info("Product {} save. {}", index, product);
                });
    }

    public void truncate() {
        repository.truncate();
    }
}
