public class Person{
	private String nameF;
	private String nameL;
	private char Sex;
	private int Age;
	
		public String getPersonInfo(){
			return "The person " + nameF + " " + nameL + "\n"
			+ "is " + Sex + " and they are " + Age + " years old.";
		}
		public void setFirst(String first){
			nameF = first;
		}
		public String getFirst(){
			return nameF;
		}
		public void setLast(String last){
			nameL = last;
		}
		public String getLast(){
			return nameL;
		}
		public void	setSex(char s){
			Sex = s;
		}
		public char getSex(){
			return Sex;
		}
		public void setAge(int a){
			Age = a;
		}
		public int getAge(){
			return Age;
		}
}