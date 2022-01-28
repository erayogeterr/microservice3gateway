package com.sha.microservice3gateway.service;

import com.google.gson.JsonElement;

import java.util.List;

public interface IProductService
{
    JsonElement saveProduct(JsonElement requestBody);

    void deleteProduct(Long productId);

    List<JsonElement> getAllProducts();
}