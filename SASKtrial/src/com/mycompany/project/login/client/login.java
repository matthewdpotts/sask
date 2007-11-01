package com.mycompany.project.login.client;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.Window;

public class login extends Composite {

	public login() {

		final VerticalPanel verticalPanel = new VerticalPanel();
		initWidget(verticalPanel);

		final Label signIntoYourLabel = new Label("Sign into your account:");
		verticalPanel.add(signIntoYourLabel);

		final FlexTable flexTable = new FlexTable();
		verticalPanel.add(flexTable);
		flexTable.setWidth("300px");

		final Label usernameLabel = new Label("Username:");
		flexTable.setWidget(0, 0, usernameLabel);

		final TextBox textBoxUsername = new TextBox();
		flexTable.setWidget(0, 1, textBoxUsername);
		textBoxUsername.setWidth("100%");

		final Label passwordLabel = new Label("Password:");
		flexTable.setWidget(1, 0, passwordLabel);
		passwordLabel.setSize("0px", "0px");

		final TextBox textBoxPassword = new TextBox();
		flexTable.setWidget(1, 1, textBoxPassword);
		textBoxPassword.setWidth("100%");

		final CheckBox rememberMeOnCheckBox = new CheckBox();
		flexTable.setWidget(2, 1, rememberMeOnCheckBox);
		rememberMeOnCheckBox.setText("Remember me on this computer.");

		final Button signInButton = new Button();
		flexTable.setWidget(3, 1, signInButton);
		signInButton.addClickListener(new ClickListener() {
			public void onClick(final Widget sender) {
				if (textBoxUsername.getText().length() == 0 || textBoxPassword.getText().length() == 0) {                      
					Window.alert("Username or password is empty.");  
				}
			}
		});
		signInButton.setText("Sign In");
	}

}
