package cn.shadow.starter.formate;

import java.util.Objects;

public class JsonFormateProccessor implements FormateProcessor{

	public <T> String formate(T obj) {
		// TODO Auto-generated method stub
		return "Json Formate"+Objects.toString(obj);
	}

}
