/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import anotaciones.RequestHTTPAceptados;
import anotaciones.RequestHTTPAceptados.HTTPrequest;

/**
 *
 * @author Melga
 */
@RequestHTTPAceptados(
        requests = {HTTPrequest.PUT}
)
public interface Actualizable {
    
}
