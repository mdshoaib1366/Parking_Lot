package com.june22.test.Flipkart;

public class FlipkartCustomer {
	private int custId;
	private String cutomerName;
	private String email;
	private String address;
	private int ordersCount;
	private String phone;

	public FlipkartCustomer(int custId, String cutomerName, String email, String address, int ordersCount,
			String phone) {
		super();
		this.custId = custId;
		this.cutomerName = cutomerName;
		this.email = email;
		this.address = address;
		this.ordersCount = ordersCount;
		this.phone = phone;
	}

	public FlipkartCustomer() {
		super();
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCutomerName() {
		return cutomerName;
	}

	public void setCutomerName(String cutomerName) {
		this.cutomerName = cutomerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getOrdersCount() {
		return ordersCount;
	}

	public void setOrdersCount(int ordersCount) {
		this.ordersCount = ordersCount;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
