package com.hiya.dubbo.product;

import java.io.Serializable;

public class Product implements Serializable 
{
    private static final long serialVersionUID = 17090L;

    private Long id;

    private String name;

    public Product(Long id, String name)
    {
        super();
        this.id = id;
        this.name = name;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    @Override
    public String toString()
    {
        return "Id:"+this.getId()+"; Name:"+this.getName();
    }
}
