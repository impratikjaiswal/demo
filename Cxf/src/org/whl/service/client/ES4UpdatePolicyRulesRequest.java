
package org.whl.service.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://namespaces.gsma.org/esim-messaging/1}BaseRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eid" type="{http://namespaces.gsma.org/esim-messaging/1}EIDType"/&gt;
 *         &lt;element name="iccid" type="{http://namespaces.gsma.org/esim-messaging/1}ICCIDType"/&gt;
 *         &lt;element name="pol2" type="{http://namespaces.gsma.org/esim-messaging/1}POL2Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "eid",
    "iccid",
    "pol2"
})
@XmlRootElement(name = "ES4-UpdatePolicyRulesRequest")
public class ES4UpdatePolicyRulesRequest
    extends BaseRequestType
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] eid;
    @XmlElement(required = true)
    protected String iccid;
    @XmlElement(required = true)
    protected POL2Type pol2;

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
