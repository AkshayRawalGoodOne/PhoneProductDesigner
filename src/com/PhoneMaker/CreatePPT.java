package com.PhoneMaker;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;
import javax.swing.filechooser.FileSystemView;

import org.apache.poi.sl.usermodel.PictureData;
import org.apache.poi.sl.usermodel.TextParagraph;
import org.apache.poi.xslf.usermodel.SlideLayout;
import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFPictureData;
import org.apache.poi.xslf.usermodel.XSLFPictureShape;
import org.apache.poi.xslf.usermodel.XSLFSlide;
import org.apache.poi.xslf.usermodel.XSLFSlideMaster;
import org.apache.poi.xslf.usermodel.XSLFTable;
import org.apache.poi.xslf.usermodel.XSLFTableCell;
import org.apache.poi.xslf.usermodel.XSLFTableRow;
import org.apache.poi.xslf.usermodel.XSLFTextParagraph;
import org.apache.poi.xslf.usermodel.XSLFTextRun;
import org.apache.poi.xslf.usermodel.XSLFTextShape;


public class CreatePPT {

	public static String respath = "";
	public static void Make() throws IOException {
		File file = new File("/Presentation.pptx");
		File home = FileSystemView.getFileSystemView().getHomeDirectory();
		FileInputStream fstream = new FileInputStream(file);
		XMLSlideShow ppt = new XMLSlideShow(fstream);

		XSLFSlide appearance2 = ppt.createSlide();

		XSLFTable tbl = appearance2.createTable();
		tbl.setAnchor(new Rectangle(50, 50, 450, 300));

		int numColumns = 3;
		int numRows = 4;
		XSLFTableRow headerRow = tbl.addRow();
		headerRow.setHeight(50);
		for (int i = 0; i < numColumns; i++) {
			XSLFTableCell th = headerRow.addCell();
			XSLFTextParagraph p = th.addNewTextParagraph();
			p.setTextAlign(TextParagraph.TextAlign.CENTER);
			XSLFTextRun r = p.addNewTextRun();
			r.setText("Header " + (i + 1));
			tbl.setColumnWidth(i, 150);

			for (int rownum = 1; rownum < numRows; rownum++) {
				XSLFTableRow tr = tbl.addRow();
				tr.setHeight(50);

				for (int j = 0; j < numColumns; j++) {
					XSLFTableCell cell = tr.addCell();
					XSLFTextParagraph pa = cell.addNewTextParagraph();
					XSLFTextRun ru = pa.addNewTextRun();
					ru.setText(" Cell " + (i * rownum + 1));
				}
			}

		}

		try {
			FileOutputStream output = new FileOutputStream(home.getAbsolutePath() + "/"
					+ ((App.CompanyName == null) ? "Presentation" : App.CompanyName) + ".pptx");
			ppt.write(output);
			System.out.println("PPT Created");
			output.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static byte[] toByteArrayAutoClosable(BufferedImage image, String type) throws IOException {

		try (ByteArrayOutputStream out = new ByteArrayOutputStream()) {

			ImageIO.write(image, type, out);
			return out.toByteArray();
		}

	}

	public static void MakeFinal(PhoneInventory inventory) throws IOException {
		
		//String path = App.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		//respath = path;
		File home = FileSystemView.getFileSystemView().getHomeDirectory();
		File file = new File( home.getAbsolutePath() + "/Presentation.pptx");
		
		FileInputStream fstream = new FileInputStream(file);
		XMLSlideShow ppt = new XMLSlideShow(fstream);

		XSLFSlideMaster master = ppt.getSlideMasters().get(0);
		XSLFSlide title = ppt.createSlide(master.getLayout(SlideLayout.TITLE_ONLY));

		XSLFTextShape titleShape = title.getPlaceholder(0);
		titleShape.clearText();

		XSLFTextParagraph p = titleShape.addNewTextParagraph();
		p.setTextAlign(TextParagraph.TextAlign.CENTER);

		XSLFTextRun trun = p.addNewTextRun();
		trun.setText("Presenting");
		trun.setFontColor(Color.BLACK);
		trun.setFontFamily("Futura Heavy");
		trun.setFontSize(44.0);

		XSLFTextParagraph p2 = titleShape.addNewTextParagraph();
		XSLFTextRun trun2 = p2.addNewTextRun();
		p2.setTextAlign(TextParagraph.TextAlign.CENTER);
		trun2.setText(App.CompanyName);
		trun2.setFontColor(Color.BLACK);
		trun2.setFontFamily("Futura Heavy");
		trun2.setFontSize(74.0);

		for (int i = 0; i < inventory.Inventory.size(); i++) {
			PhoneComponentHandler handler = inventory.Inventory.get(i);

			if (handler.bought) {

				for (int j = 0; j < handler.CompHandler.size(); j++) {

					PhoneComponent pcomp = handler.CompHandler.get(j);
					if (pcomp.bought) {
						XSLFSlide slide = ppt.createSlide(master.getLayout(SlideLayout.TITLE_AND_CONTENT));
						XSLFTextShape TShape = slide.getPlaceholder(0);
						XSLFTextShape CShape = slide.getPlaceholder(1);

						TShape.clearText();
						CShape.clearText();

						XSLFTextRun run = TShape.addNewTextParagraph().addNewTextRun();
						run.setText(handler.HandlerName.toUpperCase());
						run.setFontColor(Color.BLACK);
						run.setFontFamily("Futura Heavy");
						run.setFontSize(44.0);

						byte[] pictureData = toByteArrayAutoClosable(pcomp.img, "png");

						XSLFPictureData pd = ppt.addPicture(pictureData, PictureData.PictureType.PNG);
						XSLFPictureShape picture = slide.createPicture(pd);

						picture.setAnchor(new Rectangle(600, 100, PhonePreview2.front.getWidth(),
								PhonePreview2.front.getHeight()));

						XSLFTextParagraph pa = CShape.addNewTextParagraph();
						pa.setIndentLevel(0);
						pa.setBullet(true);
						XSLFTextRun r = pa.addNewTextRun();
						r.setText(pcomp.ComponentName.toUpperCase());
						r.setFontColor(Color.BLACK);
						r.setFontFamily("FUTURA MEDIUM");
						r.setFontSize(30.0);
						pa.addLineBreak();

						for (int k = 0; k < pcomp.Description.size(); k++) {

							XSLFTextParagraph p1 = CShape.addNewTextParagraph();
							p1.setIndentLevel(1);
							p1.setBullet(true);
							XSLFTextRun r1 = p1.addNewTextRun();
							r1.setText(pcomp.Description.get(k));
							r1.setFontColor(Color.BLACK);
							r1.setFontFamily("FUTURA MEDIUM");
							r1.setFontSize(24.0);
							p1.addLineBreak();
						}
					}
				}
			}
		}
		XSLFSlideMaster master2 = ppt.getSlideMasters().get(0);
		XSLFSlide title2 = ppt.createSlide(master.getLayout(SlideLayout.TITLE_ONLY));

		XSLFTextShape titleShape2 = title2.getPlaceholder(0);
		titleShape2.clearText();

		XSLFTextParagraph p3 = titleShape2.addNewTextParagraph();
		p3.setTextAlign(TextParagraph.TextAlign.CENTER);

		XSLFTextRun trun3 = p3.addNewTextRun();
		trun3.setText("Total Cost of Phone = " + FinanceSystem.spent);
		trun3.setFontColor(Color.BLACK);
		trun3.setFontFamily("Futura Heavy");
		trun3.setFontSize(34.0);

		XSLFTextParagraph p4 = titleShape2.addNewTextParagraph();
		XSLFTextRun trun4 = p4.addNewTextRun();
		p4.setTextAlign(TextParagraph.TextAlign.CENTER);
		trun4.setText("Total Money Saved = " + FinanceSystem.total + " - " + FinanceSystem.spent + " = " + (FinanceSystem.total - FinanceSystem.spent));
		trun4.setFontColor(Color.BLACK);
		trun4.setFontFamily("Futura Heavy");
		trun4.setFontSize(34.0);

		try {
			FileOutputStream output = new FileOutputStream(home.getAbsolutePath() + "/"
					+ ((App.CompanyName == null) ? "Presentation" : App.CompanyName) + ".pptx");
			ppt.write(output);
			System.out.println("PPT Created");
			output.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
