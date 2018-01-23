
package customer.endpoint.jaxws;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findOrdersResponse", namespace = "http://endpoint.customer/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findOrdersResponse", namespace = "http://endpoint.customer/")
public class FindOrdersResponse {

    @XmlElement(name = "return", namespace = "")
    private ArrayList<order.Order> _return;

    /**
     * 
     * @return
     *     returns ArrayList<Order>
     */
    public ArrayList<order.Order> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(ArrayList<order.Order> _return) {
        this._return = _return;
    }

}
