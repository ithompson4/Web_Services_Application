
package customer.endpoint.jaxws;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findCustomerResponse", namespace = "http://endpoint.customer/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findCustomerResponse", namespace = "http://endpoint.customer/")
public class FindCustomerResponse {

    @XmlElement(name = "return", namespace = "")
    private ArrayList<customer.Customer> _return;

    /**
     * 
     * @return
     *     returns ArrayList<Customer>
     */
    public ArrayList<customer.Customer> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(ArrayList<customer.Customer> _return) {
        this._return = _return;
    }

}
