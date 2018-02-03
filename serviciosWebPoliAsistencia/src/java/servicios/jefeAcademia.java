/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Caleb
 */
@WebService(serviceName = "jefeAcademia")
public class jefeAcademia {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "asistenciaInd")
    public ArrayList asistenciaInd(@WebParam(name = "idPer") String idPer, @WebParam(name = "mes") String mes) {
        ArrayList<Object> datos = new ArrayList<>();
        consultaJefe.asistenciaIndividual persona = new consultaJefe.asistenciaIndividual(idPer, mes);
        datos.add(persona.obtenerInformacion());
        datos.add(persona.obtenerTotalDias());
        datos.add(persona.obtenerDiasAsistidos());
        datos.add(persona.obtenerDiasFaltados());
        datos.add(persona.obtenerMes());
        return datos;
    }
}
