
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

@XmlRootElement(name = "SeleccionarImagenesProceso", namespace = "http://amnetgov.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeleccionarImagenesProceso", namespace = "http://amnetgov.com/", propOrder = {"UsuarioServicio", "ContrasenaServicio", "IdProceso"})

public class SeleccionarImagenesProceso {

    @XmlElement(name = "UsuarioServicio", namespace = "http://amnetgov.com/")
    private java.lang.String UsuarioServicio;
    @XmlElement(name = "ContrasenaServicio", namespace = "http://amnetgov.com/")
    private java.lang.String ContrasenaServicio;
    @XmlElement(name = "IdProceso", namespace = "http://amnetgov.com/")
    private long IdProceso;

    public java.lang.String getUsuarioServicio() {
        return this.UsuarioServicio;
    }

    public void setUsuarioServicio(java.lang.String newUsuarioServicio)  {
        this.UsuarioServicio = newUsuarioServicio;
    }

    public java.lang.String getContrasenaServicio() {
        return this.ContrasenaServicio;
    }

    public void setContrasenaServicio(java.lang.String newContrasenaServicio)  {
        this.ContrasenaServicio = newContrasenaServicio;
    }

    public long getIdProceso() {
        return this.IdProceso;
    }

    public void setIdProceso(long newIdProceso)  {
        this.IdProceso = newIdProceso;
    }

}

