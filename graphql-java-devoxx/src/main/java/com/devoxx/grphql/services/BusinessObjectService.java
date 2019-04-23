package com.devoxx.grphql.services;

import com.devoxx.grphql.vo.BusinessObject;
import com.devoxx.grphql.vo.Document;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class BusinessObjectService {

    public List<BusinessObject> getBusinessObjects() {
        return Arrays.asList(
                new BusinessObject(UUID.randomUUID().toString(), "Entity"),
                new BusinessObject(UUID.randomUUID().toString(), "Product")
        );
    }
}
