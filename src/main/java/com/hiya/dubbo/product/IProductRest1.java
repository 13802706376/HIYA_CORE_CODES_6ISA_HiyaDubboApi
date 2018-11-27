package com.hiya.dubbo.product;

import javax.validation.constraints.Min;

public interface IProductRest1
{
    
     Product getProduct(@Min(value=1L, message="User ID must be greater than 1") Long id);
    
     int saveProduct(Product  product);
    
}
