package mundo;
import anotaciones.Cargar;
import anotaciones.Driver;
import anotaciones.Log;
import java.util.ArrayList;
import anotaciones.*;
import java.lang.reflect.*;
import java.lang.annotation.Annotation;
public class ManejadorVendedoresProxy extends ManejadorVendedores{
public ManejadorVendedoresProxy(){
super();
}
public Vendedor nuevoVendedor()
{
{try{
Method meth = ManejadorVendedores.class.getMethod("nuevoVendedor",new Class[]{});
Annotation an = meth.getAnnotation(anotaciones.Log.class);
CodigoInserciones.Log(this,ManejadorVendedores.class,an,meth);
} catch (NoSuchMethodException ex) {
ex.printStackTrace();
} catch (SecurityException ex) {
ex.printStackTrace();
}catch (Exception ex) {
ex.printStackTrace();
}}
return super.nuevoVendedor();
}
public void eliminarVendedor(int arg0)
{
{try{
Method meth = ManejadorVendedores.class.getMethod("eliminarVendedor",new Class[]{Integer.TYPE});
Annotation an = meth.getAnnotation(anotaciones.Log.class);
CodigoInserciones.Log(this,ManejadorVendedores.class,an,meth);
} catch (NoSuchMethodException ex) {
ex.printStackTrace();
} catch (SecurityException ex) {
ex.printStackTrace();
}catch (Exception ex) {
ex.printStackTrace();
}}
super.eliminarVendedor(arg0);
}
public Vendedor findVendedor(int arg0)
{
{try{
Method meth = ManejadorVendedores.class.getMethod("findVendedor",new Class[]{Integer.TYPE});
Annotation an = meth.getAnnotation(anotaciones.Log.class);
CodigoInserciones.Log(this,ManejadorVendedores.class,an,meth);
} catch (NoSuchMethodException ex) {
ex.printStackTrace();
} catch (SecurityException ex) {
ex.printStackTrace();
}catch (Exception ex) {
ex.printStackTrace();
}}
return super.findVendedor(arg0);
}
}
