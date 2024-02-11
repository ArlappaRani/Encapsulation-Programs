package laptopprogram;

public class Laptop {
	private  String ProcessorName;
	private String memorysize;
	//using constructor to set the data
	public Laptop(String ProcessorName,String memorysize)
	{
		this.ProcessorName=ProcessorName;
		this.memorysize=memorysize;
	}
	//using public getters for controlled access
	public String getProcessorName()
	{
		return ProcessorName;
	}
	public String getmemorysize()
	{
		return memorysize;
	}
}