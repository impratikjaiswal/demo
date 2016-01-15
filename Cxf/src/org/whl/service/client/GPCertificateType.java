
package org.whl.service.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>GPCertificateType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GPCertificateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="index" type="{http://namespaces.gsma.org/esim-messaging/1}KeyIndexType"/&gt;
 *         &lt;element name="caId" type="{http://namespaces.gsma.org/esim-messaging/1}ObjectIdentifierType"/&gt;
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GPCertificateType", propOrder = {
    "index",
    "caId",
    "value"
})
public class GPCertificateType {

    @XmlSchemaType(name = "integer")
    protected int index;
    @XmlElement(required = true)
    protected String caId;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] value;

    /**
     * 获取index属性的值。
     * 
     */
    public int getIndex() {
        return index;
    }

    /**
     * 设置index属性的值。
     * 
     */
    public void setIndex(int value) {
        this.index = value;
    }

    /**
     * 获取caId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaId() {
        return caId;
    }

    /**
     * 设置caId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaId(String value) {
        this.caId = value;
    }

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(byte[] value) {
        this.value = value;
    }

}
