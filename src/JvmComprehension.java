public class JvmComprehension { // Система подгружает класс, вызывая ClassLoader

	public static void main(String[] args) { // В Stack Memory создаётся frame (кадр) main()
		int i = 1;                      // 1 Переменная i со значением 1 кладется в frame main() в Stack Memory
		Object o = new Object();        // 2 Сначала выполняется new Object. В области памяти Heap (куча) создаётся объект ссылочного типа
		// данных Object. Ссылка на Object присваивается переменной 'o', которая кладется в Stack Memory.
		Integer ii = 2;                 // 3 Значение 2 кладется в Heap, ссылка на которое создается в Stack Memory с именем ii
		printAll(o, i, ii);             // 4 В Stack Memory создаётся frame printAll()
		System.out.println("finished"); // 7 Создаётся новый фрейм, в который передаётся ссылка на объект, созданный в Heap
	}

	private static void printAll(Object o, int i, Integer ii) { // Во фрейме printAll() создаются ссылки на 'o', 'i', 'ii'
		Integer uselessVar = 700;                   // 5 Значение 700 кладется в Heap, ссылка на которое создается в Stack Memory с именем uselessVar
		System.out.println(o.toString() + i + ii);  // 6 Создаётся новый фрейм, куда передаётся конкатенация переменных и возрата метода toString()
	}
}
