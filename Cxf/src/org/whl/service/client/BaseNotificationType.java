
package org.whl.service.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The base type for a Notification types.
 * 
 * <p>BaseNotificationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BaseNotificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseNotificationType")
@XmlSeeAlso({
    ES4HandleSMSRChangeNotification.class,
    ES4HandleProfileDeletedNotification.class,
    ES4HandleProfileEnabledNotification.class,
    ES4HandleProfileDisabledNotification.class
})
public class BaseNotificationType {


}
