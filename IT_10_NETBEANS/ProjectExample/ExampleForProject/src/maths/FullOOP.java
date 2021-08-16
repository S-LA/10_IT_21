/*
 *  SHANGRI-LA ACADEMY
 *  INFORMATION TECHNOLOGY
 *  CLASS NOTES
 */
package maths;

/**
 *
 * @author kwhil
 */
public class FullOOP {
	
	private int varX;
	private int varY;
	private int varZ;
	
	public FullOOP(int inA, int inB, int inC){
		varX = inA;
		varY = inB;
		varZ = inC;
	}
	// accessor (gettors)
	private int getVarX(){
		return varX;
	}
	private int getVarY(){
		return varY;
	}
	private int getVarZ(){
		return varZ;
	}
	
	// mutators 
	private void setVarX(int paramA){
		varX = paramA;
	}
	private void setVarY(int paramB){
		varY = paramB;
	}
	private void setVarZ(int paramC){
		varZ = paramC;
	}
	
	// brains
	
	public int addValues(){
		int temp = getVarX() + getVarY();
		this.setVarZ(temp);
		return temp;
	}
	

	
	
	
	
	
	
	
}
