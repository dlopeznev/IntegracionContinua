import static org.junit.Assert.*;


public class Test {

	String strComparacion = "";
	Componente comp = new Componente();
	
	@org.junit.Test
	public void test1() {
		
		strComparacion = "Me prestastes un lapiz y";
		assertEquals(comp.dameAlgo(strComparacion), strComparacion + " te lo devuelvo");
	}
	
	@org.junit.Test
	public void test2() {
		strComparacion = "Te robe un billete de 100 pesos y no";
		assertEquals(comp.dameAlgo(strComparacion), strComparacion + " te lo devuelvo");

	}
	
	@org.junit.Test
	public void test3() {
		strComparacion = "Me enviastes un mensaje y";
		assertEquals(comp.dameAlgo(strComparacion), strComparacion + " te lo devuelvo");

	}
	
	@org.junit.Test
	public void test4() {
		strComparacion = "Me tirastes un proyectil y";
		assertEquals(comp.dameAlgo(strComparacion), strComparacion + " te lo devuelvo");

	}
	
	@org.junit.Test
	public void test5() {
		strComparacion = "Me prestastes tu cargador y";
		assertEquals(comp.dameAlgo(strComparacion), strComparacion + " te lo devuelvo");

	}
	
	@org.junit.Test
	public void test6() {
		strComparacion = "No se que mas poner, por eso";
		assertEquals(comp.dameAlgo(strComparacion), strComparacion + " te lo devuelvo");

	}
	
	
}
