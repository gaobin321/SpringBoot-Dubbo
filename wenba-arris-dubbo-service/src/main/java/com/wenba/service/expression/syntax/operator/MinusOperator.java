package com.wenba.service.expression.syntax.operator;

import com.wenba.service.expression.syntax.ArgumentsMismatchException;
import com.wenba.service.expression.tokens.DataType;
import com.wenba.service.expression.tokens.Valuable;

public class MinusOperator extends BinaryOperator {

	public MinusOperator() {
		super("MINUS");
	}

	public static final String name = "MINUS";

	@Override
	public Object operate(Valuable[] arguments)
			throws ArgumentsMismatchException {
		Object result = null;
		Valuable a1 = arguments[0];
		Valuable a2 = arguments[1];
		if (a1.getDataType() == DataType.NUMBER
				&& a2.getDataType() == DataType.NUMBER) {
			result = a1.getNumberValue().subtract(a2.getNumberValue());
		} else {
			throw new ArgumentsMismatchException(arguments, "-");
		}
		return result;
	}

}
