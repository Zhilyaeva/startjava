public class JaegerTest {
	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger();
		jaegerOne.setModelName("Horizon Brave");
		jaegerOne.setMark("Mark-1");
		jaegerOne.setOrigin("China");
		jaegerOne.setHeight(72.54f);
		jaegerOne.setWeight(7.890f);
		jaegerOne.setSpeed(8);

		System.out.println("Робот №1");
		System.out.println("Модель робота: " + jaegerOne.getModelName());
		System.out.println("Марка робота: " + jaegerOne.getMark());
		System.out.println("Страна производитель: " + jaegerOne.getOrigin());
		System.out.println("Размер робота: " + jaegerOne.getHeight() + "м");
		System.out.println("Вес робота: " + jaegerOne.getWeight() + "т");
		System.out.println("Скорость робота: " + jaegerOne.getSpeed());
			
		Jaeger jaegerTwo = new Jaeger();
		jaegerTwo.setModelName("Tacit Ronin");
		jaegerTwo.setMark("Mark-1");
		jaegerTwo.setOrigin("Japan");
		jaegerTwo.setHeight(74.37f);
		jaegerTwo.setWeight(7.450f);
		jaegerTwo.setSpeed(8);

		System.out.println(" ");
		System.out.println("Робот №2");
		System.out.println("Модель робота: " + jaegerTwo.getModelName());
		System.out.println("Марка робота: " + jaegerTwo.getMark());
		System.out.println("Страна производитель: " + jaegerTwo.getOrigin());
		System.out.println("Размер робота: " + jaegerTwo.getHeight() + "м");
		System.out.println("Вес робота: " + jaegerTwo.getWeight() + "т");
		System.out.println("Скорость робота: " + jaegerTwo.getSpeed());
	}
}