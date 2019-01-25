package com.kfuntak.gwt.json.serialization.client.domain;

import java.util.Objects;

import com.kfuntak.gwt.json.serialization.client.JsonSerializable;

@SuppressWarnings("javadoc")
public class PhoneNumber implements JsonSerializable {

    private String number;
    private String ext;
    private String type;
    private String listedStatus;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getListedStatus() {
        return listedStatus;
    }

    public void setListedStatus(String listedStatus) {
        this.listedStatus = listedStatus;
    }

    /* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		return Objects.hash(ext, listedStatus, number, type);
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
		if (!(obj instanceof PhoneNumber))
		{
			return false;
		}
		PhoneNumber other = (PhoneNumber) obj;
		return Objects.equals(ext, other.ext) && Objects.equals(listedStatus, other.listedStatus)
				&& Objects.equals(number, other.number) && Objects.equals(type, other.type);
	}

	@Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("{");
        buffer.append("number:");
        buffer.append(number + ",");
        buffer.append("ext:");
        buffer.append(ext + ",");
        buffer.append("type:");
        buffer.append(type + ",");
        buffer.append("listedStatus:");
        buffer.append(listedStatus + ",");
        buffer.append("}");
        return buffer.toString();
    }
}
