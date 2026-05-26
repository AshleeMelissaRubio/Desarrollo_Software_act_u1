package co.edu.udec.trabajosgrado.domain.strategy;

import co.edu.udec.trabajosgrado.domain.enums.UserRole;

public class ProfesorUsuarioStrategy implements IUsuario {

    @Override
    public UserRole getUserType() {
        return UserRole.PROFESSOR;
    }
}
