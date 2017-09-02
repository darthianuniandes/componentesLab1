package mundo;
import anotaciones.Cargar;
import anotaciones.Driver;
import anotaciones.Log;
import java.util.ArrayList;
import anotaciones.*;
import java.lang.reflect.*;
import java.lang.annotation.Annotation;
public class ManejadorMueblesProxy extends ManejadorMuebles{
public ManejadorMueblesProxy(){
super();
}
public Mueble nuevoMueble()
{
{try{
Method meth = ManejadorMuebles.class.getMethod("nuevoMueble",new Class[]{});
Annotation an = meth.getAnnotation(anotaciones.Log.class);
CodigoInserciones.Log(this,ManejadorMuebles.class,an,meth);
} catch (NoSuchMethodException ex) {
ex.printStackTrace();
} catch (SecurityException ex) {
ex.printStackTrace();
}catch (Exception ex) {
ex.printStackTrace();
}}
return super.nuevoMueble();
}
public Mueble findMueble(int arg0)
{
{try{
Method meth = ManejadorMuebles.class.getMethod("findMueble",new Class[]{Integer.TYPE});
Annotation an = meth.getAnnotation(anotaciones.Log.class);
CodigoInserciones.Log(this,ManejadorMuebles.class,an,meth);
} catch (NoSuchMethodException ex) {
ex.printStackTrace();
} catch (SecurityException ex) {
ex.printStackTrace();
}catch (Exception ex) {
ex.printStackTrace();
}}
return super.findMueble(arg0);
}
public void eliminarMueble(int arg0)
{
{try{
Method meth = ManejadorMuebles.class.getMethod("eliminarMueble",new Class[]{Integer.TYPE});
Annotation an = meth.getAnnotation(anotaciones.Log.class);
CodigoInserciones.Log(this,ManejadorMuebles.class,an,meth);
} catch (NoSuchMethodException ex) {
ex.printStackTrace();
} catch (SecurityException ex) {
ex.printStackTrace();
}catch (Exception ex) {
ex.printStackTrace();
}}
super.eliminarMueble(arg0);
}
}
