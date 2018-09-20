/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Estudiante;

/**
 *
 * @author dacastro
 */
public class ControllerEstudiante {

    

    public ControllerEstudiante() {
    }
    
    public static boolean insertEstudiante(LinkedList<Estudiante> le) {
       boolean ins = false;
       for (int i = 0; i < le.size(); i++) {
           System.out.println("xxxx "+le.get(i).toString());
           String sql = "INSERT INTO estudiantes (identificacione,codigoe,nombre1e,apellido1e,direccione,correoe,jornada) VALUES "
                   + "('" + le.get(i).getIdentificacione() + "', '" + le.get(i).getCodigoe() + "', '" + le.get(i).getNombre1e() + "', '"
                   + le.get(i).getApellido1e() + "', '" + le.get(i).getDireccione() + "', '" + le.get(i).getCorreoe() + "', '" + le.get(i).getJornada() + "');";
           Estudiante obje = new Estudiante();
           ins = obje.insertEstudiante(sql);

       }
       return ins;

   }
    
    public static boolean insertEstudianteFoto(LinkedList<Estudiante> le) {
        String sql="";
        //BaseDatos objBases=new BaseDatos();
       // boolean conexion=false;
        //boolean insertar=false;
        
        for (int i = 0; i < le.size(); i++) {
            sql="";
            sql="INSERT INTO estudiantes (identificacione,"
                    + "codigoe,nombre1e,apellido1e,direccione,"
                    + "correoe,jornada,Fotoestudiante)+"
                    + " VALUES(?,?,?,?,?,?,?,?)";
            
        }
        
        
        
        for (Estudiante arrEst1 : arrEst) {
            conexion=objBases.crearConexion();
            if (conexion) {
                insertar = objBases.sqlInsertWithImageEstudiante(arrEst1.getRutaImagenestudiante(), sql, 
                        arrEst1.getIdestudiantes(), arrEst1.getCodigoestudiante(), arrEst1.getNombreestudiante(), 
                        arrEst1.getApellidoestudiante(), arrEst1.getTelefonoestudiante(), arrEst1.getDireccionestudiante(), 
                        arrEst1.getCorreoestudiante());
            }
        }
        return insertar;
    }
}
