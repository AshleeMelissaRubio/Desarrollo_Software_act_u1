package co.edu.udec.trabajosgrado.domain.enums;

import co.edu.udec.trabajosgrado.domain.exceptions.user.InvalidUserRoleException;

public enum UserRole {
    ADMIN,
    ESTUDENT,
    PROFESSOR;

    public static UserRole fromString(final String value) {
        for (final UserRole role : values()) {
            if (role.name().equalsIgnoreCase(value)) {
                return role;
            }
        }
        throw InvalidUserRoleException.becauseValueIsInvalid(value);
    }
}
