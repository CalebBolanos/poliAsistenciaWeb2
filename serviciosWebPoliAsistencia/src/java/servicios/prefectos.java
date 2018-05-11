/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import conexion.cDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author alexi
 */
@WebService(serviceName = "prefectos")
public class prefectos {
    @WebMethod(operationName = "horarioAlumnoPrefectos")
    public String[][] horarioAlumno(@WebParam(name = "idPer") String idPer){
        String[][] ret = new String[15][5];
        cDatos bd = new cDatos();
        try{
            bd.conectar();
            ResultSet rs = bd.consulta("call spHorarioAlumno('" + idPer + "');");
            int resta, dia, hora, hora2;
            String mate;
            while(rs.next()){
                dia = rs.getInt("idDia")-1;
                hora = rs.getInt("idHorarioI")-1;
                hora2 = rs.getInt("idHorarioF")-1;
                mate = rs.getString("materia");
                ret[hora][dia] = mate;
                resta = hora2-hora;
                if(resta>1){
                    for(int i = 1; i<resta; i++){
                        ret[hora2-i][dia] = mate;
                    }
                }
            }
            for(int i = 0; i<15; i++){
                for(int j = 0; j<5; j++){
                    if(ret[i][j]==null){
                        ret[i][j] = "";
                    }
                }
            }
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return ret;
    }
    
    @WebMethod(operationName = "horarioAndroidAlumnoPrefecto")
    public String horarioAndroidAlumnoPrefecto(@WebParam(name = "numero") String numero){
        String ret[][] = horarioAlumno(numero);
        JSONObject dia;
        JSONArray hora = new JSONArray();
        dia = new JSONObject();
        String Dias[]={"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
        for(int i = 0; i<ret.length; i++){
            for(int j = 0; j<ret[i].length; j++){
                dia.put(Dias[j], ret[i][j]);
            }
            hora.add(dia);
            dia = new JSONObject();
        }
        return hora.toString();
    }
    
    @WebMethod(operationName = "listaDeAlumnosAndroid")
    public String listaDeAlumnosAndroid(@WebParam(name = "numeroPrefecto") String numeroPrefecto){
        cDatos cd = new cDatos();
        JSONObject datosJ;
        JSONArray listaJ = new JSONArray();
        try {
            cd.conectar();
            ResultSet rs = cd.consulta("select boleta, concat(paterno, ' ', materno, ' ', nombre) as Nombre, grupo from vwalumnoscongrupo;");
            while(rs.next()){
                datosJ = new JSONObject();
                datosJ.put("Nombre", rs.getString("Nombre"));
                datosJ.put("boleta", rs.getString("boleta"));
                datosJ.put("grupo", rs.getString("grupo"));
                listaJ.add(datosJ);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(prefectos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaJ.toString();
    }
    
}
