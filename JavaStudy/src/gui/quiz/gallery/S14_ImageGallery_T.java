package gui.quiz.gallery;


import java.awt.GridLayout;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S14_ImageGallery_T extends JFrame {

	// 2.
	public S14_ImageGallery_T(String path) {
		File dir = new File(path); // 경로전달 3
		
		//7.
		// 모든 ThumbnailButton에서 사용할 ViewImageFrame을 하나 생성하여 전달
		// 하나의 프레임을 하나씩 생성하여 크기 확대
		ThumbnailButton.setViewFrame(new ViewImageFrame());
		
		
		// 4. 디렉토리 파일을 하나씩 꺼내서 버튼을 만든다.
		int imageCount = 0;
		for (File f : dir.listFiles()) {
			if (f.isFile()) { // 5. f가 파일이냐? true면 진행
				add(new ThumbnailButton(f));
				++imageCount;
			}
		}

		// 6. 개수를 새서 16개 만든다.
		while (imageCount++ < 16) {
			add(new JButton("empty"));
		}

		setLayout(new GridLayout(4, 4));
		setTitle("Thumbnails");
		setLocation(100, 100);
		setVisible(true);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// 1.
		new S14_ImageGallery_T("images/");
	}
}
