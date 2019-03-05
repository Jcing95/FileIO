package de.jcing.utilities.fileio;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.HashMap;

public class Data implements Externalizable {

	public static final String GLOBAL_CATEGORY = "";

	HashMap<String, ArrayList<Boolean>> booleans;
	HashMap<String, ArrayList<Byte>> bytes;
	HashMap<String, ArrayList<Character>> chars;
	HashMap<String, ArrayList<Short>> shorts;
	HashMap<String, ArrayList<Integer>> ints;
	HashMap<String, ArrayList<Long>> longs;
	HashMap<String, ArrayList<Float>> floats;
	HashMap<String, ArrayList<Double>> doubles;
	HashMap<String, ArrayList<String>> strings;
	

	public void writeExternal(ObjectOutput out) throws IOException {
		for(String s : booleans.keySet()) {
			ArrayList list = booleans.get(s);
			for(int i = 0; i < list.size(); i++) {
				
			}
		}
	}


	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}
	
	public int put(boolean value, String category) {
		if (booleans == null)
			booleans = new HashMap<String, ArrayList<Boolean>>();
		if (!booleans.containsKey(category))
			booleans.put(category, new ArrayList<Boolean>());
		booleans.get(category).add(value);
		return booleans.get(category).size() - 1;
	}

	public int put(boolean value) {
		return put(value, GLOBAL_CATEGORY);
	}

	public boolean getBoolean(int index, String category) throws NotStoredException {
		if (booleans == null || booleans.get(category) == null || booleans.get(category).size() < index - 1)
			throw new NotStoredException();
		return booleans.get(category).get(index);
	}

	public boolean getBoolean(int index) throws NotStoredException {
		return getBoolean(index, GLOBAL_CATEGORY);
	}

	public int put(byte value, String category) {
		if (bytes == null)
			bytes = new HashMap<String, ArrayList<Byte>>();
		if (!bytes.containsKey(category))
			bytes.put(category, new ArrayList<Byte>());
		bytes.get(category).add(value);
		return bytes.get(category).size() - 1;
	}

	public int put(byte value) {
		return put(value, GLOBAL_CATEGORY);
	}

	public byte getByte(int index, String category) throws NotStoredException {
		if (bytes == null || bytes.get(category) == null || bytes.get(category).size() < index - 1)
			throw new NotStoredException();
		return bytes.get(category).get(index);
	}

	public byte getByte(int index) throws NotStoredException {
		return getByte(index, GLOBAL_CATEGORY);
	}

	public int put(char value, String category) {
		if (chars == null)
			chars = new HashMap<String, ArrayList<Character>>();
		if (!chars.containsKey(category))
			chars.put(category, new ArrayList<Character>());
		chars.get(category).add(value);
		return chars.get(category).size() - 1;
	}

	public int put(char value) {
		return put(value, GLOBAL_CATEGORY);
	}

	public char getChar(int index, String category) throws NotStoredException {
		if (chars == null || chars.get(category) == null || chars.get(category).size() < index - 1)
			throw new NotStoredException();
		return chars.get(category).get(index);
	}

	public char getChar(int index) throws NotStoredException {
		return getChar(index, GLOBAL_CATEGORY);
	}

	public int put(short value, String category) {
		if (shorts == null)
			shorts = new HashMap<String, ArrayList<Short>>();
		if (!shorts.containsKey(category))
			shorts.put(category, new ArrayList<Short>());
		shorts.get(category).add(value);
		return shorts.get(category).size() - 1;
	}

	public int put(short value) {
		return put(value, GLOBAL_CATEGORY);
	}

	public short getShort(int index, String category) throws NotStoredException {
		if (shorts == null || shorts.get(category) == null || shorts.get(category).size() < index - 1)
			throw new NotStoredException();
		return shorts.get(category).get(index);
	}

	public short getShort(int index) throws NotStoredException {
		return getShort(index, GLOBAL_CATEGORY);
	}

	public int put(int value, String category) {
		if (ints == null)
			ints = new HashMap<String, ArrayList<Integer>>();
		if (!ints.containsKey(category))
			ints.put(category, new ArrayList<Integer>());
		ints.get(category).add(value);
		return ints.get(category).size() - 1;
	}

	public int put(int value) {
		return put(value, GLOBAL_CATEGORY);
	}

	public int getInt(int index, String category) throws NotStoredException {
		if (ints == null || ints.get(category) == null || ints.get(category).size() < index - 1)
			throw new NotStoredException();
		return ints.get(category).get(index);
	}

	public int getInt(int index) throws NotStoredException {
		return getInt(index, GLOBAL_CATEGORY);
	}

	public int put(long value, String category) {
		if (longs == null)
			longs = new HashMap<String, ArrayList<Long>>();
		if (!longs.containsKey(category))
			longs.put(category, new ArrayList<Long>());
		longs.get(category).add(value);
		return longs.get(category).size() - 1;
	}

	public int put(long value) {
		return put(value, GLOBAL_CATEGORY);
	}

	public long getLong(int index, String category) throws NotStoredException {
		if (longs == null || longs.get(category) == null || longs.get(category).size() < index - 1)
			throw new NotStoredException();
		return longs.get(category).get(index);
	}

	public long getLong(int index) throws NotStoredException {
		return getLong(index, GLOBAL_CATEGORY);
	}

	public int put(float value, String category) {
		if (floats == null)
			floats = new HashMap<String, ArrayList<Float>>();
		if (!floats.containsKey(category))
			floats.put(category, new ArrayList<Float>());
		floats.get(category).add(value);
		return floats.get(category).size() - 1;
	}

	public int put(float value) {
		return put(value, GLOBAL_CATEGORY);
	}

	public float getFloat(int index, String category) throws NotStoredException {
		if (floats == null || floats.get(category) == null || floats.get(category).size() < index - 1)
			throw new NotStoredException();
		return floats.get(category).get(index);
	}

	public float getFloat(int index) throws NotStoredException {
		return getFloat(index, GLOBAL_CATEGORY);
	}

	public int put(double value, String category) {
		if (doubles == null)
			doubles = new HashMap<String, ArrayList<Double>>();
		if (!doubles.containsKey(category))
			doubles.put(category, new ArrayList<Double>());
		doubles.get(category).add(value);
		return doubles.get(category).size() - 1;
	}

	public int put(double value) {
		return put(value, GLOBAL_CATEGORY);
	}

	public double getDouble(int index, String category) throws NotStoredException {
		if (doubles == null || doubles.get(category) == null || doubles.get(category).size() < index - 1)
			throw new NotStoredException();
		return doubles.get(category).get(index);
	}

	public double getDouble(int index) throws NotStoredException {
		return getDouble(index, GLOBAL_CATEGORY);
	}

	public int put(String value, String category) {
		if (strings == null)
			strings = new HashMap<String, ArrayList<String>>();
		if (!strings.containsKey(category))
			strings.put(category, new ArrayList<String>());
		strings.get(category).add(value);
		return strings.get(category).size() - 1;
	}

	public int put(String value) {
		return put(value, GLOBAL_CATEGORY);
	}

	public String getString(int index, String category) throws NotStoredException {
		if (strings == null || strings.get(category) == null || strings.get(category).size() < index - 1)
			throw new NotStoredException();
		return strings.get(category).get(index);
	}

	public String getString(int index) throws NotStoredException {
		return getString(index, GLOBAL_CATEGORY);
	}
	
}
