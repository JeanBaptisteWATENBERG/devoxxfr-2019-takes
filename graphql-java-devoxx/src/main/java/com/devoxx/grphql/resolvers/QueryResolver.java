package com.devoxx.grphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.devoxx.grphql.services.BusinessObjectService;
import com.devoxx.grphql.services.DocumentService;
import com.devoxx.grphql.vo.BusinessObject;
import com.devoxx.grphql.vo.Document;

import java.util.List;

public class QueryResolver implements GraphQLQueryResolver {
    private final DocumentService documentService;
    private final BusinessObjectService businessObjectService;

    public QueryResolver(DocumentService documentService, BusinessObjectService businessObjectService) {
        this.documentService = documentService;
        this.businessObjectService = businessObjectService;
    }

    public List<Document> allDocuments() {
        return documentService.getDocuments();
    }

    public List<BusinessObject> allBusinessObjects() {
        return businessObjectService.getBusinessObjects();
    }

}
