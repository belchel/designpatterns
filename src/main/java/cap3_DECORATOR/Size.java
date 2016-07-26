package cap3_DECORATOR;

public enum Size{
	TALL(0.5f),
	GRANDE(0.7f),
	VENTI(1f);
 private float valor ;
 Size(float f){
	valor = f;
}
 float getValor(){
	 return valor;
 }
};
