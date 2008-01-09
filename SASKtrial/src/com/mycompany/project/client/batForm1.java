package com.mycompany.project.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Button;

public class batForm1 extends Composite {

	public batForm1() {

		final FlowPanel flowPanel = new FlowPanel();
		initWidget(flowPanel);
		
		final Grid batGrid = new Grid();
		batGrid.setWidth("100%");
		batGrid.setHeight("100%");
		batGrid.setBorderWidth(1);
		batGrid.resize(14,14);
		
		flowPanel.add(batGrid);

		final Label stLabel = new Label("ST");
		batGrid.setWidget(0, 0, stLabel);
		batGrid.getCellFormatter().setHorizontalAlignment(0, 0, HasHorizontalAlignment.ALIGN_CENTER);

		final Label captureLabel = new Label("CAPTURE");
		batGrid.setWidget(0, 1, captureLabel);
		batGrid.getCellFormatter().setHorizontalAlignment(0, 1, HasHorizontalAlignment.ALIGN_CENTER);

		final Label bandLabel = new Label("BAND");
		batGrid.setWidget(0, 2, bandLabel);
		batGrid.getCellFormatter().setHorizontalAlignment(0, 2, HasHorizontalAlignment.ALIGN_CENTER);

		final Label rLabel = new Label("R");
		batGrid.setWidget(0, 3, rLabel);
		batGrid.getCellFormatter().setWidth(0, 3, "25px");
		batGrid.getCellFormatter().setHorizontalAlignment(0, 3, HasHorizontalAlignment.ALIGN_CENTER);

		final Label dateLabel = new Label("DATE");
		batGrid.setWidget(0, 4, dateLabel);
		batGrid.getCellFormatter().setHorizontalAlignment(0, 4, HasHorizontalAlignment.ALIGN_CENTER);

		final Label timeLabel = new Label("TIME");
		batGrid.setWidget(0, 5, timeLabel);
		batGrid.getCellFormatter().setHorizontalAlignment(0, 5, HasHorizontalAlignment.ALIGN_CENTER);

		final Label trapLabel = new Label("TRAP");
		batGrid.setWidget(0, 6, trapLabel);
		batGrid.getCellFormatter().setHorizontalAlignment(0, 6, HasHorizontalAlignment.ALIGN_CENTER);

		final Label sppLabel = new Label("SPP");
		batGrid.setWidget(0, 7, sppLabel);
		batGrid.getCellFormatter().setHorizontalAlignment(0, 7, HasHorizontalAlignment.ALIGN_CENTER);

		final Label sexLabel = new Label("SEX");
		batGrid.setWidget(0, 8, sexLabel);
		batGrid.getCellFormatter().setHorizontalAlignment(0, 8, HasHorizontalAlignment.ALIGN_CENTER);
		
		final Label ageLabel = new Label("AGE");
		batGrid.setWidget(0, 9, ageLabel);
		batGrid.getCellFormatter().setHorizontalAlignment(0, 9, HasHorizontalAlignment.ALIGN_CENTER);
		
		final Label repLabel = new Label("REP");
		batGrid.setWidget(0, 10, repLabel);
		batGrid.getCellFormatter().setHorizontalAlignment(0, 10, HasHorizontalAlignment.ALIGN_CENTER);
		
		final Label faLabel = new Label("FA");
		batGrid.setWidget(0, 11, faLabel);
		batGrid.getCellFormatter().setHorizontalAlignment(0, 11, HasHorizontalAlignment.ALIGN_CENTER);
		
		final Label wgtLabel = new Label("WGT");
		batGrid.setWidget(0, 12, wgtLabel);
		batGrid.getCellFormatter().setHorizontalAlignment(0, 12, HasHorizontalAlignment.ALIGN_CENTER);
		
		final Label commentsLabel = new Label("COMMENTS");
		batGrid.setWidget(0, 13, commentsLabel);
		batGrid.getCellFormatter().setHorizontalAlignment(0, 13, HasHorizontalAlignment.ALIGN_CENTER);

		final TextBox st_1 = new TextBox();
		batGrid.setWidget(1, 0, st_1);
		st_1.setWidth("100%");
		
		final TextBox st_2 = new TextBox();
		batGrid.setWidget(2, 0, st_2);
		st_2.setWidth("100%");
		
		final TextBox st_3 = new TextBox();
		batGrid.setWidget(3, 0, st_3);
		st_3.setWidth("100%");
		
		final TextBox st_4 = new TextBox();
		batGrid.setWidget(4, 0, st_4);
		st_4.setWidth("100%");
		
		final TextBox st_5 = new TextBox();
		batGrid.setWidget(5, 0, st_5);
		st_5.setWidth("100%");
		
		final TextBox st_6 = new TextBox();
		batGrid.setWidget(6, 0, st_6);
		st_6.setWidth("100%");
		
		final TextBox st_7 = new TextBox();
		batGrid.setWidget(7, 0, st_7);
		st_7.setWidth("100%");
		
		final TextBox st_8 = new TextBox();
		batGrid.setWidget(8, 0, st_8);
		st_8.setWidth("100%");
		
		final TextBox st_9 = new TextBox();
		batGrid.setWidget(9, 0, st_9);
		st_9.setWidth("100%");
		
		final TextBox st_10 = new TextBox();
		batGrid.setWidget(10, 0, st_10);
		st_10.setWidth("100%");
		
		final TextBox st_11 = new TextBox();
		batGrid.setWidget(11, 0, st_11);
		st_11.setWidth("100%");
		
		final TextBox st_12 = new TextBox();
		batGrid.setWidget(12, 0, st_12);
		st_12.setWidth("100%");
		
		final TextBox st_13 = new TextBox();
		batGrid.setWidget(13, 0, st_13);
		st_13.setWidth("100%");

		final TextBox capture_1 = new TextBox();
		batGrid.setWidget(1, 1, capture_1);
		capture_1.setWidth("100%");
		
		final TextBox capture_2 = new TextBox();
		batGrid.setWidget(2, 1, capture_2);
		capture_2.setWidth("100%");
		
		final TextBox capture_3 = new TextBox();
		batGrid.setWidget(3, 1, capture_3);
		capture_3.setWidth("100%");
		
		final TextBox capture_4 = new TextBox();
		batGrid.setWidget(4, 1, capture_4);
		capture_4.setWidth("100%");
		
		final TextBox capture_5 = new TextBox();
		batGrid.setWidget(5, 1, capture_5);
		capture_5.setWidth("100%");
		
		final TextBox capture_6 = new TextBox();
		batGrid.setWidget(6, 1, capture_6);
		capture_6.setWidth("100%");
		
		final TextBox capture_7 = new TextBox();
		batGrid.setWidget(7, 1, capture_7);
		capture_7.setWidth("100%");
		
		final TextBox capture_8 = new TextBox();
		batGrid.setWidget(8, 1, capture_8);
		capture_8.setWidth("100%");
		
		final TextBox capture_9 = new TextBox();
		batGrid.setWidget(9, 1, capture_9);
		capture_9.setWidth("100%");
		
		final TextBox capture_10 = new TextBox();
		batGrid.setWidget(10, 1, capture_10);
		capture_10.setWidth("100%");
		
		final TextBox capture_11 = new TextBox();
		batGrid.setWidget(11, 1, capture_11);
		capture_11.setWidth("100%");
		
		final TextBox capture_12 = new TextBox();
		batGrid.setWidget(12, 1, capture_12);
		capture_12.setWidth("100%");
		
		final TextBox capture_13 = new TextBox();
		batGrid.setWidget(13, 1, capture_13);
		capture_13.setWidth("100%");

		final TextBox band_1 = new TextBox();
		batGrid.setWidget(1, 2, band_1);
		band_1.setWidth("100%");
		
		final TextBox band_2 = new TextBox();
		batGrid.setWidget(2, 2, band_2);
		band_2.setWidth("100%");
		
		final TextBox band_3 = new TextBox();
		batGrid.setWidget(3, 2, band_3);
		band_3.setWidth("100%");
		
		final TextBox band_4 = new TextBox();
		batGrid.setWidget(4, 2, band_4);
		band_4.setWidth("100%");
		
		final TextBox band_5 = new TextBox();
		batGrid.setWidget(5, 2, band_5);
		band_5.setWidth("100%");
		
		final TextBox band_6 = new TextBox();
		batGrid.setWidget(6, 2, band_6);
		band_6.setWidth("100%");
		
		final TextBox band_7 = new TextBox();
		batGrid.setWidget(7, 2, band_7);
		band_7.setWidth("100%");
		
		final TextBox band_8 = new TextBox();
		batGrid.setWidget(8, 2, band_8);
		band_8.setWidth("100%");
		
		final TextBox band_9 = new TextBox();
		batGrid.setWidget(9, 2, band_9);
		band_9.setWidth("100%");
		
		final TextBox band_10 = new TextBox();
		batGrid.setWidget(10, 2, band_10);
		band_10.setWidth("100%");
		
		final TextBox band_11 = new TextBox();
		batGrid.setWidget(11, 2, band_11);
		band_11.setWidth("100%");
		
		final TextBox band_12 = new TextBox();
		batGrid.setWidget(12, 2, band_12);
		band_12.setWidth("100%");
		
		final TextBox band_13 = new TextBox();
		batGrid.setWidget(13, 2, band_13);
		band_13.setWidth("100%");

		final TextBox r_1 = new TextBox();
		batGrid.setWidget(1, 3, r_1);
		r_1.setWidth("100%");
		
		final TextBox r_2 = new TextBox();
		batGrid.setWidget(2, 3, r_2);
		r_2.setWidth("100%");
		
		final TextBox r_3 = new TextBox();
		batGrid.setWidget(3, 3, r_3);
		r_3.setWidth("100%");
		
		final TextBox r_4 = new TextBox();
		batGrid.setWidget(4, 3, r_4);
		r_4.setWidth("100%");
		
		final TextBox r_5 = new TextBox();
		batGrid.setWidget(5, 3, r_5);
		r_5.setWidth("100%");
		
		final TextBox r_6 = new TextBox();
		batGrid.setWidget(6, 3, r_6);
		r_6.setWidth("100%");
		
		final TextBox r_7 = new TextBox();
		batGrid.setWidget(7, 3, r_7);
		r_7.setWidth("100%");
		
		final TextBox r_8 = new TextBox();
		batGrid.setWidget(8, 3, r_8);
		r_8.setWidth("100%");
		
		final TextBox r_9 = new TextBox();
		batGrid.setWidget(9, 3, r_9);
		r_9.setWidth("100%");
		
		final TextBox r_10 = new TextBox();
		batGrid.setWidget(10, 3, r_10);
		r_10.setWidth("100%");
		
		final TextBox r_11 = new TextBox();
		batGrid.setWidget(11, 3, r_11);
		r_11.setWidth("100%");
		
		final TextBox r_12 = new TextBox();
		batGrid.setWidget(12, 3, r_12);
		r_12.setWidth("100%");
		
		final TextBox r_13 = new TextBox();
		batGrid.setWidget(13, 3, r_13);
		r_13.setWidth("100%");

		final TextBox date_1 = new TextBox();
		batGrid.setWidget(1, 4, date_1);
		date_1.setWidth("100%");
		
		final TextBox date_2 = new TextBox();
		batGrid.setWidget(2, 4, date_2);
		date_2.setWidth("100%");
		
		final TextBox date_3 = new TextBox();
		batGrid.setWidget(3, 4, date_3);
		date_3.setWidth("100%");
		
		final TextBox date_4 = new TextBox();
		batGrid.setWidget(4, 4, date_4);
		date_4.setWidth("100%");
		
		final TextBox date_5 = new TextBox();
		batGrid.setWidget(5, 4, date_5);
		date_5.setWidth("100%");
		
		final TextBox date_6 = new TextBox();
		batGrid.setWidget(6, 4, date_6);
		date_6.setWidth("100%");
		
		final TextBox date_7 = new TextBox();
		batGrid.setWidget(7, 4, date_7);
		date_7.setWidth("100%");
		
		final TextBox date_8 = new TextBox();
		batGrid.setWidget(8, 4, date_8);
		date_8.setWidth("100%");
		
		final TextBox date_9 = new TextBox();
		batGrid.setWidget(9, 4, date_9);
		date_9.setWidth("100%");
		
		final TextBox date_10 = new TextBox();
		batGrid.setWidget(10, 4, date_10);
		date_10.setWidth("100%");
		
		final TextBox date_11 = new TextBox();
		batGrid.setWidget(11, 4, date_11);
		date_11.setWidth("100%");
		
		final TextBox date_12 = new TextBox();
		batGrid.setWidget(12, 4, date_12);
		date_12.setWidth("100%");
		
		final TextBox date_13 = new TextBox();
		batGrid.setWidget(13, 4, date_13);
		date_13.setWidth("100%");

		final TextBox time_1 = new TextBox();
		batGrid.setWidget(1, 5, time_1);
		time_1.setWidth("100%");
		
		final TextBox time_2 = new TextBox();
		batGrid.setWidget(2, 5, time_2);
		time_2.setWidth("100%");
		
		final TextBox time_3 = new TextBox();
		batGrid.setWidget(3, 5, time_3);
		time_3.setWidth("100%");
		
		final TextBox time_4 = new TextBox();
		batGrid.setWidget(4, 5, time_4);
		time_4.setWidth("100%");
		
		final TextBox time_5 = new TextBox();
		batGrid.setWidget(5, 5, time_5);
		time_5.setWidth("100%");
		
		final TextBox time_6 = new TextBox();
		batGrid.setWidget(6, 5, time_6);
		time_6.setWidth("100%");
		
		final TextBox time_7 = new TextBox();
		batGrid.setWidget(7, 5, time_7);
		time_7.setWidth("100%");
		
		final TextBox time_8 = new TextBox();
		batGrid.setWidget(8, 5, time_8);
		time_8.setWidth("100%");
		
		final TextBox time_9 = new TextBox();
		batGrid.setWidget(9, 5, time_9);
		time_9.setWidth("100%");
		
		final TextBox time_10 = new TextBox();
		batGrid.setWidget(10, 5, time_10);
		time_10.setWidth("100%");
		
		final TextBox time_11 = new TextBox();
		batGrid.setWidget(11, 5, time_11);
		time_11.setWidth("100%");
		
		final TextBox time_12 = new TextBox();
		batGrid.setWidget(12, 5, time_12);
		time_12.setWidth("100%");
		
		final TextBox time_13 = new TextBox();
		batGrid.setWidget(13, 5, time_13);
		time_13.setWidth("100%");

		final TextBox trap_1 = new TextBox();
		batGrid.setWidget(1, 6, trap_1);
		trap_1.setWidth("100%");
		
		final TextBox trap_2 = new TextBox();
		batGrid.setWidget(2, 6, trap_2);
		trap_2.setWidth("100%");
		
		final TextBox trap_3 = new TextBox();
		batGrid.setWidget(3, 6, trap_3);
		trap_3.setWidth("100%");
		
		final TextBox trap_4 = new TextBox();
		batGrid.setWidget(4, 6, trap_4);
		trap_4.setWidth("100%");
		
		final TextBox trap_5 = new TextBox();
		batGrid.setWidget(5, 6, trap_5);
		trap_5.setWidth("100%");
		
		final TextBox trap_6 = new TextBox();
		batGrid.setWidget(6, 6, trap_6);
		trap_6.setWidth("100%");
		
		final TextBox trap_7 = new TextBox();
		batGrid.setWidget(7, 6, trap_7);
		trap_7.setWidth("100%");
		
		final TextBox trap_8 = new TextBox();
		batGrid.setWidget(8, 6, trap_8);
		trap_8.setWidth("100%");
		
		final TextBox trap_9 = new TextBox();
		batGrid.setWidget(9, 6, trap_9);
		trap_9.setWidth("100%");
		
		final TextBox trap_10 = new TextBox();
		batGrid.setWidget(10, 6, trap_10);
		trap_10.setWidth("100%");
		
		final TextBox trap_11 = new TextBox();
		batGrid.setWidget(11, 6, trap_11);
		trap_11.setWidth("100%");
		
		final TextBox trap_12 = new TextBox();
		batGrid.setWidget(12, 6, trap_12);
		trap_12.setWidth("100%");
		
		final TextBox trap_13 = new TextBox();
		batGrid.setWidget(13, 6, trap_13);
		trap_13.setWidth("100%");

		final TextBox spp_1 = new TextBox();
		batGrid.setWidget(1, 7, spp_1);
		spp_1.setWidth("100%");
		
		final TextBox spp_2 = new TextBox();
		batGrid.setWidget(2, 7, spp_2);
		spp_2.setWidth("100%");
		
		final TextBox spp_3 = new TextBox();
		batGrid.setWidget(3, 7, spp_3);
		spp_3.setWidth("100%");
		
		final TextBox spp_4 = new TextBox();
		batGrid.setWidget(4, 7, spp_4);
		spp_4.setWidth("100%");
		
		final TextBox spp_5 = new TextBox();
		batGrid.setWidget(5, 7, spp_5);
		spp_5.setWidth("100%");
		
		final TextBox spp_6 = new TextBox();
		batGrid.setWidget(6, 7, spp_6);
		spp_6.setWidth("100%");
		
		final TextBox spp_7 = new TextBox();
		batGrid.setWidget(7, 7, spp_7);
		spp_7.setWidth("100%");
		
		final TextBox spp_8 = new TextBox();
		batGrid.setWidget(8, 7, spp_8);
		spp_8.setWidth("100%");
		
		final TextBox spp_9 = new TextBox();
		batGrid.setWidget(9, 7, spp_9);
		spp_9.setWidth("100%");
		
		final TextBox spp_10 = new TextBox();
		batGrid.setWidget(10, 7, spp_10);
		spp_10.setWidth("100%");
		
		final TextBox spp_11 = new TextBox();
		batGrid.setWidget(11, 7, spp_11);
		spp_11.setWidth("100%");
		
		final TextBox spp_12 = new TextBox();
		batGrid.setWidget(12, 7, spp_12);
		spp_12.setWidth("100%");
		
		final TextBox spp_13 = new TextBox();
		batGrid.setWidget(13, 7, spp_13);
		spp_13.setWidth("100%");

		final TextBox sex_1 = new TextBox();
		batGrid.setWidget(1, 8, sex_1);
		sex_1.setWidth("100%");
		
		final TextBox sex_2 = new TextBox();
		batGrid.setWidget(2, 8, sex_2);
		sex_2.setWidth("100%");
		
		final TextBox sex_3 = new TextBox();
		batGrid.setWidget(3, 8, sex_3);
		sex_3.setWidth("100%");
		
		final TextBox sex_4 = new TextBox();
		batGrid.setWidget(4, 8, sex_4);
		sex_4.setWidth("100%");
		
		final TextBox sex_5 = new TextBox();
		batGrid.setWidget(5, 8, sex_5);
		sex_5.setWidth("100%");
		
		final TextBox sex_6 = new TextBox();
		batGrid.setWidget(6, 8, sex_6);
		sex_6.setWidth("100%");
		
		final TextBox sex_7 = new TextBox();
		batGrid.setWidget(7, 8, sex_7);
		sex_7.setWidth("100%");
		
		final TextBox sex_8 = new TextBox();
		batGrid.setWidget(8, 8, sex_8);
		sex_8.setWidth("100%");
		
		final TextBox sex_9 = new TextBox();
		batGrid.setWidget(9, 8, sex_9);
		sex_9.setWidth("100%");
		
		final TextBox sex_10 = new TextBox();
		batGrid.setWidget(10, 8, sex_10);
		sex_10.setWidth("100%");
		
		final TextBox sex_11 = new TextBox();
		batGrid.setWidget(11, 8, sex_11);
		sex_11.setWidth("100%");
		
		final TextBox sex_12 = new TextBox();
		batGrid.setWidget(12, 8, sex_12);
		sex_12.setWidth("100%");
		
		final TextBox sex_13 = new TextBox();
		batGrid.setWidget(13, 8, sex_13);
		sex_13.setWidth("100%");

		final TextBox age_1 = new TextBox();
		batGrid.setWidget(1, 9, age_1);
		age_1.setWidth("100%");
		
		final TextBox age_2 = new TextBox();
		batGrid.setWidget(2, 9, age_2);
		age_2.setWidth("100%");
		
		final TextBox age_3 = new TextBox();
		batGrid.setWidget(3, 9, age_3);
		age_3.setWidth("100%");
		
		final TextBox age_4 = new TextBox();
		batGrid.setWidget(4, 9, age_4);
		age_4.setWidth("100%");
		
		final TextBox age_5 = new TextBox();
		batGrid.setWidget(5, 9, age_5);
		age_5.setWidth("100%");
		
		final TextBox age_6 = new TextBox();
		batGrid.setWidget(6, 9, age_6);
		age_6.setWidth("100%");
		
		final TextBox age_7 = new TextBox();
		batGrid.setWidget(7, 9, age_7);
		age_7.setWidth("100%");
		
		final TextBox age_8 = new TextBox();
		batGrid.setWidget(8, 9, age_8);
		age_8.setWidth("100%");
		
		final TextBox age_9 = new TextBox();
		batGrid.setWidget(9, 9, age_9);
		age_9.setWidth("100%");
		
		final TextBox age_10 = new TextBox();
		batGrid.setWidget(10, 9, age_10);
		age_10.setWidth("100%");
		
		final TextBox age_11 = new TextBox();
		batGrid.setWidget(11, 9, age_11);
		age_11.setWidth("100%");
		
		final TextBox age_12 = new TextBox();
		batGrid.setWidget(12, 9, age_12);
		age_12.setWidth("100%");
		
		final TextBox age_13 = new TextBox();
		batGrid.setWidget(13, 9, age_13);
		age_13.setWidth("100%");

		final TextBox rep_1 = new TextBox();
		batGrid.setWidget(1, 10, rep_1);
		rep_1.setWidth("100%");
		
		final TextBox rep_2 = new TextBox();
		batGrid.setWidget(2, 10, rep_2);
		rep_2.setWidth("100%");
		
		final TextBox rep_3 = new TextBox();
		batGrid.setWidget(3, 10, rep_3);
		rep_3.setWidth("100%");
		
		final TextBox rep_4 = new TextBox();
		batGrid.setWidget(4, 10, rep_4);
		rep_4.setWidth("100%");
		
		final TextBox rep_5 = new TextBox();
		batGrid.setWidget(5, 10, rep_5);
		rep_5.setWidth("100%");
		
		final TextBox rep_6 = new TextBox();
		batGrid.setWidget(6, 10, rep_6);
		rep_6.setWidth("100%");
		
		final TextBox rep_7 = new TextBox();
		batGrid.setWidget(7, 10, rep_7);
		rep_7.setWidth("100%");
		
		final TextBox rep_8 = new TextBox();
		batGrid.setWidget(8, 10, rep_8);
		rep_8.setWidth("100%");
		
		final TextBox rep_9 = new TextBox();
		batGrid.setWidget(9, 10, rep_9);
		rep_9.setWidth("100%");
		
		final TextBox rep_10 = new TextBox();
		batGrid.setWidget(10, 10, rep_10);
		rep_10.setWidth("100%");
		
		final TextBox rep_11 = new TextBox();
		batGrid.setWidget(11, 10, rep_11);
		rep_11.setWidth("100%");
		
		final TextBox rep_12 = new TextBox();
		batGrid.setWidget(12, 10, rep_12);
		rep_12.setWidth("100%");
		
		final TextBox rep_13 = new TextBox();
		batGrid.setWidget(13, 10, rep_13);
		rep_13.setWidth("100%");

		final TextBox fa_1 = new TextBox();
		batGrid.setWidget(1, 11, fa_1);
		fa_1.setWidth("100%");
		
		final TextBox fa_2 = new TextBox();
		batGrid.setWidget(2, 11, fa_2);
		fa_2.setWidth("100%");
		
		final TextBox fa_3 = new TextBox();
		batGrid.setWidget(3, 11, fa_3);
		fa_3.setWidth("100%");
		
		final TextBox fa_4 = new TextBox();
		batGrid.setWidget(4, 11, fa_4);
		fa_4.setWidth("100%");
		
		final TextBox fa_5 = new TextBox();
		batGrid.setWidget(5, 11, fa_5);
		fa_5.setWidth("100%");
		
		final TextBox fa_6 = new TextBox();
		batGrid.setWidget(6, 11, fa_6);
		fa_6.setWidth("100%");
		
		final TextBox fa_7 = new TextBox();
		batGrid.setWidget(7, 11, fa_7);
		fa_7.setWidth("100%");
		
		final TextBox fa_8 = new TextBox();
		batGrid.setWidget(8, 11, fa_8);
		fa_8.setWidth("100%");
		
		final TextBox fa_9 = new TextBox();
		batGrid.setWidget(9, 11, fa_9);
		fa_9.setWidth("100%");
		
		final TextBox fa_10 = new TextBox();
		batGrid.setWidget(10, 11, fa_10);
		fa_10.setWidth("100%");
		
		final TextBox fa_11 = new TextBox();
		batGrid.setWidget(11, 11, fa_11);
		fa_11.setWidth("100%");
		
		final TextBox fa_12 = new TextBox();
		batGrid.setWidget(12, 11, fa_12);
		fa_12.setWidth("100%");
		
		final TextBox fa_13 = new TextBox();
		batGrid.setWidget(13, 11, fa_13);
		fa_13.setWidth("100%");

		final TextBox wgt_1 = new TextBox();
		batGrid.setWidget(1, 12, wgt_1);
		wgt_1.setWidth("100%");
		
		final TextBox wgt_2 = new TextBox();
		batGrid.setWidget(2, 12, wgt_2);
		wgt_2.setWidth("100%");
		
		final TextBox wgt_3 = new TextBox();
		batGrid.setWidget(3, 12, wgt_3);
		wgt_3.setWidth("100%");
		
		final TextBox wgt_4 = new TextBox();
		batGrid.setWidget(4, 12, wgt_4);
		wgt_4.setWidth("100%");
		
		final TextBox wgt_5 = new TextBox();
		batGrid.setWidget(5, 12, wgt_5);
		wgt_5.setWidth("100%");
		
		final TextBox wgt_6 = new TextBox();
		batGrid.setWidget(6, 12, wgt_6);
		wgt_6.setWidth("100%");
		
		final TextBox wgt_7 = new TextBox();
		batGrid.setWidget(7, 12, wgt_7);
		wgt_7.setWidth("100%");
		
		final TextBox wgt_8 = new TextBox();
		batGrid.setWidget(8, 12, wgt_8);
		wgt_8.setWidth("100%");
		
		final TextBox wgt_9 = new TextBox();
		batGrid.setWidget(9, 12, wgt_9);
		wgt_9.setWidth("100%");
		
		final TextBox wgt_10 = new TextBox();
		batGrid.setWidget(10, 12, wgt_10);
		wgt_10.setWidth("100%");
		
		final TextBox wgt_11 = new TextBox();
		batGrid.setWidget(11, 12, wgt_11);
		wgt_11.setWidth("100%");
		
		final TextBox wgt_12 = new TextBox();
		batGrid.setWidget(12, 12, wgt_12);
		wgt_12.setWidth("100%");
		
		final TextBox wgt_13 = new TextBox();
		batGrid.setWidget(13, 12, wgt_13);
		wgt_13.setWidth("100%");

		final TextBox comm_1 = new TextBox();
		batGrid.setWidget(1, 13, comm_1);
		comm_1.setWidth("100%");
		
		final TextBox comm_2 = new TextBox();
		batGrid.setWidget(2, 13, comm_2);
		comm_2.setWidth("100%");
		
		final TextBox comm_3 = new TextBox();
		batGrid.setWidget(3, 13, comm_3);
		comm_3.setWidth("100%");
		
		final TextBox comm_4 = new TextBox();
		batGrid.setWidget(4, 13, comm_4);
		comm_4.setWidth("100%");
		
		final TextBox comm_5 = new TextBox();
		batGrid.setWidget(5, 13, comm_5);
		comm_5.setWidth("100%");
		
		final TextBox comm_6 = new TextBox();
		batGrid.setWidget(6, 13, comm_6);
		comm_6.setWidth("100%");
		
		final TextBox comm_7 = new TextBox();
		batGrid.setWidget(7, 13, comm_7);
		comm_7.setWidth("100%");
		
		final TextBox comm_8 = new TextBox();
		batGrid.setWidget(8, 13, comm_8);
		comm_8.setWidth("100%");
		
		final TextBox comm_9 = new TextBox();
		batGrid.setWidget(9, 13, comm_9);
		comm_9.setWidth("100%");
		
		final TextBox comm_10 = new TextBox();
		batGrid.setWidget(10, 13, comm_10);
		comm_10.setWidth("100%");
		
		final TextBox comm_11 = new TextBox();
		batGrid.setWidget(11, 13, comm_11);
		comm_11.setWidth("100%");
		
		final TextBox comm_12 = new TextBox();
		batGrid.setWidget(12, 13, comm_12);
		comm_12.setWidth("100%");
		
		final TextBox comm_13 = new TextBox();
		batGrid.setWidget(13, 13, comm_13);
		comm_13.setWidth("100%");
		
		final Button submitButton = new Button("Submit");
		flowPanel.add(submitButton);
		
		
	}

}
