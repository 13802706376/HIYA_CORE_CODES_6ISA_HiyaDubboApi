package com.hiya.dubbo.product;

public interface IProduct
{
    Product getProduct(Long id);
    
    int saveProduct(Product  product);
}
