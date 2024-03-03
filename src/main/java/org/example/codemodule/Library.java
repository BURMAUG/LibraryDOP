package org.example.codemodule;

import org.example.codemodule.catalog.Catalog;
import org.example.codemodule.usermanagement.UserManagement;
import org.example.dataentity.LibraryData;

public class Library {
    public static void searchBook(LibraryData libraryData){}
    public static void addBookItem(LibraryData libraryData){}
    public static boolean isBlocked(LibraryData libraryData){
        return false;
    }
    public static boolean isMember(LibraryData libraryData){
        return false;
    }
    public static Catalog getBookLendings(LibraryData libraryData, String userId, String memberId){
        if (UserManagement.isLibrarian(libraryData.userManagementData(), userId)) {
            return Catalog.getBookLendings(libraryData.catalogData(), memberId);
        }
        return null;
    }
    public static void checkBook(LibraryData libraryData){}
    public static void returnBook(LibraryData libraryData){}
}
