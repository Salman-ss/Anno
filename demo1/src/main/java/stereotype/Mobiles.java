package stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobiles {
	@Value("3042")
	private int modelNo;
	@Value("Realme")
	private String modelName;
	@Value("Cyan")
	private String modelColor;
	@Value("24000")
	private int modelPrice;
	@Value("#{al}")
	private List<String> specification;
	
	public List<String> getSpecification() {
		return specification;
	}
	public void setSpecification(List<String> specification) {
		this.specification = specification;
	}
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getModelColor() {
		return modelColor;
	}
	public void setModelColor(String modelColor) {
		this.modelColor = modelColor;
	}
	public int getModelPrice() {
		return modelPrice;
	}
	public void setModelPrice(int modelPrice) {
		this.modelPrice = modelPrice;
	}
	@Override
	public String toString() {
		return "Mobiles [modelNo=" + modelNo + ", modelName=" + modelName + ", modelColor=" + modelColor
				+ ", modelPrice=" + modelPrice + "]";
	}
	
	
	

}
