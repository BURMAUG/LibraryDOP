package org.example.dataentity.library;

import org.example.dataentity.catalog.CatalogData;
import org.example.dataentity.usermanagement.UserManagementData;

/**
 * @author Burmau Garba"
 * @version $1
 * @title Data Oriented Programming By Yehonathan Sharvit
 */

public record LibraryData(
        CatalogData catalogData,
        UserManagementData userManagementData) {
}
