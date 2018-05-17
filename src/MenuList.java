import java.util.ArrayList;

/**
 * @author Kim
 * */
public class MenuList {
	public static void main(String[] args) {
		ArrayList<Menu> menuList = new ArrayList<>();
		Menu menu1 = new Menu("地中海風ピラフ", 699);
		Menu menu2 = new Menu("パルマ風パスタ", 599);
		Menu menu3 = new Menu("ジェノベーゼ", 499);
		menuList.add(menu1);
		menuList.add(menu2);
		menuList.add(menu3);
		for (Menu menu : menuList) {
			menu.displayMenu();
		}

	}
}
