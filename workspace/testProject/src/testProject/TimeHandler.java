package testProject;

import java.text.SimpleDateFormat;
import java.util.*;

public class TimeHandler {

	private Date inTime;
	private String Time;

	private SimpleDateFormat sdf;

	public TimeHandler() {
		super();
		inTime = new Date();
		sdf = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss", Locale.US);
		this.Time = sdf.format(inTime);
	}
	
	public String getTime() {
		return Time;
	}

}
