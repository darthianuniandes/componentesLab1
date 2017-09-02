/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import anotaciones.RequestHTTPAceptados;

/**
 *
 * @author Melga
 */
@RequestHTTPAceptados(
    requests = {RequestHTTPAceptados.HTTPrequest.GET}
)
public interface Obtenible {
    
}
