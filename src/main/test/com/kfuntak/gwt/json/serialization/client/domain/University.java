package com.kfuntak.gwt.json.serialization.client.domain;

import java.util.Objects;

import com.kfuntak.gwt.json.serialization.client.JsonSerializable;

@SuppressWarnings("javadoc")
public class University extends School implements JsonSerializable {

    private String forVerification;

    public void setForVerification(String forVerification) {
        this.forVerification = forVerification;
    }

    public String getForVerification() {
        return forVerification;
    }

    /* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(forVerification);
		return result;
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
		if (!super.equals(obj))
		{
			return false;
		}
		if (!(obj instanceof University))
		{
			return false;
		}
		University other = (University) obj;
		return Objects.equals(forVerification, other.forVerification);
	}

	@Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("{");
        buffer.append(super.toString());
        buffer.append(",");
        buffer.append("forVerification:");
        buffer.append(forVerification + ",");
        buffer.append("}");
        return buffer.toString();
    }
}
