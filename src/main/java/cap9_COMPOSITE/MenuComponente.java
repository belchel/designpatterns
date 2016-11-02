package cap9_COMPOSITE;

public abstract class MenuComponente {
	String getNome(){
		return null;};
	String getDesc(){
		return null;};
	String getPreco(){
		return null;};
	void show(){}; 
	void add(MenuComponente comp){};
	void remove(MenuComponente comp){};
	MenuComponente getChild(int a){
		return null;};
}
