package com.wenba.service.expression.syntax.operator;

import com.wenba.service.expression.syntax.ArgumentsMismatchException;
import com.wenba.service.expression.tokens.DataType;
import com.wenba.service.expression.tokens.Valuable;

public class NotEqualOperator extends BinaryOperator {

	public NotEqualOperator() {
		super("NOTEQUAL");
	}

	@Override
	public Object operate(Valuable[] arguments)
			throws ArgumentsMismatchException {
		Object result = null;
		Valuable a1 = arguments[0];
		Valuable a2 = arguments[1];
		if (a1.getDataType() == DataType.NUMBER
				&& a2.getDataType() == DataType.NUMBER) {
			result = a1.getNumberValue().compareTo(a2.getNumberValue()) != 0;
		} else if (a1.getDataType() == DataType.STRING
				&& a2.getDataType() == DataType.STRING) {
			result = !a1.getStringValue().equals(a2.getStringValue());
		} else if (a1.getDataType() == DataType.CHARACTER
				&& a2.getDataType() == DataType.CHARACTER) {
			result = !a1.getCharValue().equals(a2.getCharValue());
		} else if (a1.getDataType() == DataType.DATE
				&& a2.getDataType() == DataType.DATE) {
			result = !a1.getDateValue().equals(a2.getDateValue());
		} else {
			throw new ArgumentsMismatchException(arguments, "!=");
		}
		return result;
	}

}
