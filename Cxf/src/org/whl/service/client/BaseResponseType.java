
package org.whl.service.client;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The base type for a Response types.
 * 
 * <p>BaseResponseType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BaseResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="processingStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="processingEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="acceptableValidityPeriod" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="functionExecutionStatus" type="{http://namespaces.gsma.org/esim-messaging/1}ExecutionStatusType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseResponseType", propOrder = {
    "processingStart",
    "processingEnd",
    "acceptableValidityPeriod",
    "functionExecutionStatus"
})
@XmlSeeAlso({
    ES4SMSRChangeResponse.class,
    ES4PrepareSMSRChangeResponse.class,
    ES4DeleteProfileResponse.class,
    ES4DisableProfileResponse.class,
    ES4EnableProfileResponse.class,
    ES4UpdateSubscriptionAddressResponse.class,
    ES4UpdatePolicyRulesResponse.class,
    ES4AuditEISResponse.class,
    ES4GetEISResponse.class
})
public class BaseResponseType {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar processingStart;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar processingEnd;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger acceptableValidityPeriod;
    @XmlElement(required = true)
    protected ExecutionStatusType functionExecutionStatus;

    /**
     * 获取processingStart属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProcessingStart() {
        return processingStart;
    }

    /**
     * 设置processingStart属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProcessingStart(XMLGregorianCalendar value) {
        this.processingStart = value;
    }

    /**
     * 获取processingEnd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProcessingEnd() {
        return processingEnd;
    }

    /**
     * 设置processingEnd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProcessingEnd(XMLGregorianCalendar value) {
        this.processingEnd = value;
    }

    /**
     * 获取acceptableValidityPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAcceptableValidityPeriod() {
        return acceptableValidityPeriod;
    }

    /**
     * 设置acceptableValidityPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAcceptableValidityPeriod(BigInteger value) {
        this.acceptableValidityPeriod = value;
    }

    /**
     * 获取functionExecutionStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExecutionStatusType }
     *     
     */
    public ExecutionStatusType getFunctionExecutionStatus() {
        return functionExecutionStatus;
    }

    /**
     * 设置functionExecutionStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutionStatusType }
     *     
     */
    public void setFunctionExecutionStatus(ExecutionStatusType value) {
        this.functionExecutionStatus = value;
    }

}
