package org.example.dataentity.catalog;

import java.util.Map;

/**
 * @author Burmau Garba
 * @version 1
 * @title Data Oriented Programming By Yehonathan Sharvit
 */
public record CatalogData(
        Map<String, BookData> booksByISBN,
        Map<String, AuthorData> authorsById) {
}
