//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.02.04 um 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyAttribute;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import org.w3c.dom.Element;

/**
 * <p>
 * Java-Klasse f�r EngineConfiguration complex type.
 * 
 * <p>
 * Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * <complexType name="EngineConfiguration">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VideoAnalyticsConfiguration" type="{http://www.onvif.org/ver10/schema}VideoAnalyticsConfiguration"/>
 *         <element name="AnalyticsEngineInputInfo" type="{http://www.onvif.org/ver10/schema}AnalyticsEngineInputInfo"/>
 *         <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <anyAttribute processContents='lax'/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EngineConfiguration", propOrder = { "videoAnalyticsConfiguration", "analyticsEngineInputInfo", "any" })
public class EngineConfiguration {

	@XmlElement(name = "VideoAnalyticsConfiguration", required = true)
	protected VideoAnalyticsConfiguration videoAnalyticsConfiguration;
	@XmlElement(name = "AnalyticsEngineInputInfo", required = true)
	protected AnalyticsEngineInputInfo analyticsEngineInputInfo;
	@XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der videoAnalyticsConfiguration-Eigenschaft ab.
	 * 
	 * @return possible object is {@link VideoAnalyticsConfiguration }
	 * 
	 */
	public VideoAnalyticsConfiguration getVideoAnalyticsConfiguration() {
		return videoAnalyticsConfiguration;
	}

	/**
	 * Legt den Wert der videoAnalyticsConfiguration-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link VideoAnalyticsConfiguration }
	 * 
	 */
	public void setVideoAnalyticsConfiguration(VideoAnalyticsConfiguration value) {
		this.videoAnalyticsConfiguration = value;
	}

	/**
	 * Ruft den Wert der analyticsEngineInputInfo-Eigenschaft ab.
	 * 
	 * @return possible object is {@link AnalyticsEngineInputInfo }
	 * 
	 */
	public AnalyticsEngineInputInfo getAnalyticsEngineInputInfo() {
		return analyticsEngineInputInfo;
	}

	/**
	 * Legt den Wert der analyticsEngineInputInfo-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link AnalyticsEngineInputInfo }
	 * 
	 */
	public void setAnalyticsEngineInputInfo(AnalyticsEngineInputInfo value) {
		this.analyticsEngineInputInfo = value;
	}

	/**
	 * Gets the value of the any property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the any property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAny().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Element } {@link java.lang.Object }
	 * 
	 * 
	 */
	public List<java.lang.Object> getAny() {
		if (any == null) {
			any = new ArrayList<java.lang.Object>();
		}
		return this.any;
	}

	/**
	 * Gets a map that contains attributes that aren't bound to any typed property on this class.
	 * 
	 * <p>
	 * the map is keyed by the name of the attribute and the value is the string value of the attribute.
	 * 
	 * the map returned by this method is live, and you can add new attribute by updating the map directly. Because of this design, there's no setter.
	 * 
	 * 
	 * @return always non-null
	 */
	public Map<QName, String> getOtherAttributes() {
		return otherAttributes;
	}

}
