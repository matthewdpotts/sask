package com.mycompany.project.client;

import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DeckPanel;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.TabBar;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.TabListener;
import com.google.gwt.user.client.ui.SourcesTabEvents;
import com.google.gwt.user.client.Window;
import com.mycompany.project.client.tree1;
import com.mycompany.project.client.tree2;
import com.mycompany.project.client.tree3;


public class treeHome extends Composite {

	public treeHome() {

	    final VerticalPanel verticalPanel = new VerticalPanel();
	    initWidget(verticalPanel);
	    
	    final tree1 treeForm1 = new tree1();
	    final tree2 treeForm2 = new tree2();
	    final tree3 treeForm3 = new tree3();
	    
	    final TabBar tabBar = new TabBar();
	    verticalPanel.add(tabBar);

	    tabBar.addTab("Form 1");
	    tabBar.addTab("Form 2");
	    tabBar.addTab("Form 3");

	    // Hook up a tab listener to do something when the user selects a tab.
	    tabBar.addTabListener(new TabListener() {
	      public void onTabSelected(SourcesTabEvents sender, int tabIndex) {
	    	  if(tabIndex==0){
	    		  verticalPanel.clear();
	    		  verticalPanel.add(tabBar);
	    		  verticalPanel.add(treeForm1);
	    	  }else{
	    			  if(tabIndex == 1){
	    				  verticalPanel.clear();
	    				  verticalPanel.add(tabBar);
	    				  verticalPanel.add(treeForm2);
	    			  }else{
	    				  if(tabIndex == 2){
	    						verticalPanel.clear();
	    						verticalPanel.add(tabBar);
	    						verticalPanel.add(treeForm3);
	    				  }
	    			  }
	    			  
	    		  }
	    	  }
	      
	    
	      public boolean onBeforeTabSelected(SourcesTabEvents sender,
	          int tabIndex) {
	        return true;
	      }
	    });




		
		

	}

}
