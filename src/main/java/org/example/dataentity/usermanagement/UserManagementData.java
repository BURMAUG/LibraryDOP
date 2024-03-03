package org.example.dataentity.usermanagement;
/**
 * @author Burmau Garba"
 * @version $1
 * @title Data Oriented Programming By Yenothan Sharvit
 */
public record UserManagementData(
        java.util.List<LibrarianData> librarians,
        java.util.List<MemberData> members
) {
}
