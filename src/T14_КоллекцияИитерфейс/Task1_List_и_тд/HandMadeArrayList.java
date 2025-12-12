package T14_КоллекцияИитерфейс.Task1_List_и_тд;

public class HandMadeArrayList<T> {
    private int size = 0;
    private Object[] elements;

    public HandMadeArrayList() {
        this.elements = new Object[10];
    }

    /**
     * Сначала проверяем, достиг ли размер массива вместимости.
     * Если достиг — увеличиваем вместимость, иначе сразу добавляем элемент
     */
    public void add(T newElement) {
        // Допишите проверку
        if (elements.length == size) {
            grow();
        }

        Object[] newElements = new Object[elements.length + 1];
        /* Допишите код, который добавит очередной элемент в массив
           и увеличит размер массива на единицу.*/
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Element with index " + index + " does not exist");
        }
        return (T) this.elements[index];
    }

    /**
     * Заменяем текущий массив элементов elements на новый с вместимостью +50%
     */
    private void grow() {
        // Новый массив
        Object[] newArray = new Object[elements.length + elements.length / 2];

        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }
        // Допишите цикл, который копирует все элементы из массива elements в новый массив newArray
        // Копируем элементы из старого массива в новый

        // Возвращаемый новый массив
        this.elements = newArray;
    }

    public static void main(String[] args) {
        final HandMadeArrayList<Integer> arr = new HandMadeArrayList<>();
        for (int i = 0; i < 2000; i++) {
            arr.add(i);
        }
        System.out.println(arr.size);
    }
}
