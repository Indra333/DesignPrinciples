package com.epam.Calculator.DesignPrinciples;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.ScriptEngine;
@SuppressWarnings("restriction")
public class calculate {
	
	public Object cal(String s) throws ScriptException {
		ScriptEngineManager mgr = new ScriptEngineManager();
		 ScriptEngine engine = mgr.getEngineByName("JavaScript");
		return engine.eval(s);
	}
}
