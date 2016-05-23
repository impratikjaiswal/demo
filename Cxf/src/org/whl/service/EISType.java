
package org.whl.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * eUICC Information Set. The content may be only partial information depending of the function where it is used. 
 * 
 * <p>EISType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EISType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eumSignedInfo"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="eid" type="{http://namespaces.gsma.org/esim-messaging/1}EIDType"/&gt;
 *                   &lt;element name="eumId" type="{http://namespaces.gsma.org/esim-messaging/1}ObjectIdentifierType"/&gt;
 *                   &lt;element name="productionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="platformType" type="{http://namespaces.gsma.org/esim-messaging/1}String100"/&gt;
 *                   &lt;element name="platformVersion" type="{http://namespaces.gsma.org/esim-messaging/1}ThreeDigitVersion"/&gt;
 *                   &lt;element name="isdpLoadFileAid" type="{http://namespaces.gsma.org/esim-messaging/1}AIDType"/&gt;
 *                   &lt;element name="isdpModuleAid" type="{http://namespaces.gsma.org/esim-messaging/1}AIDType"/&gt;
 *                   &lt;element name="ecasd" type="{http://namespaces.gsma.org/esim-messaging/1}SecurityDomainType"/&gt;
 *                   &lt;element name="euiccCapabilities"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="catTpSupport" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                             &lt;element name="catTpVersion" type="{http://namespaces.gsma.org/esim-messaging/1}ThreeDigitVersion" minOccurs="0"/&gt;
 *                             &lt;element name="httpSupport" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                             &lt;element name="httpVersion" type="{http://namespaces.gsma.org/esim-messaging/1}ThreeDigitVersion" minOccurs="0"/&gt;
 *                             &lt;element name="securePacketVersion" type="{http://namespaces.gsma.org/esim-messaging/1}ThreeDigitVersion"/&gt;
 *                             &lt;element name="remoteProvisioningVersion" type="{http://namespaces.gsma.org/esim-messaging/1}ThreeDigitVersion"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="eumSignature" type="{http://www.w3.org/2000/09/xmldsig#}SignatureType"/&gt;
 *         &lt;element name="remainingMemory" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="availableMemoryForProfiles" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="lastAuditDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="smsrId" type="{http://namespaces.gsma.org/esim-messaging/1}ObjectIdentifierType"/&gt;
 *         &lt;element name="profileInfo" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="iccid" type="{http://namespaces.gsma.org/esim-messaging/1}ICCIDType"/&gt;
 *                   &lt;element name="isdpAid" type="{http://namespaces.gsma.org/esim-messaging/1}AIDType"/&gt;
 *                   &lt;element name="mnoId" type="{http://namespaces.gsma.org/esim-messaging/1}ObjectIdentifierType"/&gt;
 *                   &lt;element name="fallbackAttribute" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="subscriptionAddress" type="{http://namespaces.gsma.org/esim-messaging/1}SubscriptionAddressType"/&gt;
 *                   &lt;element name="state" type="{http://namespaces.gsma.org/esim-messaging/1}ProfileStateType"/&gt;
 *                   &lt;element name="smdpId" type="{http://namespaces.gsma.org/esim-messaging/1}ObjectIdentifierType" minOccurs="0"/&gt;
 *                   &lt;element name="profileType" type="{http://namespaces.gsma.org/esim-messaging/1}String100" minOccurs="0"/&gt;
 *                   &lt;element name="allocatedMemory" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *                   &lt;element name="freeMemory" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *                   &lt;element name="pol2" type="{http://namespaces.gsma.org/esim-messaging/1}POL2Type"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="isdr" type="{http://namespaces.gsma.org/esim-messaging/1}SecurityDomainType"/&gt;
 *         &lt;element name="auditTrail" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="record" type="{http://namespaces.gsma.org/esim-messaging/1}AuditTrailRecordType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="additionalProperties" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="property" type="{http://namespaces.gsma.org/esim-messaging/1}PropertyType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EISType", propOrder = {
    "eumSignedInfo",
    "eumSignature",
    "remainingMemory",
    "availableMemoryForProfiles",
    "lastAuditDate",
    "smsrId",
    "profileInfo",
    "isdr",
    "auditTrail",
    "additionalProperties"
})
public class EISType {

    @XmlElement(required = true)
    protected EISType.EumSignedInfo eumSignedInfo;
    @XmlElement(required = true)
    protected SignatureType eumSignature;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger remainingMemory;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger availableMemoryForProfiles;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAuditDate;
    @XmlElement(required = true)
    protected String smsrId;
    @XmlElement(required = true)
    protected List<EISType.ProfileInfo> profileInfo;
    @XmlElement(required = true)
    protected SecurityDomainType isdr;
    protected EISType.AuditTrail auditTrail;
    protected EISType.AdditionalProperties additionalProperties;

    /**
     * 获取eumSignedInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EISType.EumSignedInfo }
     *     
     */
    public EISType.EumSignedInfo getEumSignedInfo() {
        return eumSignedInfo;
    }

    /**
     * 设置eumSignedInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EISType.EumSignedInfo }
     *     
     */
    public void setEumSignedInfo(EISType.EumSignedInfo value) {
        this.eumSignedInfo = value;
    }

    /**
     * 获取eumSignature属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getEumSignature() {
        return eumSignature;
    }

    /**
     * 设置eumSignature属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setEumSignature(SignatureType value) {
        this.eumSignature = value;
    }

    /**
     * 获取remainingMemory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRemainingMemory() {
        return remainingMemory;
    }

    /**
     * 设置remainingMemory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRemainingMemory(BigInteger value) {
        this.remainingMemory = value;
    }

    /**
     * 获取availableMemoryForProfiles属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvailableMemoryForProfiles() {
        return availableMemoryForProfiles;
    }

    /**
     * 设置availableMemoryForProfiles属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvailableMemoryForProfiles(BigInteger value) {
        this.availableMemoryForProfiles = value;
    }

    /**
     * 获取lastAuditDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastAuditDate() {
        return lastAuditDate;
    }

    /**
     * 设置lastAuditDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastAuditDate(XMLGregorianCalendar value) {
        this.lastAuditDate = value;
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
     * Gets the value of the profileInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EISType.ProfileInfo }
     * 
     * 
     */
    public List<EISType.ProfileInfo> getProfileInfo() {
        if (profileInfo == null) {
            profileInfo = new ArrayList<EISType.ProfileInfo>();
        }
        return this.profileInfo;
    }

    /**
     * 获取isdr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SecurityDomainType }
     *     
     */
    public SecurityDomainType getIsdr() {
        return isdr;
    }

    /**
     * 设置isdr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityDomainType }
     *     
     */
    public void setIsdr(SecurityDomainType value) {
        this.isdr = value;
    }

    /**
     * 获取auditTrail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EISType.AuditTrail }
     *     
     */
    public EISType.AuditTrail getAuditTrail() {
        return auditTrail;
    }

    /**
     * 设置auditTrail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EISType.AuditTrail }
     *     
     */
    public void setAuditTrail(EISType.AuditTrail value) {
        this.auditTrail = value;
    }

    /**
     * 获取additionalProperties属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EISType.AdditionalProperties }
     *     
     */
    public EISType.AdditionalProperties getAdditionalProperties() {
        return additionalProperties;
    }

    /**
     * 设置additionalProperties属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EISType.AdditionalProperties }
     *     
     */
    public void setAdditionalProperties(EISType.AdditionalProperties value) {
        this.additionalProperties = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="property" type="{http://namespaces.gsma.org/esim-messaging/1}PropertyType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "property"
    })
    public static class AdditionalProperties {

        @XmlElement(required = true)
        protected List<PropertyType> property;

        /**
         * Gets the value of the property property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the property property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PropertyType }
         * 
         * 
         */
        public List<PropertyType> getProperty() {
            if (property == null) {
                property = new ArrayList<PropertyType>();
            }
            return this.property;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="record" type="{http://namespaces.gsma.org/esim-messaging/1}AuditTrailRecordType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "record"
    })
    public static class AuditTrail {

        protected List<AuditTrailRecordType> record;

        /**
         * Gets the value of the record property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the record property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecord().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AuditTrailRecordType }
         * 
         * 
         */
        public List<AuditTrailRecordType> getRecord() {
            if (record == null) {
                record = new ArrayList<AuditTrailRecordType>();
            }
            return this.record;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="eid" type="{http://namespaces.gsma.org/esim-messaging/1}EIDType"/&gt;
     *         &lt;element name="eumId" type="{http://namespaces.gsma.org/esim-messaging/1}ObjectIdentifierType"/&gt;
     *         &lt;element name="productionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="platformType" type="{http://namespaces.gsma.org/esim-messaging/1}String100"/&gt;
     *         &lt;element name="platformVersion" type="{http://namespaces.gsma.org/esim-messaging/1}ThreeDigitVersion"/&gt;
     *         &lt;element name="isdpLoadFileAid" type="{http://namespaces.gsma.org/esim-messaging/1}AIDType"/&gt;
     *         &lt;element name="isdpModuleAid" type="{http://namespaces.gsma.org/esim-messaging/1}AIDType"/&gt;
     *         &lt;element name="ecasd" type="{http://namespaces.gsma.org/esim-messaging/1}SecurityDomainType"/&gt;
     *         &lt;element name="euiccCapabilities"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="catTpSupport" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="catTpVersion" type="{http://namespaces.gsma.org/esim-messaging/1}ThreeDigitVersion" minOccurs="0"/&gt;
     *                   &lt;element name="httpSupport" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="httpVersion" type="{http://namespaces.gsma.org/esim-messaging/1}ThreeDigitVersion" minOccurs="0"/&gt;
     *                   &lt;element name="securePacketVersion" type="{http://namespaces.gsma.org/esim-messaging/1}ThreeDigitVersion"/&gt;
     *                   &lt;element name="remoteProvisioningVersion" type="{http://namespaces.gsma.org/esim-messaging/1}ThreeDigitVersion"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "eid",
        "eumId",
        "productionDate",
        "platformType",
        "platformVersion",
        "isdpLoadFileAid",
        "isdpModuleAid",
        "ecasd",
        "euiccCapabilities"
    })
    public static class EumSignedInfo {

        @XmlElement(required = true, type = String.class)
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        @XmlSchemaType(name = "hexBinary")
        protected byte[] eid;
        @XmlElement(required = true)
        protected String eumId;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar productionDate;
        @XmlElement(required = true)
        protected String platformType;
        @XmlElement(required = true)
        protected String platformVersion;
        @XmlElement(required = true, type = String.class)
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        @XmlSchemaType(name = "hexBinary")
        protected byte[] isdpLoadFileAid;
        @XmlElement(required = true, type = String.class)
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        @XmlSchemaType(name = "hexBinary")
        protected byte[] isdpModuleAid;
        @XmlElement(required = true)
        protected SecurityDomainType ecasd;
        @XmlElement(required = true)
        protected EISType.EumSignedInfo.EuiccCapabilities euiccCapabilities;

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
         * 获取eumId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEumId() {
            return eumId;
        }

        /**
         * 设置eumId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEumId(String value) {
            this.eumId = value;
        }

        /**
         * 获取productionDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getProductionDate() {
            return productionDate;
        }

        /**
         * 设置productionDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setProductionDate(XMLGregorianCalendar value) {
            this.productionDate = value;
        }

        /**
         * 获取platformType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlatformType() {
            return platformType;
        }

        /**
         * 设置platformType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlatformType(String value) {
            this.platformType = value;
        }

        /**
         * 获取platformVersion属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlatformVersion() {
            return platformVersion;
        }

        /**
         * 设置platformVersion属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlatformVersion(String value) {
            this.platformVersion = value;
        }

        /**
         * 获取isdpLoadFileAid属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getIsdpLoadFileAid() {
            return isdpLoadFileAid;
        }

        /**
         * 设置isdpLoadFileAid属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsdpLoadFileAid(byte[] value) {
            this.isdpLoadFileAid = value;
        }

        /**
         * 获取isdpModuleAid属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getIsdpModuleAid() {
            return isdpModuleAid;
        }

        /**
         * 设置isdpModuleAid属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsdpModuleAid(byte[] value) {
            this.isdpModuleAid = value;
        }

        /**
         * 获取ecasd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SecurityDomainType }
         *     
         */
        public SecurityDomainType getEcasd() {
            return ecasd;
        }

        /**
         * 设置ecasd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SecurityDomainType }
         *     
         */
        public void setEcasd(SecurityDomainType value) {
            this.ecasd = value;
        }

        /**
         * 获取euiccCapabilities属性的值。
         * 
         * @return
         *     possible object is
         *     {@link EISType.EumSignedInfo.EuiccCapabilities }
         *     
         */
        public EISType.EumSignedInfo.EuiccCapabilities getEuiccCapabilities() {
            return euiccCapabilities;
        }

        /**
         * 设置euiccCapabilities属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link EISType.EumSignedInfo.EuiccCapabilities }
         *     
         */
        public void setEuiccCapabilities(EISType.EumSignedInfo.EuiccCapabilities value) {
            this.euiccCapabilities = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="catTpSupport" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="catTpVersion" type="{http://namespaces.gsma.org/esim-messaging/1}ThreeDigitVersion" minOccurs="0"/&gt;
         *         &lt;element name="httpSupport" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="httpVersion" type="{http://namespaces.gsma.org/esim-messaging/1}ThreeDigitVersion" minOccurs="0"/&gt;
         *         &lt;element name="securePacketVersion" type="{http://namespaces.gsma.org/esim-messaging/1}ThreeDigitVersion"/&gt;
         *         &lt;element name="remoteProvisioningVersion" type="{http://namespaces.gsma.org/esim-messaging/1}ThreeDigitVersion"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "catTpSupport",
            "catTpVersion",
            "httpSupport",
            "httpVersion",
            "securePacketVersion",
            "remoteProvisioningVersion"
        })
        public static class EuiccCapabilities {

            protected boolean catTpSupport;
            protected String catTpVersion;
            protected boolean httpSupport;
            protected String httpVersion;
            @XmlElement(required = true)
            protected String securePacketVersion;
            @XmlElement(required = true)
            protected String remoteProvisioningVersion;

            /**
             * 获取catTpSupport属性的值。
             * 
             */
            public boolean isCatTpSupport() {
                return catTpSupport;
            }

            /**
             * 设置catTpSupport属性的值。
             * 
             */
            public void setCatTpSupport(boolean value) {
                this.catTpSupport = value;
            }

            /**
             * 获取catTpVersion属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCatTpVersion() {
                return catTpVersion;
            }

            /**
             * 设置catTpVersion属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCatTpVersion(String value) {
                this.catTpVersion = value;
            }

            /**
             * 获取httpSupport属性的值。
             * 
             */
            public boolean isHttpSupport() {
                return httpSupport;
            }

            /**
             * 设置httpSupport属性的值。
             * 
             */
            public void setHttpSupport(boolean value) {
                this.httpSupport = value;
            }

            /**
             * 获取httpVersion属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHttpVersion() {
                return httpVersion;
            }

            /**
             * 设置httpVersion属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHttpVersion(String value) {
                this.httpVersion = value;
            }

            /**
             * 获取securePacketVersion属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSecurePacketVersion() {
                return securePacketVersion;
            }

            /**
             * 设置securePacketVersion属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSecurePacketVersion(String value) {
                this.securePacketVersion = value;
            }

            /**
             * 获取remoteProvisioningVersion属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRemoteProvisioningVersion() {
                return remoteProvisioningVersion;
            }

            /**
             * 设置remoteProvisioningVersion属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRemoteProvisioningVersion(String value) {
                this.remoteProvisioningVersion = value;
            }

        }

    }


    /**
     * Type for a Profile in the EIS as the representation a profile loaded on the eUICC
     * 
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="iccid" type="{http://namespaces.gsma.org/esim-messaging/1}ICCIDType"/&gt;
     *         &lt;element name="isdpAid" type="{http://namespaces.gsma.org/esim-messaging/1}AIDType"/&gt;
     *         &lt;element name="mnoId" type="{http://namespaces.gsma.org/esim-messaging/1}ObjectIdentifierType"/&gt;
     *         &lt;element name="fallbackAttribute" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="subscriptionAddress" type="{http://namespaces.gsma.org/esim-messaging/1}SubscriptionAddressType"/&gt;
     *         &lt;element name="state" type="{http://namespaces.gsma.org/esim-messaging/1}ProfileStateType"/&gt;
     *         &lt;element name="smdpId" type="{http://namespaces.gsma.org/esim-messaging/1}ObjectIdentifierType" minOccurs="0"/&gt;
     *         &lt;element name="profileType" type="{http://namespaces.gsma.org/esim-messaging/1}String100" minOccurs="0"/&gt;
     *         &lt;element name="allocatedMemory" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
     *         &lt;element name="freeMemory" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
     *         &lt;element name="pol2" type="{http://namespaces.gsma.org/esim-messaging/1}POL2Type"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "iccid",
        "isdpAid",
        "mnoId",
        "fallbackAttribute",
        "subscriptionAddress",
        "state",
        "smdpId",
        "profileType",
        "allocatedMemory",
        "freeMemory",
        "pol2"
    })
    public static class ProfileInfo {

        @XmlElement(required = true)
        protected String iccid;
        @XmlElement(required = true, type = String.class)
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        @XmlSchemaType(name = "hexBinary")
        protected byte[] isdpAid;
        @XmlElement(required = true)
        protected String mnoId;
        protected boolean fallbackAttribute;
        @XmlElement(required = true)
        protected SubscriptionAddressType subscriptionAddress;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected ProfileStateType state;
        protected String smdpId;
        protected String profileType;
        @XmlElement(required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger allocatedMemory;
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger freeMemory;
        @XmlElement(required = true)
        protected POL2Type pol2;

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
         * 获取mnoId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMnoId() {
            return mnoId;
        }

        /**
         * 设置mnoId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMnoId(String value) {
            this.mnoId = value;
        }

        /**
         * 获取fallbackAttribute属性的值。
         * 
         */
        public boolean isFallbackAttribute() {
            return fallbackAttribute;
        }

        /**
         * 设置fallbackAttribute属性的值。
         * 
         */
        public void setFallbackAttribute(boolean value) {
            this.fallbackAttribute = value;
        }

        /**
         * 获取subscriptionAddress属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SubscriptionAddressType }
         *     
         */
        public SubscriptionAddressType getSubscriptionAddress() {
            return subscriptionAddress;
        }

        /**
         * 设置subscriptionAddress属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SubscriptionAddressType }
         *     
         */
        public void setSubscriptionAddress(SubscriptionAddressType value) {
            this.subscriptionAddress = value;
        }

        /**
         * 获取state属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ProfileStateType }
         *     
         */
        public ProfileStateType getState() {
            return state;
        }

        /**
         * 设置state属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ProfileStateType }
         *     
         */
        public void setState(ProfileStateType value) {
            this.state = value;
        }

        /**
         * 获取smdpId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSmdpId() {
            return smdpId;
        }

        /**
         * 设置smdpId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSmdpId(String value) {
            this.smdpId = value;
        }

        /**
         * 获取profileType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfileType() {
            return profileType;
        }

        /**
         * 设置profileType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfileType(String value) {
            this.profileType = value;
        }

        /**
         * 获取allocatedMemory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAllocatedMemory() {
            return allocatedMemory;
        }

        /**
         * 设置allocatedMemory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAllocatedMemory(BigInteger value) {
            this.allocatedMemory = value;
        }

        /**
         * 获取freeMemory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getFreeMemory() {
            return freeMemory;
        }

        /**
         * 设置freeMemory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setFreeMemory(BigInteger value) {
            this.freeMemory = value;
        }

        /**
         * 获取pol2属性的值。
         * 
         * @return
         *     possible object is
         *     {@link POL2Type }
         *     
         */
        public POL2Type getPol2() {
            return pol2;
        }

        /**
         * 设置pol2属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link POL2Type }
         *     
         */
        public void setPol2(POL2Type value) {
            this.pol2 = value;
        }

    }

}
