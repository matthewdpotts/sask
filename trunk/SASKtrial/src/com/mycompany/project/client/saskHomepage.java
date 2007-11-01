package com.mycompany.project.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SourcesTabEvents;
import com.google.gwt.user.client.ui.TabBar;
import com.google.gwt.user.client.ui.TabListener;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.FlexTable;
import com.mycompany.project.client.treeHome;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */

public class saskHomepage implements EntryPoint {
	public void onModuleLoad() {
		RootPanel.get();
		RootPanel rootPanel = RootPanel.get();

		final VerticalPanel homeVerticalPanel = new VerticalPanel();
		rootPanel.add(homeVerticalPanel, 0, 0);
		homeVerticalPanel.setSize("196px", "778px");
		homeVerticalPanel.setStyleName("gwt-saskHomeVerticalPanel");

		final Image image = new Image();
		homeVerticalPanel.add(image);
		image.setSize("196px", "215px");
		image.setUrl("hummingbird.jpg");

		final Label searchIt = new Label("Search It.");
		homeVerticalPanel.add(searchIt);

		final Label anaylzeIt = new Label("Analyze It.");
		homeVerticalPanel.add(anaylzeIt);

		final Label somethingIt = new Label("Something It.");
		homeVerticalPanel.add(somethingIt);

		final Label knowIt = new Label("Know It.");
		homeVerticalPanel.add(knowIt);
		
		
		final HTML html = new HTML("<a href = 'file:///C:/Documents%20and%20Settings/James%20Mcaul/Desktop/Attempted%20Deployment/loginManager/loginManager.html'>Login</a>");
		rootPanel.add(html, 709, 0);
		
		treeHome treeMain = new treeHome();

		final TabPanel homeTab = new TabPanel();
		homeTab.add(new HTML("This is going to be the future home page of SASK."),"Home");
		homeTab.add(treeMain,"Tree");
		homeTab.add(new HTML("Bats Page"),"Bats");
		homeTab.add(new HTML("Birds Page"),"Birds");
		homeTab.add(new HTML("Ants Page"),"Ants");
		rootPanel.add(homeTab, 195, 78);
		homeTab.setSize("636px", "18px");
		homeTab.selectTab(0);
		
		
	}
}
