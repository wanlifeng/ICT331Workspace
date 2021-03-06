public class ImportCustomer extends Customer {
	private String country;
	private boolean freightForwarderInspection;
	private boolean freightForwarderFumigation;

	public ImportCustomer(String name, String address, String city,
			String state, String country, boolean freightForwarderInspection,
			boolean freightForwarderFumigation) {
		super(name, address, city, state);
		this.country = country;
		this.freightForwarderInspection = freightForwarderInspection;
		this.freightForwarderFumigation = freightForwarderFumigation;
	}

	public ImportCustomer() {

	}

	public String toString() {
		return "Import" + super.toString() + "|" + country
				+ "|" + freightForwarderInspection
				+ "|" + freightForwarderFumigation;
	}
	public String getCountry() {
		return country;
	}

	public boolean isFreightForwarderInspection() {
		return freightForwarderInspection;
	}

	public boolean isFreightForwarderFumigation() {
		return freightForwarderFumigation;
	}
}
