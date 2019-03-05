package de.jcing.utilities.fileio;

public class VarInt {

	private byte[] bytes;

	public static boolean getBit(int index, int data) {
		return (data >> (Integer.SIZE - index -1)) % 2 == 1;
	}
	
	
	public static void main(String[] args) {
		for (int number = - 20; number < 20 ; number++) {
			for (int i = 0; i < Integer.SIZE; i++) {
				System.out.print(getBit(i,number) ? '1' : '0');
			}
			System.out.println();
		}
	}

}
