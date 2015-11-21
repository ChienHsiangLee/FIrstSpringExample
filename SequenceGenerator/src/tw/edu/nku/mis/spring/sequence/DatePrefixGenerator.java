package tw.edu.nku.mis.spring.sequence;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Required;

public class DatePrefixGenerator implements PrefixGenerator {

	private DateFormat formatter;
	private String prefix;
	
	public String getPrefix() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(this.prefix);
		buffer.append(this.formatter.format(new Date()));
		return buffer.toString();		
	}
		
	@Required
	public void setPattern(String pattern) {
		this.formatter = new SimpleDateFormat(pattern);
	}
	@Required
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

}
