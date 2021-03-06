package com.kfuntak.gwt.json.serialization.client.domain;

import com.kfuntak.gwt.json.serialization.client.JsonSerializable;

import java.util.HashMap;
import java.util.Objects;

@SuppressWarnings("javadoc")
public class Contact implements JsonSerializable {

    private Long refId;
    private Address address;
    private PhoneNumber phoneNumber;
    private HashMap<String, HashMap<String, Contact>> family = new HashMap<String, HashMap<String, Contact>>();
    private String name;

    public Contact(){}

    public Contact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRefId() {
        return refId;
    }

    public void setRefId(Long refId) {
        this.refId = refId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		return Objects.hash(address, family, name, phoneNumber, refId);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		if (!(obj instanceof Contact))
		{
			return false;
		}
		Contact other = (Contact) obj;
		return Objects.equals(address, other.address) && Objects.equals(family, other.family)
				&& Objects.equals(name, other.name) && Objects.equals(phoneNumber, other.phoneNumber)
				&& Objects.equals(refId, other.refId);
	}

	@Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("{");
        buffer.append("name:");
        buffer.append(name + ",");
        buffer.append("refId:");
        buffer.append(refId + ",");
        buffer.append("address:");
        buffer.append(address + ",");
        buffer.append("phoneNumber:");
        buffer.append(phoneNumber + ",");
        buffer.append("}");
        return buffer.toString();
    }

    public HashMap<String, HashMap<String, Contact>> getFamily() {
        return family;
    }

    public void setFamily(HashMap<String, HashMap<String, Contact>> family) {
        this.family = family;
    }
}
