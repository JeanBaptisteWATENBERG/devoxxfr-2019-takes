package com.devoxx.grphql.vo;

import java.util.Objects;

public class Document {
    private String id;
    private String name;
    private String format;

    public Document() {
    }

    public Document(String id, String name, String format) {
        this.id = id;
        this.name = name;
        this.format = format;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return Objects.equals(id, document.id) &&
                Objects.equals(name, document.name) &&
                Objects.equals(format, document.format);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, format);
    }
}
