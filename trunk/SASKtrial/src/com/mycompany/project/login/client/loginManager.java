package com.mycompany.project.login.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.mycompany.project.login.client.login;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class loginManager implements EntryPoint {
	public void onModuleLoad() {
		RootPanel rootPanel = RootPanel.get();

		final HorizontalPanel horizontalPanel = new HorizontalPanel();
		rootPanel.add(horizontalPanel, 0, 0);
		horizontalPanel.setSize("622px", "450px");

		final VerticalPanel verticalPanel = new VerticalPanel();
		horizontalPanel.add(verticalPanel);
		verticalPanel.setSize("125px", "450px");

		final Label toLoginToLabel = new Label("To login to SASK");
		verticalPanel.add(toLoginToLabel);

		final login login_ = new login();
		horizontalPanel.add(login_);
	}
}
