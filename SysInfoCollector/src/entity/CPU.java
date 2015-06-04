package entity;

/**
 * cpu实体类
 * @author corny
 *
 */
public class CPU {

	private String name;	//
	
	private String vendor;	//供应商
	private String model;	//型号(主频包含在内)
	
	private String idleRatio;	//空闲(比率)
	private String usedRatio;	//使用
	private String waitRatio;	//等待
	private String irqRatio;	//中断
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getIdleRatio() {
		return idleRatio;
	}
	public void setIdleRatio(String idleRatio) {
		this.idleRatio = idleRatio;
	}
	public String getUsedRatio() {
		return usedRatio;
	}
	public void setUsedRatio(String usedRatio) {
		this.usedRatio = usedRatio;
	}
	public String getWaitRatio() {
		return waitRatio;
	}
	public void setWaitRatio(String waitRatio) {
		this.waitRatio = waitRatio;
	}
	public String getIrqRatio() {
		return irqRatio;
	}
	public void setIrqRatio(String irqRatio) {
		this.irqRatio = irqRatio;
	}
}
