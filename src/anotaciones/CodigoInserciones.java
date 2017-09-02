/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: CodigoInserciones.java,v 1.1 Exp $
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 2.1
 *
 * Ejercicio: Taller 1 - anotaciones
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package anotaciones;


import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;
import anotaciones.RequestHTTPAceptados.HTTPrequest;


/**
 * Clase encargada de contener el código de las inserciones
 * El nombre de cada método debe corresponder con el de la clase que representa
 */
public class CodigoInserciones
{

    /**
     * Método invocado en la insercion de código hecha a los métodos anotados con @Init
     * @param instance Instancia desde que se invoca este método
     * @param claseRepresentada Clase a la que representa el proxý que hizo la invocación del método
     * @param annotacion Informacion de la anotación hecha sobre el método que invoca a este
     * @param method Método que fua anotado con @Init
     */
    public static void Init(Object instance, Class claseRepresentada, Annotation annotacion, Method method) throws Exception {
        Init c = (Init) annotacion;
        for (Field f : claseRepresentada.getDeclaredFields()) {
            try {
                f.setAccessible(true);
                if (f.getType().equals(Integer.TYPE))
                {
                    f.set(instance, c.Integer());
                } else if (f.getType().equals(Double.TYPE))
                {
                    f.set(instance, c.Double());
                } else if (f.getType().equals(Character.TYPE))
                {
                    f.set(instance, c.Char());
                } else if (f.getType().equals(String.class))
                {
                    f.set(instance, c.String());
                } else if (f.getType().equals(Boolean.TYPE))
                {
                    f.set(instance, c.Boolean());
                } else if (f.getType().equals(Float.TYPE))
                {
                    f.set(instance, c.Float());
                } else if (f.getType().equals(Long.TYPE))
                {
                    f.set(instance, c.Long());
                }

            } 
            catch (Exception e)
            {
                throw new Exception(e.getMessage());
            }
        }
    }

    
    public static void Log(Object instance, Class claseRepresentada, Annotation annotacion, Method method) throws Exception {
        Date hoy = new Date();
        Calendar calHoy = Calendar.getInstance();
        calHoy.setTime(hoy);
        
        File source = new File("./src/" + "Log.txt");
        PrintWriter pw=null;
        pw = new PrintWriter(new FileWriter(source, true));
        pw.println("Fecha y hora de ejecucion: " + calHoy.getTime());
        pw.println("Clase invocada: " + claseRepresentada.getName());
        pw.println("Metodo utilizado: " + method.getName());
        pw.close();
    }
    
    public static boolean RequestHTTPAceptados(Class claseRepresentada, HTTPrequest requestOrigen) throws Exception {
        boolean valido = false;
        for (int i = 0; i < claseRepresentada.getInterfaces().length; i++) {
            RequestHTTPAceptados anotacion = (RequestHTTPAceptados) claseRepresentada.getInterfaces()[i].getAnnotation(RequestHTTPAceptados.class);
            for (int j = 0; j < anotacion.requests().length; j++) {
                if(requestOrigen == anotacion.requests()[j]){
                    valido = true;
                    break;
                }
            }
        }
            
        if(valido == false){
            System.out.println("Este tipo de request no esta soportado por la clase");
        }
        return valido;
    }
}
