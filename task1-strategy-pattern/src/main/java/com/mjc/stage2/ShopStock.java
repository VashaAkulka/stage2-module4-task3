package com.mjc.stage2;

import java.util.List;

public class ShopStock {
    private final List<Product> productList;

    public ShopStock(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> listExecuteFilteringStrategy(FilteringStrategy filteringStrategy) {
        return productList.stream().filter(filteringStrategy::filter).toList();
    }
}
