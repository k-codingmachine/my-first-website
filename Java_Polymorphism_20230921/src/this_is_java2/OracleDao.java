package this_is_java2;

public class OracleDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("oracle select");
	}

	@Override
	public void insert() {
		System.out.println("oracle insert");
	}

	@Override
	public void update() {
		System.out.println("oracle update");
	}

	@Override
	public void delete() {
		System.out.println("oracle delete");
	}

	

}
