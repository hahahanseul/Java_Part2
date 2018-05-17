import java.util.ArrayList;

/**
 * @author Kim
 * */
public class MessageList {
	public static void main(String[] args) {
		ArrayList<String> msgList = new ArrayList<>();
		msgList.add("A");
		msgList.add("Santa");
		msgList.add("at");
		msgList.add("Nasa");
		for (String msg : msgList) {
			System.out.print(msg + " ");
		}

	}
}
