public class Jaeger {
	
	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int speed;
	
	public boolean drift() {
	System.out.println("Режим дрифт запущен!");
	return true;
	}

	public void move() {
	System.out.println("Вы прошли 10 шагов.");
	}

	public Jaeger(String modelName, String mark, String origin, float height, float weight, int speed) {
	System.out.println("Модель робота: " + modelName);
	System.out.println("Марка робота: " + mark);
	System.out.println("Страна производитель: " + origin);
	System.out.println("Размер робота: " + height + "м");
	System.out.println("Вес робота: " + weight + "т");
	System.out.println("Скорость робота: " + speed);
	drift();
	move();
	System.out.println(" ");
	}
}