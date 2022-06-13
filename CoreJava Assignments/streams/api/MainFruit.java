package streams.api;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainFruit 
{

	public static void main(String[] args) 
	{
		List<Fruit> fruit = new ArrayList<Fruit>();
		fruit.add(new Fruit("Apple",120,30,"Red"));
		fruit.add(new Fruit("Banana",40,10,"Yellow"));
		fruit.add(new Fruit("Grapes",60,50,"Green"));
		fruit.add(new Fruit("Straberry",80,10,"Red"));
		fruit.add(new Fruit("Papaya",110,30,"Yellow"));
		List<String> list = fruit.stream().filter(c->c.calories<100).map(n->n.name).collect(Collectors.toList());
		for(String s:list)
		{
			System.out.println(s);
		}		
	}	
}
