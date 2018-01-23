
package customer.endpoint.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "createSupplier", namespace = "http://endpoint.customer/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createSupplier", namespace = "http://endpoint.customer/", propOrder = {
    "supplierName",
    "otherDetails"
})
public class CreateSupplier {

    @XmlElement(name = "SupplierName", namespace = "")
    private String supplierName;
    @XmlElement(name = "OtherDetails", namespace = "")
    private String otherDetails;

    /**
     * 
     * @return
     *     returns String
     */
    public String getSupplierName() {
        return this.supplierName;
    }

    /**
     * 
     * @param supplierName
     *     the value for the supplierName property
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getOtherDetails() {
        return this.otherDetails;
    }

    /**
     * 
     * @param otherDetails
     *     the value for the otherDetails property
     */
    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }

}
