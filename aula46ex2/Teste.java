package aula46ex2;

public class Teste {

	public static void main(String[] args) {
		
		Cilindro cl = new Cilindro();
		cl.setAltura(3);
		cl.setRaio(2);
		cl.setNome("Cilindro");
		
		Quadrado q = new Quadrado();
		q.setLado(2);
        q.setNome("Quadrado");
		
		Piramide p = new Piramide();
		p.setAltura(3);
        p.setApotema(4);
        p.setArestaBase(2);
        p.setNumPoliBase(4);
        p.setBase(q);
        p.setNome("Piramide");
		
		Cubo cb = new Cubo();
		cb.setAresta(3);
		cb.setNome("Cubo");
		
		Circulo c = new Circulo();
		c.setRaio(2);
        c.setNome("Circulo");	
		
		Triangulo t = new Triangulo();
		t.setAltura(2);
        t.setBase(3);
        t.setNome("Triangulo");
        
        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        figuras[0] = cl;
        figuras[1] = q;
        figuras[2] = p;
        figuras[3] = cb;
        figuras[4] = c;
        figuras[5] = t;
        
        for(FiguraGeometrica figura : figuras) {
        	System.out.println("----------------");
            System.out.println(figura.getNome());
            
            if (figura instanceof Figura2D){
                Figura2D f2d = (Figura2D) figura;
                System.out.println(f2d.calcularArea());
            }
            
            if (figura instanceof Figura3D){
                Figura3D f3d = (Figura3D) figura;
                System.out.println(f3d.calcularArea());
                System.out.println(f3d.calcularVolume());
            }
        }
		

	}

}
