package com.kfuntak.gwt.json.serialization.client.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

@SuppressWarnings("javadoc")
public class Animal extends JsonableWithoutCruft {
    public Long refId = -1L;
    public String name;
    public String species;
    public Integer age;
    public HashMap<String, String> tricks = new HashMap<String, String>();
    public ArrayList<String> toys = new ArrayList<String>();

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
		if (!(obj instanceof Animal))
		{
			return false;
		}
		Animal other = (Animal) obj;
		return Objects.equals(age, other.age) && Objects.equals(name, other.name) && Objects.equals(refId, other.refId)
				&& Objects.equals(species, other.species) && Objects.equals(toys, other.toys)
				&& Objects.equals(tricks, other.tricks);
	}

    /* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		return Objects.hash(age, name, refId, species, toys, tricks);
	}


    @Override
    public String toString() {
        return "Animal{" +
                "\n  refId=" + refId +
                "\n  name='" + name + '\'' +
                "\n  species='" + species + '\'' +
                "\n  age=" + age +
                "\n  tricks=" + tricks +
                "\n  toys=" + toys +
                "\n}";
    }
}
