package org.example.dataentity;

import org.example.dataentity.catalog.CatalogData;
import org.example.dataentity.usermanagement.UserManagementData;

/**
 * @author Burmau Garba"
 * @version $1
 * @title Data Oriented Programming By Yenothan Sharvit
 */

public record LibraryData(CatalogData catalogData, UserManagementData userManagementData) {
}
