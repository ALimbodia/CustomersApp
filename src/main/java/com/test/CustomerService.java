package com.test;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.test.pojo.Customer;

@Path("/customers")
public class CustomerService {

	private static CustomerDAO dao = new CustomerDAO();

	@GET
	@Produces("application/json")
	public Response getCustomer() {
		List<Customer> custs = dao.readCustomers();
		return Response.ok(custs).build();
	}

	@PUT
	@Consumes("application/json")
	public Response createCustomer(Customer cust) {
		dao.createNewCustomer(cust);
		return Response.ok().build();
	}

	@POST
	@Consumes("application/json")
	public Response updateCustomer(Customer cust) {
		dao.updateCustomer(cust);
		return Response.ok().build();
	}

	@DELETE
	@Consumes("application/json")
	public Response deleteCustomer(Customer cust) {
		dao.deleteCustomer(cust);
		return Response.ok().build();
	}
}
