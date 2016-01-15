
package org.whl.service;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The base type for a Request types.
 * 
 * <p>BaseRequestType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BaseRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="functionCallIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="validityPeriod" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseRequestType", propOrder = {
    "functionCallIdentifier",
    "validityPeriod"
})
@XmlSeeAlso({
    ES4SMSRChangeRequest.class,
    ES4PrepareSMSRChangeRequest.class,
    ES4DeleteProfileRequest.class,
    ES4DisableProfileRequest.class,
    ES4EnableProfileRequest.class,
    ES4UpdateSubscriptionAddressRequest.class,
    ES4UpdatePolicyRulesRequest.class,
    ES4AuditEISRequest.class,
    ES4GetEISRequest.class
})
public class BaseRequestType {

    @XmlElement(required = true)
    protected String functionCallIdentifier;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger validityPeriod;

    /**
     * 获取functionCallIdentifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionCallIdentifier() {
        return functionCallIdentifier;
    }

    /**
     * 设置functionCallIdentifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionCallIdentifier(String value) {
        this.functionCallIdentifier = value;
    }

    /**
     * 获取validityPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * 设置validityPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValidityPeriod(BigInteger value) {
        this.validityPeriod = value;
    }

}
