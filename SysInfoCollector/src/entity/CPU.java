package entity;

/**
 * cpuʵ����
 * @author corny
 *
 */
public class CPU {

	private String name;	//
	
	private String vendor;	//��Ӧ��
	private String model;	//�ͺ�(��Ƶ��������)
	
	private String idleRatio;	//����(����)
	private String usedRatio;	//ʹ��
	private String waitRatio;	//�ȴ�
	private String irqRatio;	//�ж�
	
	
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
