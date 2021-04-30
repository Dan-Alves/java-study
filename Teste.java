import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		List<Boolean> list = new ArrayList<>();
		list.add(true);
		list.add(Boolean.parseBoolean("FalSe"));
		list.add(Boolean.TRUE);
		System.out.print(list.size());
		System.out.print(list.get(1) instanceof Boolean);
	}

}
