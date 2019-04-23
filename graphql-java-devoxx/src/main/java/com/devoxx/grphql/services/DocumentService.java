package com.devoxx.grphql.services;

import com.devoxx.grphql.vo.Document;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class DocumentService {
    public List<Document> getDocuments() {
        return Arrays.asList(
                new Document(UUID.randomUUID().toString(), "toto", "pdf"),
                new Document(UUID.randomUUID().toString(), "toto", "doc")
        );
    }

    public List<Document> getDocumentsByBusinessObjectId(String id) {
        return Arrays.asList(
                new Document(UUID.randomUUID().toString(), "businessObject-" + id, "pdf"),
                new Document(UUID.randomUUID().toString(), "businessObject-" + id, "doc")
        );
    }
}
