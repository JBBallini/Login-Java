
package com.balliniprojects.proyectologin.logica;

import com.balliniprojects.proyectologin.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 * @author porokiin
 */

public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis;
    
    public ControladoraLogica(){
        controlPersis = new ControladoraPersistencia();
    }

    public String validarUsuario(String usuario, String password) {
        
       //Compruebo entre todos los usuarios de la BD, el usuario y la contraseña traidos de la IGU
        List<User> listaUsuario = controlPersis.traerUsuarios();
        
        for (User usu : listaUsuario){
            if(usu.getUsuario().equals(usuario)){
                if(usu.getPassword().equals(password)){
                    return "Acceso Permitido";
                } else{
                    return  "Contraseña Incorrecta";
                }
            }
        }
        return "Usuario Incorrecto";
    }
}
