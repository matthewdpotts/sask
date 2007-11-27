package com.mycompany.project.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;

public class tree2 extends Composite {

	public tree2() {

		final FlowPanel flowPanel = new FlowPanel();
		initWidget(flowPanel);

		final Grid grid = new Grid();
		flowPanel.add(grid);
		grid.setBorderWidth(1);
		grid.resize(17, 7);

		final Label subplotLabel = new Label("Subplot");
		grid.setWidget(0, 0, subplotLabel);

		final Label quadrateLabel = new Label("Quadrate");
		grid.setWidget(0, 1, quadrateLabel);

		final Label convexconcaveLabel = new Label("Convex/Concave");
		grid.setWidget(0, 2, convexconcaveLabel);

		final Label fineRootLabel = new Label("Fine root None, Some, Lots ");
		grid.setWidget(0, 3, fineRootLabel);

		final Label sphericalDensiometerLabel = new Label("Spherical Densiometer");
		grid.setWidget(0, 4, sphericalDensiometerLabel);

		final Label canopyPhotoLabel = new Label("Canopy photo # (1.3m)");
		grid.setWidget(0, 5, canopyPhotoLabel);

		final Label soilSampleLabel = new Label("Soil Sample #");
		grid.setWidget(0, 6, soilSampleLabel);

		final Label label = new Label("1");
		grid.setWidget(1, 0, label);

		final Label label_1 = new Label("1");
		grid.setWidget(1, 1, label_1);

		final Label label_2 = new Label("1");
		grid.setWidget(2, 0, label_2);

		final Label label_3 = new Label("2");
		grid.setWidget(2, 1, label_3);

		final Label label_4 = new Label("1");
		grid.setWidget(3, 0, label_4);

		final Label label_5 = new Label("3");
		grid.setWidget(3, 1, label_5);

		final Label label_6 = new Label("1");
		grid.setWidget(4, 0, label_6);

		final Label label_7 = new Label("1");
		grid.setWidget(5, 1, label_7);

		final Label label_8 = new Label("4");
		grid.setWidget(4, 1, label_8);

		final Label label_9 = new Label("2");
		grid.setWidget(5, 0, label_9);

		final Label label_10 = new Label("2");
		grid.setWidget(6, 0, label_10);

		final Label label_11 = new Label("2");
		grid.setWidget(7, 0, label_11);

		final Label label_12 = new Label("2");
		grid.setWidget(8, 0, label_12);

		final Label label_13 = new Label("3");
		grid.setWidget(9, 0, label_13);

		final Label label_14 = new Label("3");
		grid.setWidget(10, 0, label_14);

		final Label label_15 = new Label("4");
		grid.setWidget(14, 0, label_15);

		final Label label_16 = new Label("4");
		grid.setWidget(13, 0, label_16);

		final Label label_17 = new Label("3");
		grid.setWidget(12, 0, label_17);

		final Label label_18 = new Label("3");
		grid.setWidget(11, 0, label_18);

		final Label label_19 = new Label("4");
		grid.setWidget(16, 0, label_19);

		final Label label_20 = new Label("4");
		grid.setWidget(15, 0, label_20);

		final Label label_21 = new Label("2");
		grid.setWidget(6, 1, label_21);

		final Label label_22 = new Label("3");
		grid.setWidget(7, 1, label_22);

		final Label label_23 = new Label("4");
		grid.setWidget(8, 1, label_23);

		final Label label_24 = new Label("1");
		grid.setWidget(9, 1, label_24);

		final Label label_25 = new Label("2");
		grid.setWidget(10, 1, label_25);

		final Label label_26 = new Label("3");
		grid.setWidget(11, 1, label_26);

		final Label label_27 = new Label("4");
		grid.setWidget(12, 1, label_27);

		final Label label_28 = new Label("1");
		grid.setWidget(13, 1, label_28);

		final Label label_29 = new Label("2");
		grid.setWidget(14, 1, label_29);

		final Label label_30 = new Label("3");
		grid.setWidget(15, 1, label_30);

		final Label label_31 = new Label("4");
		grid.setWidget(16, 1, label_31);

		final TextBox textBox = new TextBox();
		grid.setWidget(1, 2, textBox);
		textBox.setWidth("100%");

		final TextBox textBox_1 = new TextBox();
		grid.setWidget(1, 3, textBox_1);
		textBox_1.setWidth("100%");

		final TextBox textBox_2 = new TextBox();
		grid.setWidget(1, 4, textBox_2);
		textBox_2.setWidth("100%");

		final TextBox textBox_3 = new TextBox();
		grid.setWidget(1, 5, textBox_3);
		textBox_3.setWidth("100%");

		final TextBox textBox_4 = new TextBox();
		grid.setWidget(1, 6, textBox_4);
		textBox_4.setWidth("100%");

		final TextBox textBox_5 = new TextBox();
		grid.setWidget(2, 2, textBox_5);
		textBox_5.setWidth("100%");

		final TextBox textBox_6 = new TextBox();
		grid.setWidget(2, 3, textBox_6);
		textBox_6.setWidth("100%");

		final TextBox textBox_7 = new TextBox();
		grid.setWidget(2, 4, textBox_7);
		textBox_7.setWidth("100%");

		final TextBox textBox_8 = new TextBox();
		grid.setWidget(2, 5, textBox_8);
		textBox_8.setWidth("100%");

		final TextBox textBox_9 = new TextBox();
		grid.setWidget(2, 6, textBox_9);
		textBox_9.setWidth("100%");

		final TextBox textBox_10 = new TextBox();
		grid.setWidget(3, 2, textBox_10);
		textBox_10.setWidth("100%");

		final TextBox textBox_11 = new TextBox();
		grid.setWidget(4, 2, textBox_11);
		textBox_11.setWidth("100%");

		final TextBox textBox_12 = new TextBox();
		grid.setWidget(5, 2, textBox_12);
		textBox_12.setWidth("100%");

		final TextBox textBox_13 = new TextBox();
		grid.setWidget(6, 2, textBox_13);
		textBox_13.setWidth("100%");

		final TextBox textBox_14 = new TextBox();
		grid.setWidget(7, 2, textBox_14);
		textBox_14.setWidth("100%");

		final TextBox textBox_15 = new TextBox();
		grid.setWidget(8, 2, textBox_15);
		textBox_15.setWidth("100%");

		final TextBox textBox_16 = new TextBox();
		grid.setWidget(9, 2, textBox_16);
		textBox_16.setWidth("100%");

		final TextBox textBox_17 = new TextBox();
		grid.setWidget(10, 2, textBox_17);
		textBox_17.setWidth("100%");

		final TextBox textBox_18 = new TextBox();
		grid.setWidget(11, 2, textBox_18);
		textBox_18.setWidth("100%");

		final TextBox textBox_19 = new TextBox();
		grid.setWidget(12, 2, textBox_19);
		textBox_19.setWidth("100%");

		final TextBox textBox_20 = new TextBox();
		grid.setWidget(13, 2, textBox_20);
		textBox_20.setWidth("100%");

		final TextBox textBox_21 = new TextBox();
		grid.setWidget(14, 2, textBox_21);
		textBox_21.setWidth("100%");

		final TextBox textBox_22 = new TextBox();
		grid.setWidget(15, 2, textBox_22);
		textBox_22.setWidth("100%");

		final TextBox textBox_23 = new TextBox();
		grid.setWidget(16, 2, textBox_23);
		textBox_23.setWidth("100%");

		final TextBox textBox_24 = new TextBox();
		grid.setWidget(16, 3, textBox_24);
		textBox_24.setWidth("100%");

		final TextBox textBox_25 = new TextBox();
		grid.setWidget(16, 4, textBox_25);
		textBox_25.setWidth("100%");

		final TextBox textBox_26 = new TextBox();
		grid.setWidget(9, 3, textBox_26);
		textBox_26.setWidth("100%");

		final TextBox textBox_27 = new TextBox();
		grid.setWidget(16, 5, textBox_27);
		textBox_27.setWidth("100%");

		final TextBox textBox_28 = new TextBox();
		grid.setWidget(16, 6, textBox_28);
		textBox_28.setWidth("100%");

		final TextBox textBox_29 = new TextBox();
		grid.setWidget(15, 3, textBox_29);
		textBox_29.setWidth("100%");

		final TextBox textBox_30 = new TextBox();
		grid.setWidget(15, 4, textBox_30);
		textBox_30.setWidth("100%");

		final TextBox textBox_31 = new TextBox();
		grid.setWidget(15, 5, textBox_31);
		textBox_31.setWidth("100%");

		final TextBox textBox_32 = new TextBox();
		grid.setWidget(15, 6, textBox_32);
		textBox_32.setWidth("100%");

		final TextBox textBox_33 = new TextBox();
		grid.setWidget(14, 3, textBox_33);
		textBox_33.setWidth("100%");

		final TextBox textBox_34 = new TextBox();
		grid.setWidget(14, 4, textBox_34);
		textBox_34.setWidth("100%");

		final TextBox textBox_35 = new TextBox();
		grid.setWidget(14, 5, textBox_35);
		textBox_35.setWidth("100%");

		final TextBox textBox_36 = new TextBox();
		grid.setWidget(14, 6, textBox_36);
		textBox_36.setWidth("100%");

		final TextBox textBox_37 = new TextBox();
		grid.setWidget(13, 3, textBox_37);
		textBox_37.setWidth("100%");

		final TextBox textBox_38 = new TextBox();
		grid.setWidget(13, 4, textBox_38);
		textBox_38.setWidth("100%");

		final TextBox textBox_39 = new TextBox();
		grid.setWidget(13, 6, textBox_39);
		textBox_39.setWidth("100%");

		final TextBox textBox_40 = new TextBox();
		grid.setWidget(13, 5, textBox_40);
		textBox_40.setWidth("100%");

		final TextBox textBox_41 = new TextBox();
		grid.setWidget(12, 3, textBox_41);
		textBox_41.setWidth("100%");

		final TextBox textBox_42 = new TextBox();
		grid.setWidget(12, 4, textBox_42);
		textBox_42.setWidth("100%");

		final TextBox textBox_43 = new TextBox();
		grid.setWidget(12, 5, textBox_43);
		textBox_43.setWidth("100%");

		final TextBox textBox_44 = new TextBox();
		grid.setWidget(12, 6, textBox_44);
		textBox_44.setWidth("100%");

		final TextBox textBox_45 = new TextBox();
		grid.setWidget(11, 3, textBox_45);
		textBox_45.setWidth("100%");

		final TextBox textBox_46 = new TextBox();
		grid.setWidget(11, 4, textBox_46);
		textBox_46.setWidth("100%");

		final TextBox textBox_47 = new TextBox();
		grid.setWidget(11, 5, textBox_47);
		textBox_47.setWidth("100%");

		final TextBox textBox_48 = new TextBox();
		grid.setWidget(11, 6, textBox_48);
		textBox_48.setWidth("100%");

		final TextBox textBox_49 = new TextBox();
		grid.setWidget(10, 3, textBox_49);
		textBox_49.setWidth("100%");

		final TextBox textBox_50 = new TextBox();
		grid.setWidget(10, 4, textBox_50);
		textBox_50.setWidth("100%");

		final TextBox textBox_51 = new TextBox();
		grid.setWidget(10, 5, textBox_51);
		textBox_51.setWidth("100%");

		final TextBox textBox_52 = new TextBox();
		grid.setWidget(10, 6, textBox_52);
		textBox_52.setWidth("100%");

		final TextBox textBox_53 = new TextBox();
		grid.setWidget(9, 4, textBox_53);
		textBox_53.setWidth("100%");

		final TextBox textBox_54 = new TextBox();
		grid.setWidget(9, 5, textBox_54);
		textBox_54.setWidth("100%");

		final TextBox textBox_55 = new TextBox();
		grid.setWidget(9, 6, textBox_55);
		textBox_55.setWidth("100%");

		final TextBox textBox_56 = new TextBox();
		grid.setWidget(8, 3, textBox_56);
		textBox_56.setWidth("100%");

		final TextBox textBox_57 = new TextBox();
		grid.setWidget(8, 4, textBox_57);
		textBox_57.setWidth("100%");

		final TextBox textBox_58 = new TextBox();
		grid.setWidget(8, 6, textBox_58);
		textBox_58.setWidth("100%");

		final TextBox textBox_59 = new TextBox();
		grid.setWidget(8, 5, textBox_59);
		textBox_59.setWidth("100%");

		final TextBox textBox_60 = new TextBox();
		grid.setWidget(7, 3, textBox_60);
		textBox_60.setWidth("100%");

		final TextBox textBox_61 = new TextBox();
		grid.setWidget(6, 3, textBox_61);
		textBox_61.setWidth("100%");

		final TextBox textBox_62 = new TextBox();
		grid.setWidget(5, 3, textBox_62);
		textBox_62.setWidth("100%");

		final TextBox textBox_63 = new TextBox();
		grid.setWidget(4, 3, textBox_63);
		textBox_63.setWidth("100%");

		final TextBox textBox_64 = new TextBox();
		grid.setWidget(3, 3, textBox_64);
		textBox_64.setWidth("100%");

		final TextBox textBox_65 = new TextBox();
		grid.setWidget(3, 4, textBox_65);
		textBox_65.setWidth("100%");

		final TextBox textBox_66 = new TextBox();
		grid.setWidget(4, 4, textBox_66);
		textBox_66.setWidth("100%");

		final TextBox textBox_67 = new TextBox();
		grid.setWidget(5, 4, textBox_67);
		textBox_67.setWidth("100%");

		final TextBox textBox_68 = new TextBox();
		grid.setWidget(6, 4, textBox_68);
		textBox_68.setWidth("100%");

		final TextBox textBox_69 = new TextBox();
		grid.setWidget(7, 4, textBox_69);
		textBox_69.setWidth("100%");

		final TextBox textBox_70 = new TextBox();
		grid.setWidget(3, 5, textBox_70);
		textBox_70.setWidth("100%");

		final TextBox textBox_71 = new TextBox();
		grid.setWidget(3, 6, textBox_71);
		textBox_71.setWidth("100%");

		final TextBox textBox_72 = new TextBox();
		grid.setWidget(4, 5, textBox_72);
		textBox_72.setWidth("100%");

		final TextBox textBox_73 = new TextBox();
		grid.setWidget(4, 6, textBox_73);
		textBox_73.setWidth("100%");

		final TextBox textBox_74 = new TextBox();
		grid.setWidget(5, 5, textBox_74);
		textBox_74.setWidth("100%");

		final TextBox textBox_75 = new TextBox();
		grid.setWidget(5, 6, textBox_75);
		textBox_75.setWidth("100%");

		final TextBox textBox_76 = new TextBox();
		grid.setWidget(6, 5, textBox_76);
		textBox_76.setWidth("100%");

		final TextBox textBox_77 = new TextBox();
		grid.setWidget(6, 6, textBox_77);
		textBox_77.setWidth("100%");

		final TextBox textBox_78 = new TextBox();
		grid.setWidget(7, 5, textBox_78);
		textBox_78.setWidth("100%");

		final TextBox textBox_79 = new TextBox();
		grid.setWidget(7, 6, textBox_79);
		textBox_79.setWidth("100%");
	}

}
