
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

@XmlRootElement(name = "SeleccionarResultadoCertificadorResponse", namespace = "http://amnetgov.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeleccionarResultadoCertificadorResponse", namespace = "http://amnetgov.com/")

public class SeleccionarResultadoCertificadorResponse {

    @XmlElement(name = "SeleccionarResultadoCertificadorResult", namespace = "http://amnetgov.com/")
    private com.amnetgov.SeleccionarResultadoCertificadorResultado SeleccionarResultadoCertificadorResult;

    public com.amnetgov.SeleccionarResultadoCertificadorResultado getSeleccionarResultadoCertificadorResult() {
        return this.SeleccionarResultadoCertificadorResult;
    }

    public void setSeleccionarResultadoCertificadorResult(com.amnetgov.SeleccionarResultadoCertificadorResultado newSeleccionarResultadoCertificadorResult)  {
        this.SeleccionarResultadoCertificadorResult = newSeleccionarResultadoCertificadorResult;
    }

}

