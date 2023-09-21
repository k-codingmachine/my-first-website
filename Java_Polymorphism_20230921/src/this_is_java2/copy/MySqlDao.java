package this_is_java2.copy;

public class MySqlDao extends DataAccessObject{

	@Override
	public void select() {
		System.out.println("MySql select2");
	}

	@Override
	public void insert() {
		System.out.println("MySql insert2");
	}

	@Override
	public void update() {
		System.out.println("MySql update2");
	}

	@Override
	public void delete() {
		System.out.println("MySql delete2");
	}

	

}
