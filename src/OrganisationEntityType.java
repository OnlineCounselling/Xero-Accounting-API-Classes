//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.10 at 01:28:15 PM EST 
//


package com.xeroobjects.xero;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for organisationEntityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="organisationEntityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CHARITY"/>
 *     &lt;enumeration value="CLUBSOCIETY"/>
 *     &lt;enumeration value="COMPANY"/>
 *     &lt;enumeration value="LTCOMPANY"/>
 *     &lt;enumeration value="NOTFORPROFIT"/>
 *     &lt;enumeration value="PARTNERSHIP"/>
 *     &lt;enumeration value="PERSON"/>
 *     &lt;enumeration value="SCORPORATION"/>
 *     &lt;enumeration value="SMSUPERFUND"/>
 *     &lt;enumeration value="SOLETRADER"/>
 *     &lt;enumeration value="SUPERFUND"/>
 *     &lt;enumeration value="TRUST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "organisationEntityType")
@XmlEnum
public enum OrganisationEntityType {

    CHARITY,
    CLUBSOCIETY,
    COMPANY,
    LTCOMPANY,
    NOTFORPROFIT,
    PARTNERSHIP,
    PERSON,
    SCORPORATION,
    SMSUPERFUND,
    SOLETRADER,
    SUPERFUND,
    TRUST;

    public String value() {
        return name();
    }

    public static OrganisationEntityType fromValue(String v) {
        return valueOf(v);
    }

}