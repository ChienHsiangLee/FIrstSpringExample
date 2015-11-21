package tw.edu.nku.mis.spring.sequence;

import java.text.DecimalFormat;

public class SequenceGenerator {
	
	private PrefixGenerator prefix;
	private String suffix;
	private int initial;
	private int counter;

	
	public SequenceGenerator() {}
	
	public SequenceGenerator(PrefixGenerator prefix, String suffix, int initial) {
		this.prefix = prefix;
		this.suffix = suffix;
		this.initial = initial;
	}
	
	
	public void setPrefix(PrefixGenerator prefix) {
		this.prefix = prefix;
	}
	
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	
	public void setInitial(int initial) {
		this.initial = initial;
	}

	public synchronized String getSequence() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(this.prefix.getPrefix());
		DecimalFormat formatter = new DecimalFormat("0000");
		buffer.append(formatter.format(initial + counter++));
		buffer.append(suffix);
		return buffer.toString();
	}
}
