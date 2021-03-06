package com.merchant;

import java.util.List;

public class Dirt extends Unit {

	@Override
	public Double getValue() {
		return getPreValue() != 0 ? value / getPreValue() : value;
	}

	@Override
	public void setPreValue(List<Unit> units, CurrentLine currentLine) {
		setName(currentLine);
		if (isPreNamesLenghMoreThanOne(currentLine)) {
			setPreValue(getPreValue(units, currentLine));
		} else {
			value = convertNumeralRomanToArabic(currentLine.getValue()).doubleValue();
		}
	}

}