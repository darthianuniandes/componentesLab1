package mundo;
import anotaciones.Init;
import anotaciones.PostConstructor;
import interfaces.Actualizable;
import interfaces.Obtenible;
import anotaciones.*;
import java.lang.reflect.*;
import java.lang.annotation.Annotation;
public class MuebleProxy extends Mueble{
public MuebleProxy(){
super();
}
public void reiniciar()
{
{try{
Method meth = Mueble.class.getMethod("reiniciar",new Class[]{});
Annotation an = meth.getAnnotation(anotaciones.Init.class);
CodigoInserciones.Init(this,Mueble.class,an,meth);
} catch (NoSuchMethodException ex) {
ex.printStackTrace();
} catch (SecurityException ex) {
ex.printStackTrace();
}catch (Exception ex) {
ex.printStackTrace();
}}
super.reiniciar();
}
}
