package tw.edu.nku.mis.spring.sequence;

import java.text.DecimalFormat;
import java.util.List;

public class ListPrefixGenerator implements PrefixGenerator {
	List<Integer> prefixes;

	public void setPrefixes(List<Integer> prefixes) {
		this.prefixes = prefixes;
	}

	@Override
	public String getPrefix() {
		StringBuffer buffer = new StringBuffer();

		DecimalFormat formatter = new DecimalFormat("00");
		for (Object prefix : this.prefixes) {
			buffer.append(formatter.format(prefix));
			buffer.append("-");
		}

		return buffer.toString();
	}

}
