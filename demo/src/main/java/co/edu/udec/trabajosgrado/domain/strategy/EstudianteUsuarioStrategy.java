package co.edu.udec.trabajosgrado.domain.strategy;

import co.edu.udec.trabajosgrado.domain.enums.UserRole;

public class EstudianteUsuarioStrategy implements IUsuario {

    @Override
    public UserRole getUserType() {
        return UserRole.ESTUDENT;
    }
}
