package eecs2030.lab3;

/**
 * An immutable class implementing a 3x3 matrix 
 * @author Andriy
 * EECS 2030 Lab 3 SU2022
 */
public class Matrix3 {
	//Make all elements of array write once
	private final double a00, a01, a02,
				 a10, a11, a12,
				 a20, a21, a22;
	
	//Make references array reference write once
	private final double[][] a;
	
	/**
	 * Creates a 3x3 matrix from an 2D array
	 * @param array array containing the elements of the desired matrix
	 * TODO HERE, determine and specify the preconditions, and take an appropriate action
	 */
	public Matrix3(double[][] array) {
		//Check input dimensions
		if(array.length != 3)
		{
			throw new IllegalArgumentException();
		}
		else
		{
			for(int i = 0; i < 3; i++)
			{
				if(array[i].length != 3)
				{
					throw new IllegalArgumentException();
				}
			}
		}
		
		//Assign array elements to corresponding matrix elements
		a00 = array[0][0];
		a01 = array[0][1];
		a02 = array[0][2];
		a10 = array[1][0];
		a11 = array[1][1];
		a12 = array[1][2];
		a20 = array[2][0];
		a21 = array[2][1];
		a22 = array[2][2];
		
		//Assign matrix constants.
		a = new double[][] {{a00, a01, a02}, {a10, a11, a12}, {a20, a21, a22}};
	}
	
	/**
	 * Clones an existing matrix
	 * @param old an existing Matrix3 object 
	 * TODO HERE, determine and specify the preconditions, and take an appropriate action
	 */
	public Matrix3(Matrix3 old) {
		//Copy over all values and references
		this.a00 = old.a00;
		this.a01 = old.a01;
		this.a02 = old.a02;
		this.a10 = old.a10;
		this.a11 = old.a11;
		this.a12 = old.a12;
		this.a20 = old.a20;
		this.a21 = old.a21;
		this.a22 = old.a22;
		this.a = old.a;
	}

	/**
	 * Returns a matrix element at a row, column
	 * @param row row
	 * @param column column
	 * @return matrix element as a scalar
	 * TODO HERE, determine and specify the preconditions, and take an appropriate action
	 */
	public double getElement (int row, int column){
		//Check if indices given are in bounds
		if(row >= 0 && row < 3 && column >=0 && column < 3)
		{
			return this.a[row][column];
		}
		else
		{
			throw new IllegalArgumentException();
		}
	}
	
	/**
	 * Returns matrix elements as a 2D array
	 * @return 2D array containing 9 matrix elements
	 */
	public double[][] getElements (){
		//Return a copy of the matrix array, not the reference to matrix array
		return new double[][] {{a00, a01, a02}, {a10, a11, a12}, {a20, a21, a22}};
	}

}
