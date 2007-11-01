package com.mycompany.project.client;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;

public class treeHome extends Composite {

	public treeHome() {

		final FlexTable flexTable = new FlexTable();
		initWidget(flexTable);

		final Label entreeLabel = new Label("Enter Tree Data");
		flexTable.setWidget(0, 1, entreeLabel);

		final Label subplotLabel = new Label("Subplot");
		flexTable.setWidget(1, 0, subplotLabel);

		final TextBox textBox = new TextBox();
		flexTable.setWidget(1, 1, textBox);
		textBox.setWidth("100%");

		final Label quadrateLabel = new Label("Quadrate");
		flexTable.setWidget(2, 0, quadrateLabel);

		final TextBox textBox_1 = new TextBox();
		flexTable.setWidget(2, 1, textBox_1);
		textBox_1.setWidth("100%");

		final Label treeLabel = new Label("Tree #");
		flexTable.setWidget(3, 0, treeLabel);

		final Label identificationLabel = new Label("Identification");
		flexTable.setWidget(4, 0, identificationLabel);

		final Label dbhLabel = new Label("DBH");
		flexTable.setWidget(5, 0, dbhLabel);

		final Label heightLabel = new Label("Height");
		flexTable.setWidget(6, 0, heightLabel);

		final TextBox textBox_2 = new TextBox();
		flexTable.setWidget(3, 1, textBox_2);
		textBox_2.setWidth("100%");

		final TextBox textBox_3 = new TextBox();
		flexTable.setWidget(4, 1, textBox_3);
		textBox_3.setWidth("100%");

		final TextBox textBox_4 = new TextBox();
		flexTable.setWidget(5, 1, textBox_4);
		textBox_4.setWidth("100%");

		final TextBox textBox_5 = new TextBox();
		flexTable.setWidget(6, 1, textBox_5);
		textBox_5.setWidth("100%");

		final Button submitButton = new Button();
		flexTable.setWidget(7, 1, submitButton);
		submitButton.setText("Submit");

	}

}
