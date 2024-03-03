package org.example.dataentity.usermanagement;

import org.example.dataentity.catalog.BookLending;

public record MemberData(
        String memberId,
        String email,
        String password,
        java.util.List<BookLending> bookLendings
) {
}
