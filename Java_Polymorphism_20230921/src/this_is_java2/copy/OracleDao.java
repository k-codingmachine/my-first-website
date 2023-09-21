package this_is_java2.copy;

public class OracleDao extends DataAccessObject{

	@Override
	public void select() {
		System.out.println("oracle select2");
	}

	@Override
	public void insert() {
		System.out.println("oracle insert2");
	}

	@Override
	public void update() {
		System.out.println("oracle update2");
	}

	@Override
	public void delete() {
		System.out.println("oracle delete2");
	}

	

}
