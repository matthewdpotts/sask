package com.mycompany.project.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SourcesTabEvents;
import com.google.gwt.user.client.ui.TabListener;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.TabBar;
import com.mycompany.project.client.batForm1;


public class batHome extends Composite {

	public batHome() {
		final VerticalPanel verticalPanel = new VerticalPanel();
		initWidget(verticalPanel);
		
		final batForm1 bat_1 = new batForm1();
		
		final TabBar batTabs = new TabBar();
		verticalPanel.add(batTabs);
		
		batTabs.addTab("Bat Data Sheet");
		
		batTabs.addTabListener(new TabListener() {
		      public void onTabSelected(SourcesTabEvents sender, int tabIndex) {
		    	  if(tabIndex==0){
		    		  verticalPanel.clear();
		    		  verticalPanel.add(batTabs);
		    		  verticalPanel.add(bat_1);
		    	  }
		      }
		      public boolean onBeforeTabSelected(SourcesTabEvents sender,
			          int tabIndex) {
			        return true;
		      }
		});
		
	}

}
