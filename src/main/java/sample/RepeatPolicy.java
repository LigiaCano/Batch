package sample;

import java.util.List;

import org.springframework.batch.repeat.CompletionPolicy;
import org.springframework.batch.repeat.RepeatContext;
import org.springframework.batch.repeat.RepeatStatus;

public class RepeatPolicy implements CompletionPolicy {
	private List<String> elements;
	private String currentElement;
	@Override
	public boolean isComplete(RepeatContext arg0) {
		return elements.size() == 0;
	}

	@Override
	public boolean isComplete(RepeatContext arg0, RepeatStatus arg1) {
		return elements.size() == 0;
	}

	@Override
	public RepeatContext start(RepeatContext repeatContext) {
		return repeatContext;
	}

	@Override
	public void update(RepeatContext arg0) {
		currentElement = elements.remove(0);
	}
	public void setElements(List<String> elements) {
	    this.elements = elements;
	  }
	 
	  public String getCurrentElement() {
	    return currentElement;
	  }

}
