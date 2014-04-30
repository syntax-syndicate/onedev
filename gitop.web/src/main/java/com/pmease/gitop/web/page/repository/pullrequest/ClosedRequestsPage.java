package com.pmease.gitop.web.page.repository.pullrequest;

import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.pmease.gitop.web.page.repository.RepositoryPage;

@SuppressWarnings("serial")
public class ClosedRequestsPage extends RepositoryPage {

	public ClosedRequestsPage(PageParameters params) {
		super(params);
	}

	@Override
	protected void onInitialize() {
		super.onInitialize();

		add(new RequestListPanel("content", false));
	}

}