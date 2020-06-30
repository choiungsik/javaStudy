package GUI;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

public class FontMake {

	public void fontChange(GraphicsEnvironment ge) {
		String path = "C:\\Users\\smhrd\\AppData\\Local\\Microsoft\\Windows\\Fonts\\CookieRun Black.otf";
		
		try {
			Font cookie = Font.createFont(Font.TRUETYPE_FONT, new File(path)).deriveFont(12f);
			// deriveFont�� 12f�� �⺻ ��Ʈ����� ������
			
			ge.registerFont(cookie);
			// registerFont�� ���ؼ� ������ ������ ��Ʈ�� �����
			
		} catch (FontFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
