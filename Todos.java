import java.util.Objects;

public class Task {
    protected int id;

    public Task(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    public class Todos {

        private Task[] tasks = new Task[0]; // <- тут будут все задачи

        /**
         * Вспомогательный метод для имитации добавления элемента в массив
         * @param current Массив, в который мы хотим добавить элемент
         * @param task Элемент, который мы хотим добавить
         * @return Возвращает новый массив, который выглядит как тот, что мы передали,
         * но с добавлением нового элемента в конец
         */
        private Task[] addToArray(Task[] current, Task task) {
            Task[] tmp = new Task[current.length + 1];
            for (int i = 0; i < current.length; i++) {
                tmp[i] = current[i];
            }
            tmp[tmp.length - 1] = task;
            return tmp;
        }

        /**
         * Метод добавления задачи в список дел
         * @param task Добавляемая задача
         */
        public void add(Task task) { // <- вот здесь в параметре может лежать объект и вида SimpleTask, и вида Epic, и вида Meeting
            tasks = addToArray(tasks, task);
        }

        public Task[] findAll() {
            return tasks;
        }
    }

}
