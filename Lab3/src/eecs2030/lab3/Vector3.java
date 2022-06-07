package eecs2030.lab3;

/**
 * An immutable class implementing a 3D vector 
 * @author Andriy
 * EECS 2030 Lab 3 SU2022
 *
 */
public class Vector3 implements Comparable <Vector3>{
	//TODO
	//consider how to ensure the objects are immutable
	final double[] vector;

	/**
	 * Creates a 3D vector from 3 numeric scalar components
	 * @param x x coordinate
	 * @param y y coordinate
	 * @param z z coordinate
	 */
	public Vector3(double x, double y, double z) {
		//TODO
		vector = new double[]{x,y,z};
	}

	/**
	 * Creates a 3D vector from an array
	 * @param v array containing 3 components of the desired vector 
	 * TODO HERE, determine and specify the preconditions, and take an appropriate action
	 */
	public Vector3(double[] v) {
		//TODO
		//consider how to ensure the objects are immutable
		this(v[0], v[1], v[2]);
		if(v.length != 3)
		{
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Clones an existing vector
	 * @param old an existing Vector3 object 
	 * TODO HERE, determine and specify the preconditions, and take an appropriate action
	 */
	public Vector3(Vector3 old) {
		//TODO
		//consider how to ensure the objects are immutable
		this(old.vector[0], old.vector[1], old.vector[2]);
	}

	/**
	 * Returns a vector component at a specified index
	 * @param index the index of the vector component
	 * @return vector component as a scalar
	 * TODO HERE, determine and specify the preconditions, and take an appropriate action
	 */
	public double getElement (int index){
		//TODO
		if(index < 0 || index > 2)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			return vector[index];
		}
	}

	/**
	 * Returns vector components as an array
	 * @return vector components, first element at index [0], and so on
	 */
	public double[] getElements (){
		//TODO
		//consider how to ensure the objects are immutable
		return new double[]{this.getElement(0), this.getElement(1), this.getElement(2)};
	}

	@Override
	public int hashCode() {
		//TODO
		return vector.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		//TODO
		if(obj == null)
		{
			return false;
		}
		else if(obj.getClass() == Vector3.class)
		{
			Vector3 other = (Vector3) obj;
			if(this.getElements() == other.getElements())
			{
				return true;
			}
			return false;
		}
		else
		{
			return false;
		}
	}

	/**
	 * Compares vectors by their magnitudes
	 * @return -1 if o is greater than this, 0 if equal, 1 otherwise
	 */
	@Override
	public int compareTo(Vector3 o) {
		//TODO
		double mag1, mag2, x1, x2, y1, y2, z1, z2;
		x1 = this.getElement(0);
		y1 = this.getElement(1);
		z1 = this.getElement(2);
		mag1 = Math.sqrt(x1 * x1 + y1 * y1 + z1 * z1);
		
		x2 = o.getElement(0);
		y2 = o.getElement(1);
		z2 = o.getElement(2);
		mag2 = Math.sqrt(x2 * x2 + y2 * y2 + z2 * z2);
		
		if(mag1 > mag2)
		{
			return 1;
		}
		else if(mag1 < mag2)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
