package cn.shadow.starter.formate;

import java.util.Objects;

public class StringFormateProccessor implements FormateProcessor{

	public <T> String formate(T obj) {
		// TODO Auto-generated method stub
		return "String Formate"+Objects.toString(obj);
	}

}
