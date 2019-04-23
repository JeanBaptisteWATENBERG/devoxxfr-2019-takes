package com.devoxx.grphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.devoxx.grphql.services.DocumentService;
import com.devoxx.grphql.vo.BusinessObject;
import com.devoxx.grphql.vo.Document;

import java.util.List;

public class BusinessObjectResolver implements GraphQLResolver<BusinessObject> {
    private final DocumentService documentService;

    public BusinessObjectResolver(DocumentService documentService) {
        this.documentService = documentService;
    }

    public List<Document> documents(BusinessObject businessObject) {
        return documentService.getDocumentsByBusinessObjectId(businessObject.getId());
    }
}
