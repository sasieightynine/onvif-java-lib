//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.19 um 02:35:56 PM CET 
//

package org.onvif.ver10.media.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import org.onvif.ver10.schema.MediaUri;

/**
 * <p>
 * Java-Klasse f�r anonymous complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MediaUri" type="{http://www.onvif.org/ver10/schema}MediaUri"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "mediaUri" })
@XmlRootElement(name = "GetStreamUriResponse")
public class GetStreamUriResponse {

	@XmlElement(name = "MediaUri", required = true)
	protected MediaUri mediaUri;

	/**
	 * Ruft den Wert der mediaUri-Eigenschaft ab.
	 * 
	 * @return possible object is {@link MediaUri }
	 * 
	 */
	public MediaUri getMediaUri() {
		return mediaUri;
	}

	/**
	 * Legt den Wert der mediaUri-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link MediaUri }
	 * 
	 */
	public void setMediaUri(MediaUri value) {
		this.mediaUri = value;
	}

}
