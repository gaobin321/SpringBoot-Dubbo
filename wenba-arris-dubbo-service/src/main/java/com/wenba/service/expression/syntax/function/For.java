package com.wenba.service.expression.syntax.function;

import com.wenba.service.expression.Expression;
import com.wenba.service.expression.ExpressionFactory;
import com.wenba.service.expression.tokens.DataType;
import com.wenba.service.expression.tokens.Valuable;

import java.math.BigDecimal;

public class For extends Function {

	@Override
	public int getArgumentNum() {
		return -1;
	}

	@Override
	protected Object executeFunction(Valuable[] arguments) {
		ExpressionFactory factory = ExpressionFactory.getInstance();
		int i = Integer.parseInt(arguments[0].getValue().toString());
		String  expression = arguments[1].getStringValue();
		Expression exp = factory.getExpression(expression);
		for(int j = 0; j < i; j++) {
			exp.lexicalAnalysis();
			Valuable result = exp.evaluate();
			Object value = result.getValue();
			return value;
		}
		return null;
	}

	@Override
	public String getName() {
		return "for";
	}

	@Override
	public DataType[] getArgumentsDataType() {
		return new DataType[]{DataType.ANY};
	}
}
