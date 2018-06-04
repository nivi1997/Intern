package RestAPI;

public class TagClasses {
	public class API
	{
		String name;
		String method;
		String description;
		API()
		{
			name=null;
			method=null;
			description=null;
		}
	}
	public class Parameter
	{
		String name;
		String description;
		String type;
		boolean mandatory;
		String constraint_type;
		String constraint;
		String error_message;
		Parameter()
		{
			name=null;
			description=null;
			type=null;
			mandatory=false;
			constraint=null;
			error_message=null;
			constraint_type=null;
		}
	}
	public class Module
	{
		String name;
		String description;
		Module()
		{
			name=null;
			description=null;
		}
	}
}
