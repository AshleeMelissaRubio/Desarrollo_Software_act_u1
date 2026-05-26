package co.edu.udec.trabajosgrado.domain.model;

import co.edu.udec.trabajosgrado.domain.enums.UserRole;
import co.edu.udec.trabajosgrado.domain.enums.UserStatus;
import lombok.Data;

@Data
public abstract class User {
    private String id;
    private String dni;
    private String nombreCompleto;
    private UserRole role;
    private UserStatus status;

    public static void create(
            final String id,
            final String dni,
            final String nombreCompleto,
            final UserRole role,
            final UserStatus status) {

        return;
    }

    public void activate() {
        return;
    }

    public void deactivate() {
        return;
    }
}
