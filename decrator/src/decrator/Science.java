package decrator;

public class Science extends GirlDescription {
	private String mScienceName = "";
	private Girl girl;

	public Science(String name, Girl g){
		mScienceName = name;
		girl = g;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return girl.getDecrator()+" like "+mScienceName;
	}
}
