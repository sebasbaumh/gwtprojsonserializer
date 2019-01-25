package com.kfuntak.gwt.json.serialization.client.domain;

import java.util.Objects;

import com.kfuntak.gwt.json.serialization.client.JsonSerializable;

@SuppressWarnings("javadoc")
public class Student implements JsonSerializable {
    public Contact contact;
    public School school;
    
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		return Objects.hash(contact, school);
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
		if (!(obj instanceof Student))
		{
			return false;
		}
		Student other = (Student) obj;
		return Objects.equals(contact, other.contact) && Objects.equals(school, other.school);
	}
}
