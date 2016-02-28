package base;

public class MyInteger {
	private int iValue;
	
	public void iValue(int iValue) {
		this.iValue = iValue;
	}
	public int getiValue() {
		return iValue;
	}

	boolean isEven() {
		if (iValue % 2 == 0)
			return true;
		else
			return false;

	}

	boolean isOdd() {
		if (iValue % 2 != 0)
			return true;
		else
			return false;
	}

	public boolean isPrime() {
		int factor = 0;
		for (factor = 2; factor <= iValue / 2; factor++) {
			if (iValue % 2 != 0) {
				return true;
			}
		}
		return false;

	}

	public static boolean isEven(int iValue) {
		if (iValue % 2 == 0)
			return true;
		else
			return false;
	}

	public static boolean isOdd(int iValue) {
		if (iValue % 2 != 0)
			return true;
		else
			return false;
	}

	public static boolean isPrime(int iValue) {
		int factor = 0;
		for (factor = 2; factor <= iValue / 2; factor++) {
			if (iValue % 2 != 0) {
				return true;
			}
		}
		return false;
	}

	public static boolean isEven(MyInteger myInteger) {
		return myInteger.isEven(myInteger.getiValue());

	}

	public static boolean isOdd(MyInteger myInteger) {
		return myInteger.isOdd(myInteger.getiValue());
	}

	public static boolean isPrime(MyInteger myInteger) {
		return myInteger.isPrime(myInteger.getiValue());
	}

	public boolean equals(int intiValue) {
		return iValue == intiValue;
	}

	public boolean equals(MyInteger myInteger) {
		return equals(myInteger.getiValue());

	}
}
