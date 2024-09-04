package io.onedev.server.model.support.issue.transitionspec;

import javax.validation.constraints.Min;

import io.onedev.server.annotation.Editable;

@Editable(order=600, name="No activity for some time")
public class NoActivitySpec extends AutoSpec {

	private static final long serialVersionUID = 1L;

	private int days;

	@Editable(order=200, name="No Activity Days")
	@Min(1)
	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
	
	@Override
	public String getTriggerDescription() {
		return "no activity for " + days + " days"; 
	}
	
}