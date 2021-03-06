//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.06 at 11:01:57 AM EST 
//


package com.xeroobjects.xero;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RowType" type="{}ReportRowType"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Header" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rows" type="{}ReportRows" minOccurs="0"/>
 *         &lt;element name="Cells" type="{}ReportCells" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportRow", propOrder = {
    "rowType",
    "title",
    "header",
    "rows",
    "cells"
})
public class ReportRow {

    @XmlElement(name = "RowType", required = true)
    protected ReportRowType rowType;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Header")
    protected String header;
    @XmlElement(name = "Rows")
    protected ReportRows rows;
    @XmlElement(name = "Cells")
    protected ReportCells cells;

    /**
     * Gets the value of the rowType property.
     * 
     * @return
     *     possible object is
     *     {@link ReportRowType }
     *     
     */
    public ReportRowType getRowType() {
        return rowType;
    }

    /**
     * Sets the value of the rowType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportRowType }
     *     
     */
    public void setRowType(ReportRowType value) {
        this.rowType = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeader(String value) {
        this.header = value;
    }

    /**
     * Gets the value of the rows property.
     * 
     * @return
     *     possible object is
     *     {@link ReportRows }
     *     
     */
    public ReportRows getRows() {
        return rows;
    }

    /**
     * Sets the value of the rows property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportRows }
     *     
     */
    public void setRows(ReportRows value) {
        this.rows = value;
    }

    /**
     * Gets the value of the cells property.
     * 
     * @return
     *     possible object is
     *     {@link ReportCells }
     *     
     */
    public ReportCells getCells() {
        return cells;
    }

    /**
     * Sets the value of the cells property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportCells }
     *     
     */
    public void setCells(ReportCells value) {
        this.cells = value;
    }

}
