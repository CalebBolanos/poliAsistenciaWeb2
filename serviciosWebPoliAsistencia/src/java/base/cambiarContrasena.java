/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.sql.ResultSet;

/**
 *
 * @author Caleb
 */
public class cambiarContrasena {

    public boolean _valido;
    public String _mensaje;

    public cambiarContrasena(int idTipo, String boleta, String antigua, String nueva) {
        conexion.cDatos base = new conexion.cDatos();
        try {
            base.conectar();
            ResultSet resultado = base.consulta("call spContrasenas(" + idTipo + ",'" + boleta + "','" + antigua + "','" + nueva + "');");
            if (resultado.next()) {
                if (resultado.getString("msj").equals("ok")) {
                    _mensaje = "Contraseña cambiada correctamente";
                    _valido = true;
                } else {
                    if (resultado.getString("msj").equals("psw incorrecto")) {
                        _mensaje = "Contraseña incorrecta, intentelo de nuevo";
                        _valido = false;
                    }
                    if (resultado.getString("msj").equals("Numero de trabajador invalido")) {
                        _mensaje = "Error en cambio de contraseña";
                        _valido = false;
                    }
                    if (resultado.getString("msj").equals("Numero de boleta invalido invalido")) {
                        _mensaje = "Error en cambio de contraseña";
                        _valido = false;
                    }
                }

            }
            base.cierraConexion();
        } catch (Exception error) {
            _mensaje = "Error extraño";
            _valido = false;
        }
    }


    public String obtenerMensaje() {
        return _mensaje;
    }

    public boolean valido() {
        return _valido;
    }
}
