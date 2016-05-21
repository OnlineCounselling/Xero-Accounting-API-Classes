package com.xeroobjects.xero;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTerms", propOrder = {})
public class PaymentTerms {

	@XmlElement(name = "Bills")
    protected BillsPaymentTerms bills;
    
	@XmlElement(name = "Sales")
    protected SalesPaymentTerms sales;

    public BillsPaymentTerms getBills() {
		return bills;
	}

	public SalesPaymentTerms getSales() {
		return sales;
	}
	
}
