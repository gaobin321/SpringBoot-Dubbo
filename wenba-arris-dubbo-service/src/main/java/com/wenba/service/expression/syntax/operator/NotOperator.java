package com.wenba.service.expression.syntax.operator;

import com.wenba.service.expression.syntax.ArgumentsMismatchException;
import com.wenba.service.expression.tokens.DataType;
import com.wenba.service.expression.tokens.Valuable;

public class NotOperator extends UnaryOperator {

	public NotOperator() {
		super("NOT");
	}

	@Override
	public Object operate(Valuable[] arguments)
			throws ArgumentsMismatchException {
		Object result = null;
		Valuable argument = arguments[0];
		if (argument.getDataType() == DataType.BOOLEAN) {
			result = !argument.getBooleanValue();
		} else {
			throw new ArgumentsMismatchException(arguments, "!");
		}
		return result;
	}

}
