package com.devoxx.grphql;

import com.coxautodev.graphql.tools.SchemaParser;
import com.devoxx.grphql.resolvers.BusinessObjectResolver;
import com.devoxx.grphql.resolvers.QueryResolver;
import com.devoxx.grphql.services.BusinessObjectService;
import com.devoxx.grphql.services.DocumentService;
import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLHttpServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class Main {
    public static void main(String[] args) throws Exception {
        DocumentService documentService = new DocumentService();
        BusinessObjectService businessObjectService = new BusinessObjectService();
        SimpleGraphQLHttpServlet servlet = SimpleGraphQLHttpServlet.newBuilder(buildSchema(documentService, businessObjectService)).build();
        Server server = new Server(8080);

        ServletHandler handler = new ServletHandler();
        server.setHandler(handler);

        handler.addServletWithMapping(new ServletHolder(servlet), "/graphql");

        server.start();
        server.join();
    }

    private static GraphQLSchema buildSchema(DocumentService documentService, BusinessObjectService businessObjectService) {
        return SchemaParser
                .newParser()
                .file("schema.graphql")
                .resolvers(new QueryResolver(documentService, businessObjectService), new BusinessObjectResolver(documentService))
                .build()
                .makeExecutableSchema();
    }

}
