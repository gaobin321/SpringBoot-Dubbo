package com.wenba.service.expression.syntax.function;

import com.wenba.service.expression.tokens.DataType;
import com.wenba.service.expression.tokens.Valuable;

public class Ifthen extends Function {

	@Override
	public int getArgumentNum() {
		return 2;
	}

	@Override
	protected Object executeFunction(Valuable[] arguments) {
		boolean condition = arguments[0].getBooleanValue();
		if(condition)
			return arguments[1].getValue();
		return null;
	}

	@Override
	public String getName() {
		return "ifthen";
	}

	@Override
	public DataType[] getArgumentsDataType() {
		return new DataType[]{DataType.BOOLEAN, DataType.ANY};
	}
}
