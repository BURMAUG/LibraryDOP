package org.example.dataentity.catalog;

public record BookData(
        String title,
        int publicationYear,
        String isbn,
        String publisher,
        java.util.List<String> authorIds,
        java.util.List<BookItem> bookItems
) {
}
