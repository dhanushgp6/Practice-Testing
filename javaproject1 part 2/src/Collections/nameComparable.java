package Collections;
import java.util.Comparator;

public class nameComparable implements Comparator<student2>{
	@Override
	public int compare(student2 s1,student2 s2) {
		return s1.sname.compareTo(s2.sname);
		
	}

}
