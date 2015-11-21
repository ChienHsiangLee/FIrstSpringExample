package tw.edu.nku.mis.spring.sequence;

public class StringPrefixGenerator implements PrefixGenerator {
	String prefix;

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	@Override
	public String getPrefix() {
		// TODO Auto-generated method stub
		return this.prefix;
	}

}
