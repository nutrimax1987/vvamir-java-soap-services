
package com.amnetgov.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.0.5
 * Tue Apr 12 18:21:06 IDT 2016
 * Generated source version: 3.0.5
 */

@XmlRootElement(name = "SeleccionarProcesoDatosBasicosResponse", namespace = "http://amnetgov.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeleccionarProcesoDatosBasicosResponse", namespace = "http://amnetgov.com/")

public class SeleccionarProcesoDatosBasicosResponse {

    @XmlElement(name = "SeleccionarProcesoDatosBasicosResult", namespace = "http://amnetgov.com/")
    private com.amnetgov.entities.PersonalBasicInfo SeleccionarProcesoDatosBasicosResult;

    public com.amnetgov.entities.PersonalBasicInfo getSeleccionarProcesoDatosBasicosResult() {
        return this.SeleccionarProcesoDatosBasicosResult;
    }

    public void setSeleccionarProcesoDatosBasicosResult(com.amnetgov.entities.PersonalBasicInfo newSeleccionarProcesoDatosBasicosResult)  {
        this.SeleccionarProcesoDatosBasicosResult = newSeleccionarProcesoDatosBasicosResult;
    }

}

