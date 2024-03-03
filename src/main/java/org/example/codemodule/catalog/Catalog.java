package org.example.codemodule.catalog;

import org.example.dataentity.catalog.CatalogData;
import org.example.dataentity.usermanagement.UserManagementData;

/**
 * @author Burmau Garba"
 * @version $1
 * @title Data Oriented Programming By Yenothan Sharvit
 */
public class Catalog {
    public static void searchBook(CatalogData catalogData, UserManagementData memberId) {}
    public static void addBook(CatalogData catalogData){}
    public static void checkoutBook(CatalogData catalogData){}
    public static void returnBook(CatalogData catalogData){}
    public static Catalog getBookLendings(CatalogData catalogData, String memberId){
        return null;
    }
}
