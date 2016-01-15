
package org.whl.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This type contains the description of a platform or profile management operations performed by SM-SR or a notification received by SM-SR from the given eUICC.
 * 
 * <p>AuditTrailRecordType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AuditTrailRecordType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eid" type="{http://namespaces.gsma.org/esim-messaging/1}EIDType"/&gt;
 *         &lt;element name="smsrId" type="{http://namespaces.gsma.org/esim-messaging/1}ObjectIdentifierType"/&gt;
 *         &lt;element name="operationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="operationType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}hexBinary"&gt;
 *               &lt;length value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="requesterId" type="{http://namespaces.gsma.org/esim-messaging/1}ObjectIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="operationExecutionStatus" type="{http://namespaces.gsma.org/esim-messaging/1}ExecutionStatusType" minOccurs="0"/&gt;
 *         &lt;element name="isdpAid" type="{http://namespaces.gsma.org/esim-messaging/1}AIDType" minOccurs="0"/&gt;
 *         &lt;element name="iccid" type="{http://namespaces.gsma.org/esim-messaging/1}ICCIDType" minOccurs="0"/&gt;
 *         &lt;element name="imei" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/&gt;
 *         &lt;element name="meId" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditTrailRecordType", propOrder = {
    "eid",
    "smsrId",
    "operationDate",
    "operationType",
    "requesterId",
    "operationExecutionStatus",
    "isdpAid",
    "iccid",
    "imei",
    "meId"
})
public class AuditTrailRecordType {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] eid;
    @XmlElement(required = true)
    protected String smsrId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar operationDate;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] operationType;
    protected String requesterId;
    protected ExecutionStatusType operationExecutionStatus;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] isdpAid;
    protected String iccid;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] imei;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] meId;

    /**
     * 获取eid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getEid() {
        return eid;
    }

    /**
     * 设置eid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEid(byte[] value) {
        this.eid = value;
    }

    /**
     * 获取smsrId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsrId() {
        return smsrId;
    }

    /**
     * 设置smsrId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsrId(String value) {
        this.smsrId = value;
    }

    /**
     * 获取operationDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOperationDate() {
        return operationDate;
    }

    /**
     * 设置operationDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOperationDate(XMLGregorianCalendar value) {
        this.operationDate = value;
    }

    /**
     * 获取operationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getOperationType() {
        return operationType;
    }

    /**
     * 设置operationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationType(byte[] value) {
        this.operationType = value;
    }

    /**
     * 获取requesterId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesterId() {
        return requesterId;
    }

    /**
     * 设置requesterId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterId(String value) {
        this.requesterId = value;
    }

    /**
     * 获取operationExecutionStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExecutionStatusType }
     *     
     */
    public ExecutionStatusType getOperationExecutionStatus() {
        return operationExecutionStatus;
    }

    /**
     * 设置operationExecutionStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutionStatusType }
     *     
     */
    public void setOperationExecutionStatus(ExecutionStatusType value) {
        this.operationExecutionStatus = value;
    }

    /**
     * 获取isdpAid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getIsdpAid() {
        return isdpAid;
    }

    /**
     * 设置isdpAid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsdpAid(byte[] value) {
        this.isdpAid = value;
    }

    /**
     * 获取iccid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIccid() {
        return iccid;
    }

    /**
     * 设置iccid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIccid(String value) {
        this.iccid = value;
    }

    /**
     * 获取imei属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getImei() {
        return imei;
    }

    /**
     * 设置imei属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImei(byte[] value) {
        this.imei = value;
    }

    /**
     * 获取meId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getMeId() {
        return meId;
    }

    /**
     * 设置meId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeId(byte[] value) {
        this.meId = value;
    }

}
