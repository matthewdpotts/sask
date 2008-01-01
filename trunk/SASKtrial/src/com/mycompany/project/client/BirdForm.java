package com.mycompany.project.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Button;

public class BirdForm extends Composite {

	public BirdForm() {

		final FlowPanel flowPanel = new FlowPanel();
		initWidget(flowPanel);
		

		final Grid bird1 = new Grid();
		flowPanel.add(bird1);
		bird1.setBorderWidth(1);
		bird1.resize(3, 4);
		bird1.setWidth("100%");

		final Label ringersNameLabel = new Label("Ringer's Name:");
		bird1.setWidget(0, 0, ringersNameLabel);
		bird1.getCellFormatter().setWidth(0, 0, "150px");
		bird1.getCellFormatter().setHorizontalAlignment(0, 0, HasHorizontalAlignment.ALIGN_RIGHT);

		final Label refernceBookOrLabel = new Label("Refernce Book or Species List:");
		bird1.setWidget(1, 0, refernceBookOrLabel);
		bird1.getCellFormatter().setWidth(1, 0, "150px");
		bird1.getCellFormatter().setHorizontalAlignment(1, 0, HasHorizontalAlignment.ALIGN_RIGHT);

		final Label localitygpsLabel = new Label("Locality (GPS):");
		bird1.setWidget(2, 0, localitygpsLabel);
		bird1.getCellFormatter().setHorizontalAlignment(2, 0, HasHorizontalAlignment.ALIGN_RIGHT);

		final Label postalAddressLabel = new Label("Postal Address:");
		bird1.setWidget(0, 2, postalAddressLabel);
		bird1.getCellFormatter().setWidth(0, 2, "150px");
		bird1.getCellFormatter().setHorizontalAlignment(0, 2, HasHorizontalAlignment.ALIGN_RIGHT);

		final Label blank1 = new Label("");
		bird1.setWidget(1, 2, blank1);

		final Label authorLabel = new Label("Author:");
		bird1.setWidget(2, 2, authorLabel);
		bird1.getCellFormatter().setHorizontalAlignment(2, 2, HasHorizontalAlignment.ALIGN_RIGHT);

		final TextBox ringerName = new TextBox();
		bird1.setWidget(0, 1, ringerName);
		ringerName.setWidth("100%");

		final TextBox referenceBookList = new TextBox();
		bird1.setWidget(1, 1, referenceBookList);
		referenceBookList.setWidth("100%");

		final TextBox locality = new TextBox();
		bird1.setWidget(2, 1, locality);
		locality.setWidth("100%");

		final TextBox address_1 = new TextBox();
		bird1.setWidget(0, 3, address_1);
		address_1.setWidth("100%");

		final TextBox address_2 = new TextBox();
		bird1.setWidget(1, 3, address_2);
		address_2.setWidth("100%");

		final TextBox author = new TextBox();
		bird1.setWidget(2, 3, author);
		author.setWidth("100%");

		final Grid bird2 = new Grid();
		flowPanel.add(bird2);
		bird2.setBorderWidth(1);
		bird2.resize(26, 8);
		bird2.setWidth("100%");

		final Label st = new Label("ST");
		bird2.setWidget(0, 0, st);
		bird2.getCellFormatter().setHorizontalAlignment(0, 0, HasHorizontalAlignment.ALIGN_CENTER);
		bird2.getCellFormatter().setWidth(0, 0, "45px");

		final Label ringNo = new Label("Ring. No.");
		bird2.setWidget(0, 1, ringNo);
		bird2.getCellFormatter().setHorizontalAlignment(0, 1, HasHorizontalAlignment.ALIGN_CENTER);
		bird2.getCellFormatter().setWidth(0, 1, "75px");

		final Label rec = new Label("Rec.");
		bird2.setWidget(0, 2, rec);
		bird2.getCellFormatter().setHorizontalAlignment(0, 2, HasHorizontalAlignment.ALIGN_CENTER);
		bird2.getCellFormatter().setWidth(0, 2, "35px");

		final Label species = new Label("Species");
		bird2.setWidget(0, 3, species);
		bird2.getCellFormatter().setHorizontalAlignment(0, 3, HasHorizontalAlignment.ALIGN_CENTER);

		final Label ageSex = new Label("Age/Sex*");
		bird2.setWidget(0, 4, ageSex);
		bird2.getCellFormatter().setHorizontalAlignment(0, 4, HasHorizontalAlignment.ALIGN_CENTER);
		bird2.getCellFormatter().setWidth(0, 4, "50px");

		final Label dayMonth = new Label("Day/Month");
		bird2.setWidget(0, 5, dayMonth);
		bird2.getCellFormatter().setHorizontalAlignment(0, 5, HasHorizontalAlignment.ALIGN_CENTER);
		bird2.getCellFormatter().setWidth(0, 5, "50px");

		final Label time = new Label("Time (24hr)");
		bird2.setWidget(0, 6, time);
		bird2.getCellFormatter().setHorizontalAlignment(0, 6, HasHorizontalAlignment.ALIGN_CENTER);
		bird2.getCellFormatter().setWidth(0, 6, "50px");

		final Label comment = new Label("Comment");
		bird2.setWidget(0, 7, comment);
		bird2.getCellFormatter().setWidth(0, 7, "175px");
		bird2.getCellFormatter().setHorizontalAlignment(0, 7, HasHorizontalAlignment.ALIGN_CENTER);

		final TextBox st_1 = new TextBox();
		bird2.setWidget(1, 0, st_1);
		st_1.setWidth("100%");
		
		final TextBox st_2 = new TextBox();
		bird2.setWidget(2, 0, st_2);
		st_2.setWidth("100%");
		
		final TextBox st_3 = new TextBox();
		bird2.setWidget(3, 0, st_3);
		st_3.setWidth("100%");
		
		final TextBox st_4 = new TextBox();
		bird2.setWidget(4, 0, st_4);
		st_4.setWidth("100%");
		
		final TextBox st_5 = new TextBox();
		bird2.setWidget(5, 0, st_5);
		st_5.setWidth("100%");
		
		final TextBox st_6 = new TextBox();
		bird2.setWidget(6, 0, st_6);
		st_6.setWidth("100%");
		
		final TextBox st_7 = new TextBox();
		bird2.setWidget(7, 0, st_7);
		st_7.setWidth("100%");
		
		final TextBox st_8 = new TextBox();
		bird2.setWidget(8, 0, st_8);
		st_8.setWidth("100%");
		
		final TextBox st_9 = new TextBox();
		bird2.setWidget(9, 0, st_9);
		st_9.setWidth("100%");
		
		final TextBox st_10 = new TextBox();
		bird2.setWidget(10, 0, st_10);
		st_10.setWidth("100%");
		
		final TextBox st_11 = new TextBox();
		bird2.setWidget(11, 0, st_11);
		st_11.setWidth("100%");
		
		final TextBox st_12 = new TextBox();
		bird2.setWidget(12, 0, st_12);
		st_12.setWidth("100%");
		
		final TextBox st_13 = new TextBox();
		bird2.setWidget(13, 0, st_13);
		st_13.setWidth("100%");
		
		final TextBox st_14 = new TextBox();
		bird2.setWidget(14, 0, st_14);
		st_14.setWidth("100%");
		
		final TextBox st_15 = new TextBox();
		bird2.setWidget(15, 0, st_15);
		st_15.setWidth("100%");
		
		final TextBox st_16 = new TextBox();
		bird2.setWidget(16, 0, st_16);
		st_16.setWidth("100%");
		
		final TextBox st_17 = new TextBox();
		bird2.setWidget(17, 0, st_17);
		st_17.setWidth("100%");
		
		final TextBox st_18 = new TextBox();
		bird2.setWidget(18, 0, st_18);
		st_18.setWidth("100%");
		
		final TextBox st_19 = new TextBox();
		bird2.setWidget(19, 0, st_19);
		st_19.setWidth("100%");
		
		final TextBox st_20 = new TextBox();
		bird2.setWidget(20, 0, st_20);
		st_20.setWidth("100%");
		
		final TextBox st_21 = new TextBox();
		bird2.setWidget(21, 0, st_21);
		st_21.setWidth("100%");
		
		final TextBox st_22 = new TextBox();
		bird2.setWidget(22, 0, st_22);
		st_22.setWidth("100%");
		
		final TextBox st_23 = new TextBox();
		bird2.setWidget(23, 0, st_23);
		st_23.setWidth("100%");
		
		final TextBox st_24 = new TextBox();
		bird2.setWidget(24, 0, st_24);
		st_24.setWidth("100%");
		
		final TextBox st_25 = new TextBox();
		bird2.setWidget(25, 0, st_25);
		st_25.setWidth("100%");

		final TextBox ringNo_1 = new TextBox();
		bird2.setWidget(1, 1, ringNo_1);
		ringNo_1.setWidth("100%");
		
		final TextBox ringNo_2 = new TextBox();
		bird2.setWidget(2, 1, ringNo_2);
		ringNo_2.setWidth("100%");
		
		final TextBox ringNo_3 = new TextBox();
		bird2.setWidget(3, 1, ringNo_3);
		ringNo_3.setWidth("100%");
		
		final TextBox ringNo_4 = new TextBox();
		bird2.setWidget(4, 1, ringNo_4);
		ringNo_4.setWidth("100%");
		
		final TextBox ringNo_5 = new TextBox();
		bird2.setWidget(5, 1, ringNo_5);
		ringNo_5.setWidth("100%");
		
		final TextBox ringNo_6 = new TextBox();
		bird2.setWidget(6, 1, ringNo_6);
		ringNo_6.setWidth("100%");
		
		final TextBox ringNo_7 = new TextBox();
		bird2.setWidget(7, 1, ringNo_7);
		ringNo_7.setWidth("100%");
		
		final TextBox ringNo_8 = new TextBox();
		bird2.setWidget(8, 1, ringNo_8);
		ringNo_8.setWidth("100%");
		
		final TextBox ringNo_9 = new TextBox();
		bird2.setWidget(9, 1, ringNo_9);
		ringNo_9.setWidth("100%");
		
		final TextBox ringNo_10 = new TextBox();
		bird2.setWidget(10, 1, ringNo_10);
		ringNo_10.setWidth("100%");
		
		final TextBox ringNo_11 = new TextBox();
		bird2.setWidget(11, 1, ringNo_11);
		ringNo_11.setWidth("100%");
		
		final TextBox ringNo_12 = new TextBox();
		bird2.setWidget(12, 1, ringNo_12);
		ringNo_12.setWidth("100%");
		
		final TextBox ringNo_13 = new TextBox();
		bird2.setWidget(13, 1, ringNo_13);
		ringNo_13.setWidth("100%");
		
		final TextBox ringNo_14 = new TextBox();
		bird2.setWidget(14, 1, ringNo_14);
		ringNo_14.setWidth("100%");
		
		final TextBox ringNo_15 = new TextBox();
		bird2.setWidget(15, 1, ringNo_15);
		ringNo_15.setWidth("100%");
		
		final TextBox ringNo_16 = new TextBox();
		bird2.setWidget(16, 1, ringNo_16);
		ringNo_16.setWidth("100%");
		
		final TextBox ringNo_17 = new TextBox();
		bird2.setWidget(17, 1, ringNo_17);
		ringNo_17.setWidth("100%");
		
		final TextBox ringNo_18 = new TextBox();
		bird2.setWidget(18, 1, ringNo_18);
		ringNo_18.setWidth("100%");
		
		final TextBox ringNo_19 = new TextBox();
		bird2.setWidget(19, 1, ringNo_19);
		ringNo_19.setWidth("100%");
		
		final TextBox ringNo_20 = new TextBox();
		bird2.setWidget(20, 1, ringNo_20);
		ringNo_20.setWidth("100%");
		
		final TextBox ringNo_21 = new TextBox();
		bird2.setWidget(21, 1, ringNo_21);
		ringNo_21.setWidth("100%");
		
		final TextBox ringNo_22 = new TextBox();
		bird2.setWidget(22, 1, ringNo_22);
		ringNo_22.setWidth("100%");
		
		final TextBox ringNo_23 = new TextBox();
		bird2.setWidget(23, 1, ringNo_23);
		ringNo_23.setWidth("100%");
		
		final TextBox ringNo_24 = new TextBox();
		bird2.setWidget(24, 1, ringNo_24);
		ringNo_24.setWidth("100%");
		
		final TextBox ringNo_25 = new TextBox();
		bird2.setWidget(25, 1, ringNo_25);
		ringNo_25.setWidth("100%");

		final TextBox rec_1 = new TextBox();
		bird2.setWidget(1, 2, rec_1);
		rec_1.setWidth("100%");
		
		final TextBox rec_2 = new TextBox();
		bird2.setWidget(2, 2, rec_2);
		rec_2.setWidth("100%");
		
		final TextBox rec_3 = new TextBox();
		bird2.setWidget(3, 2, rec_3);
		rec_3.setWidth("100%");
		
		final TextBox rec_4 = new TextBox();
		bird2.setWidget(4, 2, rec_4);
		rec_4.setWidth("100%");
		
		final TextBox rec_5 = new TextBox();
		bird2.setWidget(5, 2, rec_5);
		rec_5.setWidth("100%");
		
		final TextBox rec_6 = new TextBox();
		bird2.setWidget(6, 2, rec_6);
		rec_6.setWidth("100%");
		
		final TextBox rec_7 = new TextBox();
		bird2.setWidget(7, 2, rec_7);
		rec_7.setWidth("100%");
		
		final TextBox rec_8 = new TextBox();
		bird2.setWidget(8, 2, rec_8);
		rec_8.setWidth("100%");
		
		final TextBox rec_9 = new TextBox();
		bird2.setWidget(9, 2, rec_9);
		rec_9.setWidth("100%");
		
		final TextBox rec_10 = new TextBox();
		bird2.setWidget(10, 2, rec_10);
		rec_10.setWidth("100%");
		
		final TextBox rec_11 = new TextBox();
		bird2.setWidget(11, 2, rec_11);
		rec_11.setWidth("100%");
		
		final TextBox rec_12 = new TextBox();
		bird2.setWidget(12, 2, rec_12);
		rec_12.setWidth("100%");
		
		final TextBox rec_13 = new TextBox();
		bird2.setWidget(13, 2, rec_13);
		rec_13.setWidth("100%");
		
		final TextBox rec_14 = new TextBox();
		bird2.setWidget(14, 2, rec_14);
		rec_14.setWidth("100%");
		
		final TextBox rec_15 = new TextBox();
		bird2.setWidget(15, 2, rec_15);
		rec_15.setWidth("100%");
		
		final TextBox rec_16 = new TextBox();
		bird2.setWidget(16, 2, rec_16);
		rec_16.setWidth("100%");
		
		final TextBox rec_17 = new TextBox();
		bird2.setWidget(17, 2, rec_17);
		rec_17.setWidth("100%");
		
		final TextBox rec_18 = new TextBox();
		bird2.setWidget(18, 2, rec_18);
		rec_18.setWidth("100%");
		
		final TextBox rec_19 = new TextBox();
		bird2.setWidget(19, 2, rec_19);
		rec_19.setWidth("100%");
		
		final TextBox rec_20 = new TextBox();
		bird2.setWidget(20, 2, rec_20);
		rec_20.setWidth("100%");
		
		final TextBox rec_21 = new TextBox();
		bird2.setWidget(21, 2, rec_21);
		rec_21.setWidth("100%");
		
		final TextBox rec_22 = new TextBox();
		bird2.setWidget(22, 2, rec_22);
		rec_22.setWidth("100%");
		
		final TextBox rec_23 = new TextBox();
		bird2.setWidget(23, 2, rec_23);
		rec_23.setWidth("100%");
		
		final TextBox rec_24 = new TextBox();
		bird2.setWidget(24, 2, rec_24);
		rec_24.setWidth("100%");
		
		final TextBox rec_25 = new TextBox();
		bird2.setWidget(25, 2, rec_25);
		rec_25.setWidth("100%");

		final TextBox species_1 = new TextBox();
		bird2.setWidget(1, 3, species_1);
		species_1.setWidth("100%");
		
		final TextBox species_2 = new TextBox();
		bird2.setWidget(2, 3, species_2);
		species_2.setWidth("100%");
		
		final TextBox species_3 = new TextBox();
		bird2.setWidget(3, 3, species_3);
		species_3.setWidth("100%");
		
		final TextBox species_4 = new TextBox();
		bird2.setWidget(4, 3, species_4);
		species_4.setWidth("100%");
		
		final TextBox species_5 = new TextBox();
		bird2.setWidget(5, 3, species_5);
		species_5.setWidth("100%");
		
		final TextBox species_6 = new TextBox();
		bird2.setWidget(6, 3, species_6);
		species_6.setWidth("100%");
		
		final TextBox species_7 = new TextBox();
		bird2.setWidget(7, 3, species_7);
		species_7.setWidth("100%");
		
		final TextBox species_8 = new TextBox();
		bird2.setWidget(8, 3, species_8);
		species_8.setWidth("100%");
		
		final TextBox species_9 = new TextBox();
		bird2.setWidget(9, 3, species_9);
		species_9.setWidth("100%");
		
		final TextBox species_10 = new TextBox();
		bird2.setWidget(10, 3, species_10);
		species_10.setWidth("100%");
		
		final TextBox species_11 = new TextBox();
		bird2.setWidget(11, 3, species_11);
		species_11.setWidth("100%");
		
		final TextBox species_12 = new TextBox();
		bird2.setWidget(12, 3, species_12);
		species_12.setWidth("100%");
		
		final TextBox species_13 = new TextBox();
		bird2.setWidget(13, 3, species_13);
		species_13.setWidth("100%");
		
		final TextBox species_14 = new TextBox();
		bird2.setWidget(14, 3, species_14);
		species_14.setWidth("100%");
		
		final TextBox species_15 = new TextBox();
		bird2.setWidget(15, 3, species_15);
		species_15.setWidth("100%");
		
		final TextBox species_16 = new TextBox();
		bird2.setWidget(16, 3, species_16);
		species_16.setWidth("100%");
		
		final TextBox species_17 = new TextBox();
		bird2.setWidget(17, 3, species_17);
		species_17.setWidth("100%");
		
		final TextBox species_18 = new TextBox();
		bird2.setWidget(18, 3, species_18);
		species_18.setWidth("100%");
		
		final TextBox species_19 = new TextBox();
		bird2.setWidget(19, 3, species_19);
		species_19.setWidth("100%");
		
		final TextBox species_20 = new TextBox();
		bird2.setWidget(20, 3, species_20);
		species_20.setWidth("100%");
		
		final TextBox species_21 = new TextBox();
		bird2.setWidget(21, 3, species_21);
		species_21.setWidth("100%");
		
		final TextBox species_22 = new TextBox();
		bird2.setWidget(22, 3, species_22);
		species_22.setWidth("100%");
		
		final TextBox species_23 = new TextBox();
		bird2.setWidget(23, 3, species_23);
		species_23.setWidth("100%");
		
		final TextBox species_24 = new TextBox();
		bird2.setWidget(24, 3, species_24);
		species_24.setWidth("100%");
		
		final TextBox species_25 = new TextBox();
		bird2.setWidget(25, 3, species_25);
		species_25.setWidth("100%");

		final TextBox ageSex_1 = new TextBox();
		bird2.setWidget(1, 4, ageSex_1);
		ageSex_1.setWidth("100%");
		
		final TextBox ageSex_2 = new TextBox();
		bird2.setWidget(2, 4, ageSex_2);
		ageSex_2.setWidth("100%");
		
		final TextBox ageSex_3 = new TextBox();
		bird2.setWidget(3, 4, ageSex_3);
		ageSex_3.setWidth("100%");
		
		final TextBox ageSex_4 = new TextBox();
		bird2.setWidget(4, 4, ageSex_4);
		ageSex_4.setWidth("100%");
		
		final TextBox ageSex_5 = new TextBox();
		bird2.setWidget(5, 4, ageSex_5);
		ageSex_5.setWidth("100%");
		
		final TextBox ageSex_6 = new TextBox();
		bird2.setWidget(6, 4, ageSex_6);
		ageSex_6.setWidth("100%");
		
		final TextBox ageSex_7 = new TextBox();
		bird2.setWidget(7, 4, ageSex_7);
		ageSex_7.setWidth("100%");
		
		final TextBox ageSex_8 = new TextBox();
		bird2.setWidget(8, 4, ageSex_8);
		ageSex_8.setWidth("100%");
		
		final TextBox ageSex_9 = new TextBox();
		bird2.setWidget(9, 4, ageSex_9);
		ageSex_9.setWidth("100%");
		
		final TextBox ageSex_10 = new TextBox();
		bird2.setWidget(10, 4, ageSex_10);
		ageSex_10.setWidth("100%");
		
		final TextBox ageSex_11 = new TextBox();
		bird2.setWidget(11, 4, ageSex_11);
		ageSex_11.setWidth("100%");
		
		final TextBox ageSex_12 = new TextBox();
		bird2.setWidget(12, 4, ageSex_12);
		ageSex_12.setWidth("100%");
		
		final TextBox ageSex_13 = new TextBox();
		bird2.setWidget(13, 4, ageSex_13);
		ageSex_13.setWidth("100%");
		
		final TextBox ageSex_14 = new TextBox();
		bird2.setWidget(14, 4, ageSex_14);
		ageSex_14.setWidth("100%");
		
		final TextBox ageSex_15 = new TextBox();
		bird2.setWidget(15, 4, ageSex_15);
		ageSex_15.setWidth("100%");
		
		final TextBox ageSex_16 = new TextBox();
		bird2.setWidget(16, 4, ageSex_16);
		ageSex_16.setWidth("100%");
		
		final TextBox ageSex_17 = new TextBox();
		bird2.setWidget(17, 4, ageSex_17);
		ageSex_17.setWidth("100%");
		
		final TextBox ageSex_18 = new TextBox();
		bird2.setWidget(18, 4, ageSex_18);
		ageSex_18.setWidth("100%");
		
		final TextBox ageSex_19 = new TextBox();
		bird2.setWidget(19, 4, ageSex_19);
		ageSex_19.setWidth("100%");
		
		final TextBox ageSex_20 = new TextBox();
		bird2.setWidget(20, 4, ageSex_20);
		ageSex_20.setWidth("100%");
		
		final TextBox ageSex_21 = new TextBox();
		bird2.setWidget(21, 4, ageSex_21);
		ageSex_21.setWidth("100%");
		
		final TextBox ageSex_22 = new TextBox();
		bird2.setWidget(22, 4, ageSex_22);
		ageSex_22.setWidth("100%");
		
		final TextBox ageSex_23 = new TextBox();
		bird2.setWidget(23, 4, ageSex_23);
		ageSex_23.setWidth("100%");
		
		final TextBox ageSex_24 = new TextBox();
		bird2.setWidget(24, 4, ageSex_24);
		ageSex_24.setWidth("100%");
		
		final TextBox ageSex_25 = new TextBox();
		bird2.setWidget(25, 4, ageSex_25);
		ageSex_25.setWidth("100%");

		final TextBox dayMonth_1 = new TextBox();
		bird2.setWidget(1, 5, dayMonth_1);
		dayMonth_1.setWidth("100%");
		
		final TextBox dayMonth_2 = new TextBox();
		bird2.setWidget(2, 5, dayMonth_2);
		dayMonth_2.setWidth("100%");
		
		final TextBox dayMonth_3 = new TextBox();
		bird2.setWidget(3, 5, dayMonth_3);
		dayMonth_3.setWidth("100%");
		
		final TextBox dayMonth_4 = new TextBox();
		bird2.setWidget(4, 5, dayMonth_4);
		dayMonth_4.setWidth("100%");
		
		final TextBox dayMonth_5 = new TextBox();
		bird2.setWidget(5, 5, dayMonth_5);
		dayMonth_5.setWidth("100%");
		
		final TextBox dayMonth_6 = new TextBox();
		bird2.setWidget(6, 5, dayMonth_6);
		dayMonth_6.setWidth("100%");
		
		final TextBox dayMonth_7 = new TextBox();
		bird2.setWidget(7, 5, dayMonth_7);
		dayMonth_7.setWidth("100%");
		
		final TextBox dayMonth_8 = new TextBox();
		bird2.setWidget(8, 5, dayMonth_8);
		dayMonth_8.setWidth("100%");
		
		final TextBox dayMonth_9 = new TextBox();
		bird2.setWidget(9, 5, dayMonth_9);
		dayMonth_9.setWidth("100%");
		
		final TextBox dayMonth_10 = new TextBox();
		bird2.setWidget(10, 5, dayMonth_10);
		dayMonth_10.setWidth("100%");
		
		final TextBox dayMonth_11 = new TextBox();
		bird2.setWidget(11, 5, dayMonth_11);
		dayMonth_11.setWidth("100%");
		
		final TextBox dayMonth_12 = new TextBox();
		bird2.setWidget(12, 5, dayMonth_12);
		dayMonth_12.setWidth("100%");
		
		final TextBox dayMonth_13 = new TextBox();
		bird2.setWidget(13, 5, dayMonth_13);
		dayMonth_13.setWidth("100%");
		
		final TextBox dayMonth_14 = new TextBox();
		bird2.setWidget(14, 5, dayMonth_14);
		dayMonth_14.setWidth("100%");
		
		final TextBox dayMonth_15 = new TextBox();
		bird2.setWidget(15, 5, dayMonth_15);
		dayMonth_15.setWidth("100%");
		
		final TextBox dayMonth_16 = new TextBox();
		bird2.setWidget(16, 5, dayMonth_16);
		dayMonth_16.setWidth("100%");
		
		final TextBox dayMonth_17 = new TextBox();
		bird2.setWidget(17, 5, dayMonth_17);
		dayMonth_17.setWidth("100%");
		
		final TextBox dayMonth_18 = new TextBox();
		bird2.setWidget(18, 5, dayMonth_18);
		dayMonth_18.setWidth("100%");
		
		final TextBox dayMonth_19 = new TextBox();
		bird2.setWidget(19, 5, dayMonth_19);
		dayMonth_19.setWidth("100%");
		
		final TextBox dayMonth_20 = new TextBox();
		bird2.setWidget(20, 5, dayMonth_20);
		dayMonth_20.setWidth("100%");
		
		final TextBox dayMonth_21 = new TextBox();
		bird2.setWidget(21, 5, dayMonth_21);
		dayMonth_21.setWidth("100%");
		
		final TextBox dayMonth_22 = new TextBox();
		bird2.setWidget(22, 5, dayMonth_22);
		dayMonth_22.setWidth("100%");
		
		final TextBox dayMonth_23 = new TextBox();
		bird2.setWidget(23, 5, dayMonth_23);
		dayMonth_23.setWidth("100%");
		
		final TextBox dayMonth_24 = new TextBox();
		bird2.setWidget(24, 5, dayMonth_24);
		dayMonth_24.setWidth("100%");
		
		final TextBox dayMonth_25 = new TextBox();
		bird2.setWidget(25, 5, dayMonth_25);
		dayMonth_25.setWidth("100%");

		final TextBox time_1 = new TextBox();
		bird2.setWidget(1, 6, time_1);
		time_1.setWidth("100%");
		
		final TextBox time_2 = new TextBox();
		bird2.setWidget(2, 6, time_2);
		time_2.setWidth("100%");
		
		final TextBox time_3 = new TextBox();
		bird2.setWidget(3, 6, time_3);
		time_3.setWidth("100%");
		
		final TextBox time_4 = new TextBox();
		bird2.setWidget(4, 6, time_4);
		time_4.setWidth("100%");
		
		final TextBox time_5 = new TextBox();
		bird2.setWidget(5, 6, time_5);
		time_5.setWidth("100%");
		
		final TextBox time_6 = new TextBox();
		bird2.setWidget(6, 6, time_6);
		time_6.setWidth("100%");
		
		final TextBox time_7 = new TextBox();
		bird2.setWidget(7, 6, time_7);
		time_7.setWidth("100%");
		
		final TextBox time_8 = new TextBox();
		bird2.setWidget(8, 6, time_8);
		time_8.setWidth("100%");
		
		final TextBox time_9 = new TextBox();
		bird2.setWidget(9, 6, time_9);
		time_9.setWidth("100%");
		
		final TextBox time_10 = new TextBox();
		bird2.setWidget(10, 6, time_10);
		time_10.setWidth("100%");
		
		final TextBox time_11 = new TextBox();
		bird2.setWidget(11, 6, time_11);
		time_11.setWidth("100%");
		
		final TextBox time_12 = new TextBox();
		bird2.setWidget(12, 6, time_12);
		time_12.setWidth("100%");
		
		final TextBox time_13 = new TextBox();
		bird2.setWidget(13, 6, time_13);
		time_13.setWidth("100%");
		
		final TextBox time_14 = new TextBox();
		bird2.setWidget(14, 6, time_14);
		time_14.setWidth("100%");
		
		final TextBox time_15 = new TextBox();
		bird2.setWidget(15, 6, time_15);
		time_15.setWidth("100%");
		
		final TextBox time_16 = new TextBox();
		bird2.setWidget(16, 6, time_16);
		time_16.setWidth("100%");
		
		final TextBox time_17 = new TextBox();
		bird2.setWidget(17, 6, time_17);
		time_17.setWidth("100%");
		
		final TextBox time_18 = new TextBox();
		bird2.setWidget(18, 6, time_18);
		time_18.setWidth("100%");
		
		final TextBox time_19 = new TextBox();
		bird2.setWidget(19, 6, time_19);
		time_19.setWidth("100%");
		
		final TextBox time_20 = new TextBox();
		bird2.setWidget(20, 6, time_20);
		time_20.setWidth("100%");
		
		final TextBox time_21 = new TextBox();
		bird2.setWidget(21, 6, time_21);
		time_21.setWidth("100%");
		
		final TextBox time_22 = new TextBox();
		bird2.setWidget(22, 6, time_22);
		time_22.setWidth("100%");
		
		final TextBox time_23 = new TextBox();
		bird2.setWidget(23, 6, time_23);
		time_23.setWidth("100%");
		
		final TextBox time_24 = new TextBox();
		bird2.setWidget(24, 6, time_24);
		time_24.setWidth("100%");
		
		final TextBox time_25 = new TextBox();
		bird2.setWidget(25, 6, time_25);
		time_25.setWidth("100%");

		final TextBox comment_1 = new TextBox();
		bird2.setWidget(1, 7, comment_1);
		comment_1.setWidth("100%");
		
		final TextBox comment_2 = new TextBox();
		bird2.setWidget(2, 7, comment_2);
		comment_2.setWidth("100%");
		
		final TextBox comment_3 = new TextBox();
		bird2.setWidget(3, 7, comment_3);
		comment_3.setWidth("100%");
		
		final TextBox comment_4 = new TextBox();
		bird2.setWidget(4, 7, comment_4);
		comment_4.setWidth("100%");
		
		final TextBox comment_5 = new TextBox();
		bird2.setWidget(5, 7, comment_5);
		comment_5.setWidth("100%");
		
		final TextBox comment_6 = new TextBox();
		bird2.setWidget(6, 7, comment_6);
		comment_6.setWidth("100%");
		
		final TextBox comment_7 = new TextBox();
		bird2.setWidget(7, 7, comment_7);
		comment_7.setWidth("100%");
		
		final TextBox comment_8 = new TextBox();
		bird2.setWidget(8, 7, comment_8);
		comment_8.setWidth("100%");
		
		final TextBox comment_9 = new TextBox();
		bird2.setWidget(9, 7, comment_9);
		comment_9.setWidth("100%");
		
		final TextBox comment_10 = new TextBox();
		bird2.setWidget(10, 7, comment_10);
		comment_10.setWidth("100%");
		
		final TextBox comment_11 = new TextBox();
		bird2.setWidget(11, 7, comment_11);
		comment_11.setWidth("100%");
		
		final TextBox comment_12 = new TextBox();
		bird2.setWidget(12, 7, comment_12);
		comment_12.setWidth("100%");
		
		final TextBox comment_13 = new TextBox();
		bird2.setWidget(13, 7, comment_13);
		comment_13.setWidth("100%");
		
		final TextBox comment_14 = new TextBox();
		bird2.setWidget(14, 7, comment_14);
		comment_14.setWidth("100%");
		
		final TextBox comment_15 = new TextBox();
		bird2.setWidget(15, 7, comment_15);
		comment_15.setWidth("100%");
		
		final TextBox comment_16 = new TextBox();
		bird2.setWidget(16, 7, comment_16);
		comment_16.setWidth("100%");
		
		final TextBox comment_17 = new TextBox();
		bird2.setWidget(17, 7, comment_17);
		comment_17.setWidth("100%");
		
		final TextBox comment_18 = new TextBox();
		bird2.setWidget(18, 7, comment_18);
		comment_18.setWidth("100%");
		
		final TextBox comment_19 = new TextBox();
		bird2.setWidget(19, 7, comment_19);
		comment_19.setWidth("100%");
		
		final TextBox comment_20 = new TextBox();
		bird2.setWidget(20, 7, comment_20);
		comment_20.setWidth("100%");
		
		final TextBox comment_21 = new TextBox();
		bird2.setWidget(21, 7, comment_21);
		comment_21.setWidth("100%");
		
		final TextBox comment_22 = new TextBox();
		bird2.setWidget(22, 7, comment_22);
		comment_22.setWidth("100%");
		
		final TextBox comment_23 = new TextBox();
		bird2.setWidget(23, 7, comment_23);
		comment_23.setWidth("100%");
		
		final TextBox comment_24 = new TextBox();
		bird2.setWidget(24, 7, comment_24);
		comment_24.setWidth("100%");
		
		final TextBox comment_25 = new TextBox();
		bird2.setWidget(25, 7, comment_25);
		comment_25.setWidth("100%");
		
		final Grid bird3 = new Grid();
		flowPanel.add(bird3);
		bird3.setBorderWidth(1);
		bird3.resize(7, 1);
		bird3.setWidth("100%");
		
		final Label abbreviations = new Label("* Use the Following Abbreviations:");
		bird3.setWidget(0, 0, abbreviations);
		bird3.getCellFormatter().setWidth(0, 0, "300px");
		
		final Label pull = new Label("Pull = nestling or young bird unable to fly.");
		bird3.setWidget(1, 0, pull);
		bird3.getCellFormatter().setWidth(0, 0, "150px");
		
		final Label juv = new Label("Juv. = immature, but able to fly freely; recognised by behaviour, plumaged or other features, e.g. leg or gape colour.");
		bird3.setWidget(2, 0, juv);
		bird3.getCellFormatter().setWidth(0, 0, "150px");
		
		final Label adult = new Label("Ad. = adult, in definitive adult plumage.");
		bird3.setWidget(3, 0, adult);
		bird3.getCellFormatter().setWidth(0, 0, "150px");
		
		final Label fullGrown = new Label("F.G. = full grown and able to fly freely, age uncertain.");
		bird3.setWidget(4, 0, fullGrown);
		bird3.getCellFormatter().setWidth(0, 0, "150px");
		
		final Label male = new Label("M = male.");
		bird3.setWidget(5, 0, male);
		bird3.getCellFormatter().setWidth(0, 0, "150px");
		
		final Label female = new Label("F = female.");
		bird3.setWidget(6, 0, female);
		bird3.getCellFormatter().setWidth(0, 0, "150px");
		
		final Button submit = new Button("Submit");
		flowPanel.add(submit);
		
		

	}

}
