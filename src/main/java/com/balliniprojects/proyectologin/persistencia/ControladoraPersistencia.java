
package com.balliniprojects.proyectologin.persistencia;

import com.balliniprojects.proyectologin.logica.User;
import java.util.List;

/**
 * @author Ballini Juan Bautista
 */

public class ControladoraPersistencia {
    
    UserJpaController userJPA = new UserJpaController();

    public List<User> traerUsuarios() {
        return userJPA.findUserEntities();
    }    
}
