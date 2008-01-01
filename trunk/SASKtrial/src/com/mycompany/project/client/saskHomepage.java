package com.mycompany.project.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.mycompany.project.client.treeHome;
import com.google.gwt.user.client.ui.Button;
import com.mycompany.project.client.BirdForm;


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */

public class saskHomepage implements EntryPoint {
	public void onModuleLoad() {
		RootPanel.get();
		RootPanel rootPanel = RootPanel.get();
		rootPanel.setSize("1196px", "10000px");
		
		
		final HTML html = new HTML("<a href = 'file:///C:/Documents%20and%20Settings/James%20Mcaul/Desktop/Attempted%20Deployment/loginManager/loginManager.html'>Login</a>");
		rootPanel.add(html, 709, 0);
		
		final treeHome treeMain = new treeHome();
		final BirdForm birdMain = new BirdForm();


		final TabPanel homeTab = new TabPanel();
		homeTab.add(new HTML("This is going to be the future home page of SASK."),"Home");
		homeTab.add(treeMain,"Tree");
		homeTab.add(new HTML("Bats Page"),"Bats");
		homeTab.add(birdMain, "Birds");
		homeTab.add(new HTML("Ants Page"),"Ants");
		rootPanel.add(homeTab, 195, 70);
		homeTab.setSize("997px", "705px");

		final Image humming = new Image();
		rootPanel.add(humming, 0, 0);
		humming.setSize("196px", "205px");
		humming.setUrl("hummingbird.jpg");

		final VerticalPanel verticalPanel = new VerticalPanel();
		rootPanel.add(verticalPanel, 0, 204);
		verticalPanel.setStyleName("gwt-saskHomeVerticalPanel");
		verticalPanel.setSize("196px", "574px");

		final Label label = new Label("Search It.");
		verticalPanel.add(label);
		verticalPanel.setCellHeight(label, "40px");

		final Label analLabel = new Label("Analyze It.");
		verticalPanel.add(analLabel);
		verticalPanel.setCellHeight(analLabel, "40px");

		final Label sometLabel = new Label("Something It.");
		verticalPanel.add(sometLabel);
		verticalPanel.setCellHeight(sometLabel, "40px");

		final Label knowItLabel = new Label("Know It.");
		verticalPanel.add(knowItLabel);
		homeTab.selectTab(0);
		
		
		
		
		
	}
}
