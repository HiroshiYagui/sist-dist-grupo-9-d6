//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.06.16 a las 11:26:30 PM COT 
//


package com.howtodoinjava.xml.school;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Estudiante" type="{http://www.howtodoinjava.com/xml/school}Estudiante"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "estudiante"
})
@XmlRootElement(name = "EstudianteDetailsResponse")
public class EstudianteDetailsResponse {

    @XmlElement(name = "Estudiante", required = true)
    protected Estudiante estudiante;

    /**
     * Obtiene el valor de la propiedad estudiante.
     * 
     * @return
     *     possible object is
     *     {@link Estudiante }
     *     
     */
    public Estudiante getEstudiante() {
        return estudiante;
    }

    /**
     * Define el valor de la propiedad estudiante.
     * 
     * @param value
     *     allowed object is
     *     {@link Estudiante }
     *     
     */
    public void setEstudiante(Estudiante value) {
        this.estudiante = value;
    }

}
