package customer.endpoint;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import customer.Customer;
import order.Order;

@WebService()
public class WSCustomer {
	
	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;
	private Customer c;
	private Order o;
	
	public WSCustomer() {}

	@WebMethod()
	public ArrayList<Customer> findCustomer(@WebParam(name = "SearchTerm") String search) {
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/" + 
			    	Database.DATABASE_NAME + "?user=" + Database.USERNAME + "&password=" + Database.PASSWORD);

		    stmt = conn.prepareStatement("SELECT c.first_name, c.middle_name, c.last_name, c.customer_phone, " +
		    		"c.customer_email, c.other_customer_details, a.line_1, a.line_2, a.line_3, a.city, a.state_province_country," +
		    		"a.zip_postcode, a.iso_country_code, a.other_address_details " +
		    		"FROM customers c " +
		    		"JOIN customer_addresses ca " +
		    		"ON c.customer_id = ca.customer_id " +
		    		"JOIN addresses a " +
		    		"ON ca.address_id = a.address_id " +
		    		"WHERE first_name LIKE ? " +
		    		"OR last_name LIKE ? " +
		    		"OR middle_name LIKE ? " +
		    		"OR customer_phone LIKE ? " +
		    		"OR customer_email LIKE ? " +
		    		"OR other_customer_details LIKE ?");
		    
		    stmt.setString(1, search);
		    stmt.setString(2, search);
		    stmt.setString(3, search);
		    stmt.setString(4, search);
		    stmt.setString(5, search);
		    stmt.setString(6, search);
		    
		    rs = stmt.executeQuery();
		    
		    while(rs.next()) {
		    
		    	c = new Customer();
		    	
		    	c.setFirstName(rs.getString(1));
		    	c.setMiddleName(rs.getString(2));
		    	c.setLastName(rs.getString(3));
		    	c.setCustomerPhone(rs.getString(4));
		    	c.setCustomerEmail(rs.getString(5));
		    	c.setOtherCustomerDetails(rs.getString(6));
		    	c.setAddressLine1(rs.getString(7));
		    	c.setAddressLine2(rs.getString(8));
		    	c.setAddressLine3(rs.getString(9));
		    	c.setCity(rs.getString(10));
		    	c.setStateProvinceCountry(rs.getString(11));
		    	c.setZipPostcode(rs.getString(12));
		    	c.setIsoCountryCode(rs.getString(13));
		    	c.setOtherAddressDetails(rs.getString(14));
		    	
		    	customers.add(c);		    	
		    }
		    
		    rs.close();
		    stmt.close();
		    conn.close();
		    
		} catch (Exception ex) {
		   // return ex.getMessage();
		}
		
		return customers;
	}
	
	@WebMethod()
	public int createSupplier(@WebParam(name = "SupplierName") String supplier_name, 
			@WebParam(name = "OtherDetails") String other_details) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/" + 
			    	Database.DATABASE_NAME + "?user=" + Database.USERNAME + "&password=" + Database.PASSWORD);

		    stmt = conn.prepareStatement("INSERT INTO suppliers VALUES (null, ?, ?)");
		    
		    stmt.setString(1, supplier_name);
		    stmt.setString(2, other_details);
		    
		    int result = stmt.executeUpdate();
		  
		    stmt.close();		    
		    conn.close();
		    
		    return result;
		    
		} catch (Exception ex) {
		   // return ex.getMessage();
		}
		
		return 0;
	}
	
	@WebMethod()
	public int createProduct(@WebParam(name = "SupplierCode") int supplier_code, @WebParam(name = "Price") double price, 
			@WebParam(name = "ISBN") String isbn, @WebParam(name = "Author") String author, @WebParam(name = "PublicationDate") String pub_date, 
			@WebParam(name = "Title") String title, @WebParam(name = "BookPrice") double book_price, @WebParam(name = "OtherDetails") String details) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/" + 
			    	Database.DATABASE_NAME + "?user=" + Database.USERNAME + "&password=" + Database.PASSWORD);

		    stmt = conn.prepareStatement("INSERT INTO products VALUES (null, ?, ?, ?, ?, ?, ?, ?, ?)");
		    
		    stmt.setInt(1, supplier_code);
		    stmt.setDouble(2, price);
		    stmt.setString(3, isbn);
		    stmt.setString(4, author);
		    stmt.setString(5, pub_date);
		    stmt.setString(6, title);
		    stmt.setDouble(7, book_price);
		    stmt.setString(8, details);
		    
		    int result = stmt.executeUpdate();
		  
		    stmt.close();		    
		    conn.close();
		    
		    return result;
		    
		} catch (Exception ex) {
		   // return ex.getMessage();
		}		
		return 0;
	}
	
	@WebMethod()
	public ArrayList<Order> findOrders(@WebParam(name = "SearchTerm") String search) {
		
		ArrayList<Order> orders = new ArrayList<Order>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/" + 
			    	Database.DATABASE_NAME + "?user=" + Database.USERNAME + "&password=" + Database.PASSWORD);

		    stmt = conn.prepareStatement("SELECT o.order_id, p.card_number, d.delivery_status_code " +
		    		"FROM customers c " +
		    		"JOIN customer_orders o " +
		    		"ON c.customer_id = o.customer_id " +
		    		"JOIN customers_payment_methods p " +
		    		"ON c.customer_id = p.customer_id " +
		    		"JOIN customer_orders_delivery d " +
		    		"ON o.order_id = d.order_id " +
		    		"WHERE c.first_name LIKE ? " +
		    		"OR c.last_name LIKE ? " +
		    		"OR c.middle_name LIKE ? " +
		    		"OR c.customer_phone LIKE ? " +
		    		"OR c.customer_email LIKE ? " +
		    		"OR c.other_customer_details LIKE ?");
		    
		    stmt.setString(1, search);
		    stmt.setString(2, search);
		    stmt.setString(3, search);
		    stmt.setString(4, search);
		    stmt.setString(5, search);
		    stmt.setString(6, search);
		    
		    rs = stmt.executeQuery();
		    
		    while(rs.next()) {
		    
		    	o = new Order();
		    	
		    	o.setOrderId(rs.getInt(1));
		    	o.setCardNumber(rs.getInt(2));
		    	o.setDeliveryStatus(rs.getString(3));
		    	
		    	orders.add(o);		    	
		    }
		    
		    rs.close();
		    stmt.close();
		    conn.close();
		    
		} catch (Exception ex) {
		   //return ex.getMessage();
		}
		
		return orders;
	}
}
