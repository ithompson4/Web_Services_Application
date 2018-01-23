
package customer.endpoint.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "createProduct", namespace = "http://endpoint.customer/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createProduct", namespace = "http://endpoint.customer/", propOrder = {
    "supplierCode",
    "price",
    "isbn",
    "author",
    "publicationDate",
    "title",
    "bookPrice",
    "otherDetails"
})
public class CreateProduct {

    @XmlElement(name = "SupplierCode", namespace = "")
    private int supplierCode;
    @XmlElement(name = "Price", namespace = "")
    private double price;
    @XmlElement(name = "ISBN", namespace = "")
    private String isbn;
    @XmlElement(name = "Author", namespace = "")
    private String author;
    @XmlElement(name = "PublicationDate", namespace = "")
    private String publicationDate;
    @XmlElement(name = "Title", namespace = "")
    private String title;
    @XmlElement(name = "BookPrice", namespace = "")
    private double bookPrice;
    @XmlElement(name = "OtherDetails", namespace = "")
    private String otherDetails;

    /**
     * 
     * @return
     *     returns int
     */
    public int getSupplierCode() {
        return this.supplierCode;
    }

    /**
     * 
     * @param supplierCode
     *     the value for the supplierCode property
     */
    public void setSupplierCode(int supplierCode) {
        this.supplierCode = supplierCode;
    }

    /**
     * 
     * @return
     *     returns double
     */
    public double getPrice() {
        return this.price;
    }

    /**
     * 
     * @param price
     *     the value for the price property
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getIsbn() {
        return this.isbn;
    }

    /**
     * 
     * @param isbn
     *     the value for the isbn property
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * 
     * @param author
     *     the value for the author property
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getPublicationDate() {
        return this.publicationDate;
    }

    /**
     * 
     * @param publicationDate
     *     the value for the publicationDate property
     */
    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * 
     * @param title
     *     the value for the title property
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     returns double
     */
    public double getBookPrice() {
        return this.bookPrice;
    }

    /**
     * 
     * @param bookPrice
     *     the value for the bookPrice property
     */
    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
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
