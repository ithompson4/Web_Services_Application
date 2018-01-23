
package customer.endpoint.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findCustomer", namespace = "http://endpoint.customer/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findCustomer", namespace = "http://endpoint.customer/")
public class FindCustomer {

    @XmlElement(name = "SearchTerm", namespace = "")
    private String searchTerm;

    /**
     * 
     * @return
     *     returns String
     */
    public String getSearchTerm() {
        return this.searchTerm;
    }

    /**
     * 
     * @param searchTerm
     *     the value for the searchTerm property
     */
    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

}
