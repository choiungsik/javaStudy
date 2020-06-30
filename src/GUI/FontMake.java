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
			// deriveFont는 12f로 기본 폰트사이즈를 정해줌
			
			ge.registerFont(cookie);
			// registerFont를 통해서 위에서 생성한 폰트를 등록함
			
		} catch (FontFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
