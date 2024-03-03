package org.example.dataentity.catalog;

public record AuthorData(
        String authorId,
        String Name,
        java.util.List<String> bookISBNs) {
}
