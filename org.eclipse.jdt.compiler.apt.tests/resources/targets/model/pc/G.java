package targets.model.pc;

import targets.model.pa.IA;

@AnnoX("on G")
public abstract class G extends F<String> implements IA, IF {
	public String _fieldString;
	
	int fieldInt; // hides definition in F
	
	@Override
	@AnnoY("on G.method_T1")
	String method_T1(String param1) 
	{
		return null;
	}
	
	String method2_String()
	{
		return null;
	}
	
	// Method declared in an interface but not implemented:
	//public String methodIAString(int int1)
	//{
	//	return null;
	//}
}