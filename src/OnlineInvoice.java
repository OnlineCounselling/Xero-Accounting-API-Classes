package com.xeroobjects.xero;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnlineInvoice", propOrder = {

})
public class OnlineInvoice {
	
	@XmlElement(name = "OnlineInvoiceUrl")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String onlineInvoiceUrl;

	public String getOnlineInvoiceUrl() {
		return onlineInvoiceUrl;
	}

	public void setOnlineInvoiceUrl(String onlineInvoiceUrl) {
		this.onlineInvoiceUrl = onlineInvoiceUrl;
	}
	
}
