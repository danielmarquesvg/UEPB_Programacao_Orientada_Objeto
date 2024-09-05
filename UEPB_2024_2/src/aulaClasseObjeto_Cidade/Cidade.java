package aulaClasseObjeto_Cidade;

public class Cidade {
	
	//atributos
	String nome;
	double habitantes;
	double longitude;
	double latitude;
	double area;
	
	//Construtor
	public Cidade(String nome, double habitantes, double longi, double lat, double area) {
		this.nome = nome;
		this.habitantes = habitantes;
		this.longitude = longi;
		this.latitude = lat;
		this.area = area;
	}
	
	//Métodos
	public double densidadeDemografica(double hab, double area) {
		System.out.println("Habitantes = "+hab);
		System.out.println("Area = "+area);
		double densidade = hab / area;
		System.out.println("Densidade = "+densidade);
		return densidade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double distanciaEntreCidade(Cidade cidade2) {
		
		double subtracaoLatitudes = Math.pow(this.latitude - cidade2.latitude, 2);
		double subtracaoLongitudes = Math.pow(this.longitude - cidade2.longitude, 2);
		double soma = subtracaoLatitudes + subtracaoLongitudes;
		double distancia = Math.sqrt(soma);
		
		return distancia;
	}
	
	
	
	
	
	
	
	
	
	
	

}
